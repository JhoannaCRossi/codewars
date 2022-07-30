//Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
//        Examples:
//        spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//        spinWords( "This is a test") => returns "This is a test"
//        spinWords( "This is another test" )=> returns "This is rehtona test"


import java.util.*;

public class StopGninnipsMySdroW {

    public static void main(String[]args){
        String output = spinWords("This is another test");
        System.out.println(output);
    }
    public static String spinWords(String sentence){
        if(sentence == null || sentence.equals("")){
            return sentence;
        }

        //separa en letras para contar los espacios y separar en palabras
        String[] words = sentence.split("\\p{Space}");

        for (int i = 0; i < words.length; i++) {
        //agarra las palabras que sean mayores a 5
            if(words[i].length() >= 5){
                //mando a metodo que me revierte el orden
                words[i] = guinninps(words[i]);
            }
        }
        //devuelvo en forma de cadena de string
        return String.join(" ", words);
    }

    private static String guinninps(String str) {
        // crea una lista vacía de caracteres
        List<Character> list = new ArrayList<Character>();

        // inserta todos los caracteres de la string dada en él
        for (char c: str.toCharArray()) {
            list.add(c);
        }

        // lista inversa usando `java.util.Collections` `reverse()`
        Collections.reverse(list);

        // convierte `ArrayList` en una cadena usando `StringBuilder` y lo devuelve
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }

        return builder.toString();
    }


}
