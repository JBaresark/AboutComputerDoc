package algorithm;

import util.DateUtils;
import java.util.*;

/**
 *
 */

public class EmployeInfoSortByAgeTest {

    public static void main(String[] args) {
        Map<String,Employe> map = new HashMap<>();
        int low = 20;
        int high = 60;

        for(int i = 10000; i <= 10050; i++){
            Integer age = ((int)(Math.random() * (high - low))) + low;
            Employe employe = new Employe();
            employe.setAge(age);
            employe.setEntryTime(DateUtils.randomDate("2000-01-01", "2022-01-01"));
            employe.setCode(String.valueOf(i));
            map.put(String.valueOf(i), employe);
        }
        sortInfo(map);

    }

    /**
     * 35岁以上的员工按照入职时间逆序排序
     * @param map
     * @return
     */
    private static List<Employe> sortInfo(Map<String,Employe> map){
        Iterator iterator = map.keySet().iterator();
        ArrayList<Employe> list = new ArrayList();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            Employe employe = map.get(key);
            if(employe.getAge() >= 35){
                list.add(employe);
            }

        }
        list.sort(Comparator.comparing(Employe::getEntryTime).reversed());
        for(Employe employe : list){
            System.out.println("EMP:" + employe.getCode() + " 入职时间：" +
                    DateUtils.date2String(employe.getEntryTime(), "yyyy-MM-dd") +
                    " 年龄：" + employe.getAge());
        }
        System.out.printf("size:" + list.size());
        return list;
    }

}
