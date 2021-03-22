package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String a = "MOM";

        String reverse = "";
        for (int i = a.length() -1; i >= 0; i--){
            reverse +=a.charAt(i);
        }

        boolean palindrome = true;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
            if (palindrome){
                System.out.println("String is Palindrome!");
            }else {
                System.out.println("String is not a Palindrome!");
            }

        }

    }
}
