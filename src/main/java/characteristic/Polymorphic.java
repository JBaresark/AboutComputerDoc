package characteristic;

import java.util.Vector;

/**
 * @className:Polymorphic
 * @author：jirumutu
 * @date:2019/11/8
 * @description:多态练习
 * 多态是同一个行为可以实现不同得形式和表态
 * 比如：动物吃东西，那么同样是动物得猫和狗吃的东西却不一样。
 * 猫更喜欢吃鱼，但吃不了牛骨头，狗更喜欢吃骨头，但猫不行。
 *
 * 多态条件:类必须是继承关系、方法必须是重写，父类引用指向子类
 *
 * 抽象类：抽象类中可以定义有方法体得方法，也可以定义没有方法体得方法。
 * 通过子类得引用可以调用抽象类得任何方法。
 * 抽象类可以实例化，但方法要重写，实例化之后在方法体内也可以重新定义方法。
 */
public class Polymorphic {

    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        //a.eat();//1

        //向上转型
        Cat cat = (Cat)a;
        String s = cat.eat("");
       // System.out.println("s = " + s);//2

        Dog dog = new Dog();
        String str = dog.work();
        System.out.println("str = " + str);//3
/*
        //抽象类可以实例化，但方法要重写
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("dog = " + str);//4
                work();
            }
            void work(){
                String work = cat.work();
                System.out.println("cat = " + work);//5
            }
        };

        animal.eat();
        String aa = ((Cat) a).work();
        System.out.println("aa = " + aa);
        String ss = cat.work();
        System.out.println("ss = " + ss);

        animal.test("animal");
        a.test("animal a");
        cat.test("animal cat");
        dog.test("dog");*/

    }


}

abstract class  Animal{
    public Animal() {
    }

    public Animal(String str) {
        System.out.println("Animal " + str);
    }

    abstract void eat();
    void test(String str){
        System.out.println("str = " + str);
    }
}

class Cat extends Animal{
    public Cat() {
        super("cat");
        System.out.println("cat");
    }

    void eat(){
        System.out.println("cat eat");
    }

    String eat(String s){
        return "吃鱼";
    }

    String work(){
        return "抓老鼠";
    }
}

class Dog extends Animal{
    public Dog() {
        super("dog");
        System.out.println(" dog  ");
    }

    void eat(){
        System.out.println("dog eat");
    }

    String work(){
        return "看家";
    }


}
