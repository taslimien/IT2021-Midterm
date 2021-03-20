package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String x = "SILENT";
        String y = "LISTEN";

        char a[]= x.toCharArray();
        char b[]=y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);

        if (result == true){

            System.out.println("Strings are Anagram");
        }else {
            System.out.println("String are not Anagram");
        }

    }
}
