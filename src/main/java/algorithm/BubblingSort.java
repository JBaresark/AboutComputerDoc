package algorithm;

/**
 * @className:BubblingSort
 * @author：jirumutu
 * @date:2019/11/28
 * @description:冒泡排序
 */
public class BubblingSort {
    public static void main(String[] args) {
        int[] arry= {9,2,2,1,4,5,8,3,0,3,2};

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length-1-i; j++) {
                if(arry[j+1] > arry[j]){
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }


        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

    }
}
