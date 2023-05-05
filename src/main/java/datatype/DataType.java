package datatype;

import java.util.Vector;

/**
 * @className:DataType
 * @author：jirumutu
 * @date:2019/11/11
 * @description:TODO
 */
public class DataType {

    public static void main(String[] args) {
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("i1 = " + i1);

        double f = 1.222225;
        System.out.println(f);

        /**
          * Vector 类实现了一个动态数组。和 ArrayList 很相似，但是两者是不同的：
         * Vector 是同步访问的。
         * Vector 包含了许多传统的方法，这些方法不属于集合框架。
         * Vector 主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。
        */
        Vector<String> vector = new Vector();
        for (int i = 0; i < 99; i++) {
            vector.add("1"+i);
            System.out.println(i + "、vector.get(i) = " + vector.get(i));
        }
       /* for (int i = 0; i < vector.size(); i++) {
            System.out.println(i + "、vector.get(i) = " + vector.get(i));
        }*/
    }
}
