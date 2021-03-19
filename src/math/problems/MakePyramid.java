package math.problems;

import java.util.Scanner;

public class MakePyramid {


        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int x,y,z, number;
        Scanner user_input;
        public MakePyramid()
    {
        user_input = new Scanner(System.in);
        System.out.println("Enter number of layers for Pyramid: ");
        number = user_input.nextInt();

        for(x=1; x<=number; x++) {

            for(y=x; y<number; y++)
                System.out.print(" ");

            for(z=1; z<(x*2); z++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        MakePyramid pyr = new MakePyramid();




    }
  }
