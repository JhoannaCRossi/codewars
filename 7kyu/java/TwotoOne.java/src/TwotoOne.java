//Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

 //       Examples:
//        a = "xyaabbbccccdefww"
 //       b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"

//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

import java.util.*;

public class TwotoOne {
    public static void main(String[] args) {
        String result = logest("loopingisfunbutdangerous", "lessdangerousthancoding");
        System.out.printf(result);
    }

    public static String logest(String s1, String s2) {
        List<String> listS1 = Arrays.asList(s1.split(""));
        List<String> listS2 = Arrays.asList(s2.split(""));

        Set<String> united = new TreeSet<>(listS1);
        united.addAll(listS2);
        String result = "";
        for (String s: united){
            result+=s;
        }
        return result;
    }
}
