package algorithm;

/**
 * @className:RecursionTest
 * @author：jirumutu
 * @date:2019/11/29
 * @description:递归方法测试
 */
public class RecursionTest {
    public static void main(String[] args) {
        String str = "abcdedcba";
        boolean flag = checkBackDoc(str,0,str.length()  );
        System.out.println(flag);

        System.out.println("fribonacci(30) = " + fribonacci(2));

        int disks = 3;
        doTowers(disks,'A','B','C');

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + "！ = " + factorial(i));
        }
    }

    /**
      * @author:jirumutu
      * @date:2019/11/29
      * @param:[str, start, length]
      * @return:boolean
      * @description:回文测试
    */
    private static boolean checkBackDoc(String str, int start, int length) {
        if(length<=1)
            return true;
        else if(str.toCharArray()[start]==str.toCharArray()[length-1]){
            return checkBackDoc(str,start+1,length-1);
        }
        return false;
    }

    /**
      * @author:jirumutu
      * @date:2019/11/29
      * @param:[n]
      * @return:int
      * @description:一列数的规则如下: 1、1、2、3、5、8、13、21、34 ，求第30位数是多少,兔子
    */
    private static int fribonacci(int n){
        if(n<=2) return 1;
        else return fribonacci(n-1) + fribonacci(n-2);

    }

    /**
      * @author:jirumutu
      * @date:2019/11/29
      * @param:[topN, from, inter, to]
      * @return:void
      * @description:汉诺塔 碟子问题
    */
    private static void  doTowers(int topN,char from,char inter,char to){
        if (topN == 1){
            System.out.println("disk 1 from " + from + " to " + to);
        }else {
            doTowers(topN-1,from,to,inter);
            System.out.println("disk  " + topN + " from " + from + " to " + to);
            doTowers(topN-1,inter,from,to);
        }
    }

    /**
      * @author:jirumutu
      * @date:2019/11/29
      * @param:[num]
      * @return:long
      * @description:阶乘问题
     * 一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
     * 亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
    */
    private static long factorial(long num){
        if(num <= 1){
            return 1;
        }else
            return num * factorial(num -1);
    }


}
