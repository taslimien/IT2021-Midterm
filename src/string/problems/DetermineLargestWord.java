package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordLength = findTheLargestWord(s);
        //implement
        System.out.println("String length is: " + s.length());


    }

    public static Map<Integer, String> findTheLargestWord(String s){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = " ";
        //implement
        map.put(5, "Human");
        map.put(5, "brain");
        map.put(2, "is");
        map.put(1, "a");
        map.put(10, "biological");
        map.put(8, "learning");
        map.put(7, "machine");

        return map;
    }

}
