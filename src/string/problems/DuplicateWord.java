package string.problems;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */


        findDuplicateWords("java is a programming language. java is also an island of indonesia. java is widely used language.");

    }

    public static void findDuplicateWords(String inputString){
        String words[] = inputString.split(" ");

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for(String word: words){

            if (wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(), wordCount.get(word)+1);

            }else {
                wordCount.put(word, 1);
            }

            Set<String> wordsInString = wordCount.keySet();

            for (String word1: wordsInString){
                if(wordCount.get(word)>1){
                    System.out.println(word + " : " + wordCount.get(word));
                }


            }
        }

    }

}
