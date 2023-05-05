package datatype;

/**
 * @className:PackingUnpacking
 * @author：jirumutu
 * @date:2019/7/25
 * @description:装箱和拆箱
 * 在通过valueOf方法创建Integer对象的时候，如果数值在[-128,127]之间，
 * 便返回指向IntegerCache.cache中已经存在的对象的引用；否则创建一个新的Integer对象
 * Integer i = 10;  //装箱
 * int n = i;   //拆箱
 */
public class PackingUnpacking {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
