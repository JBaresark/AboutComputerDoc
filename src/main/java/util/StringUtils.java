package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @className:StringUtils
 * @author：jirumutu
 * @date:2019/7/25
 * @description:TODO
 */
public class StringUtils {

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[str]
      * @return:java.lang.String
      * @description:替换字符串中的所有空格
    */
    public static String replaceAllSpaces(String str){
        return str.replaceAll(" ","");
    }

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[c]
      * @return:boolean
      * @description:判断是否是字母
    */
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[c]
      * @return:boolean
      * @description:判断是否是中文
    */
    public static boolean isChinese(char c) {
        return c >= 0x4e00 && c <= 0x9fa5;
    }

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[c]
      * @return:boolean
      * @description:判断是否是数字
    */
    public static boolean isNumberChar(char c) {
        return c >= '0' && c <= '9';
    }

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[c]
      * @return:boolean
      * @description:判断是否是下划线或者连接符
    */
    public static boolean isHyphensOrUnderscores(char c){
        return c == '-' || c == '_';
    }

    /**
      * @author:jirumutu
      * @date:2019/7/25
      * @param:[c]
      * @return:boolean
      * @description:是否是特殊字符
    */
    public static boolean isSpecialChar(char c) {
        return !isLetter(c) && !isNumberChar(c) && !isHyphensOrUnderscores(c);
    }


    /**
     * @author jirumutu
     * @description 校验特殊字符
     * @date 2022/6/22 14:36
     * @param str
     * @return boolean
     **/
    public static boolean isSpecialChar(String str){
        String regEx="[_`~@!#$%^&*()+=|{}';:,>.|\\?/<~·！￥……（）——【】|、：；”‘“;。《》a-zA-Z]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(str);
        return m.find();
    }

    public static IsSpecialChar String2Char(String str){
        IsSpecialChar isSpecialChar = new IsSpecialChar();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(isSpecialChar(c)){
                str = String.valueOf(c);
                isSpecialChar.setFlag(true);
                isSpecialChar.setStr(str);
                return isSpecialChar;
            }
        }
        return isSpecialChar;
    }

    public static void main(String[] args) {
       /* String str = "   2 r vf   ";
        System.out.println("str = " + str.length());
        str = replaceAllSpaces(str);
        System.out.println("str = " + str.length());*/

        String str1 = "  3_4-    ggh_";
        str1 = replaceAllSpaces(str1);
        if(String2Char(str1).isFlag()){
            System.out.println("包含了不允许输入的字符: " + String2Char(str1).getStr());
        }

        //List<Integer> statsList =  Lists.newArrayList(2,5,6,7);  guaua包
    }
}
