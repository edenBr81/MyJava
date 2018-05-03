package com.company;

public class Mahar1 {

    /*Write a function named largestDigit that returns the largest digit of its integer argument.For example
    *  largestDigital(3856) returns 8 and largestDigit(-65566) returns 6.
     *  The Function signature is
     *  int largestDigit (int n)
     *  Hint: use modelo base 10 arithemetic and integer divisio*/


            public static void main(String args[]) {
                System.out.println(largestDigit(3185));
                System.out.println(largestDigit(-65665));

            }


            private static int largestDigit(int n){
                int remainder;
                int largestDigit=0;
                n=Math.abs(n);

                while(n>0){
                    remainder=n%10;

                    largestDigit=remainder>largestDigit?remainder:largestDigit;
                    n=n/10;
                }

                return largestDigit;



            }
        }




