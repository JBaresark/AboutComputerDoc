package datatype;

/**
 * @className:TestOther
 * @author：jirumutu
 * @date:2019/11/12
 * @description:TODO
 */
public class TestOther {

    public static void main(String[] args) {
        String str = "1234";
        changeStr(str);
        //System.out.println(str);


        //System.out.print(new TestOther().i);//第9行


        int i =0;
        for ( foo('A'); foo('B')&&(i<2); foo('C')){
            i++ ;
            foo('D');
        }

        System.out.println(" = ====================================");
        String s1 = "runoob";
        String s2 = "runoob";
        System.out.println("s1 == s2 is:" + s1 == s2);

        System.out.println(" = ====================================");
        StringBuffer a = new StringBuffer("Runoob");
        StringBuffer b = new StringBuffer("Google");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);


        int a1 = 5;
        double a2 =(float)a1;

        //int num = 6.7;

    }
    /**--------------------------题1--------------------------------**/
    public static String changeStr(String str) {
        str = "welcome";
        return str;
    }
    /**------------------------题2----------------------------------**/
    private int i=getValue();//第2行
    private int j = 10;
    int getValue(){
        return j;
    }

    /**------------------------题3----------------------------------**/
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

}
