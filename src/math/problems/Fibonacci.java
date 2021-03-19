package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13,21
         */

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print Fibonacci number");
        number =sc.nextInt();

        int first =1;
        int last =0;
        System.out.println(last);
        System.out.println(first);

        int lastlast;
        for (int a = 2; a <number; a++) {
            lastlast = last;
            last = first;
            first = lastlast + last;
            System.out.println(first);

        }


    }
}
