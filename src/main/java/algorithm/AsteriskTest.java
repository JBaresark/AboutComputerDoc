package algorithm;

/**
 * @className:AsteriskTest
 * @author：jirumutu
 * @date:2019/11/29
 * @description:使用星号打印各种图形
 */
public class AsteriskTest {
    public static void main(String[] args) {
        InvertedTriangle("*");
    }

    private static void InvertedTriangle(String str){
        forMethod(str,true);
        forMethod(str,false);
        System.out.println("  *");
        forMethod(str,false);
        forMethod(str,true);

    }

    private static void forMethod(String str,Boolean flag){
        int len = 4;
        if(flag){
            len = 6;
        }
        for (int i = 0; i < len; i++) {
            if(i == 0 && !flag){
                System.out.print(" " + str);
            }else {
                System.out.print(str);
            }
        }
        System.out.println();
    }

}
