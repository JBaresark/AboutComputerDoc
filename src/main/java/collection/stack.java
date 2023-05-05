package collection;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Objects;

/**
 * @className:stack
 * @author：jirumutu
 * @date:2019/11/12
 * @description:TODO
 */
public class stack {

    public static void main(String[] args) {

        System.out.println("args = " + args);

    }

    ArrayList list = new ArrayList();

    //出栈
    public Object pop(){
        if(list.isEmpty()){
            return "此栈为空";
        }
        Object obj = list.get(list.size()-1);
        list.remove(list.size()-1);
        return obj;
    }
}
