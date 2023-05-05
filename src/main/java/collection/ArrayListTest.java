package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @className:ArrayListTest
 * @author：jirumutu
 * @date:2019/7/24
 * @description:TODO
 */
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        long startTime = System.currentTimeMillis();
        System.out.println("startTime = " + startTime);
        for (int i = 0;i<100000;i++) {
            list.add("第"+i+"个元素:" + i);
        }
        System.out.println(list.get(10));//第10个元素:10
        long endTime = System.currentTimeMillis();
        System.out.println("endTime = " + endTime);


        long startTime2 = System.currentTimeMillis();
        System.out.println("startTime2 = " + startTime2);
        LinkedList list1 = new LinkedList();
        for (int i = 0; i < 100000; i++) {
            list1.add("第"+i+"个元素:" + i);
        }
        System.out.println(list.get(10));//第10个元素:10
        long endTime2 = System.currentTimeMillis();
        System.out.println("endTime2 = " + endTime2);
    }
}
