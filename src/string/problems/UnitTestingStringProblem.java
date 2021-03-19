package string.problems;

public class UnitTestingStringProblem {

        //Apply Unit Test into all the methods in this package.

        public int square(int x){
            return x*x;

        }

        public int countA(String word){
            int count =0;
            for (int i=0; i<word.length(); i++){
                if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
                    count++;
                }
            }
            return count;

    }
}
