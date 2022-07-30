//Complete the solution so that the function will break up camel casing, using a space between words.
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BreakCamelCase {
    public static void main(String[] args) {
        String output = camelCase("identifier");
        System.out.println(output);
    }

    public static String camelCase(String input) {
        if(input == null || input.equals("")){
            return input;
        }
        String output= "";

        List<Character> list = new ArrayList<Character>();
        for (char c: input.toCharArray()) {
            if(c>=97 && c<=122){
                list.add(c);
            }else{
                char espacio = 32;
                list.add(espacio);
                list.add(c);
            }
        }
        output = convertString(list);
        return output;
    }


    private static String convertString(List<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());

        for (Character c: list) {
            builder.append(c);
        }
        return builder.toString();
    }
}
