package collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @className:HashMapTest
 * @author：jirumutu
 * @date:2019/11/29
 * @description:TODO
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("","12");
        map.put("","124");
       // map.put("","");
        map.put(null,null);

        System.out.println("map.get() = " + map.get(""));
        System.out.println("map.get() = " + map.get(null));


        Hashtable hashtable = new Hashtable();
        hashtable.put("","");
        hashtable.put("","123");
        hashtable.put(null,null);


        //System.out.println("hashtable.get(\"\") = " + hashtable.get(""));
        System.out.println("hashtable.get(\"\") = " + hashtable.get(null));
    }
}
