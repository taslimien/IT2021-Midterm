package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /* Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */
        premute("ABC");
    }
    public static void  premute (String full){
        if (full == null || full.length() == 0){
            return;
        }
        premute("", full);
    }
    public static void premute(String prefix, String remaining){
        if (remaining.length() == 0){
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++){
            premute(prefix + remaining.charAt(i), remaining.substring(0, i) +
                    remaining.substring(i + 1, remaining.length()));
        }
    }
}
