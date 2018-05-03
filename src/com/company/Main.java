package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         int x=25; int y=5;
//        int firstnumber=25;
//        int secondnumber=5;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter x:");
        int firstnumber=scan.nextInt();

//        scan.nextLine();
        System.out.println("Enter y:");
        int secondnumber=scan.nextInt();
//        scan.nextLine();

        System.out.println(firstnumber + "+" +secondnumber + "=" + (firstnumber + secondnumber));
        System.out.println(firstnumber + "-" +secondnumber + "=" + (firstnumber-secondnumber));
        System.out.println(firstnumber + "x" +secondnumber + "=" + (firstnumber *secondnumber));
        System.out.println(firstnumber + "/" +secondnumber + "=" + (firstnumber /secondnumber));
        System.out.println(firstnumber + "mod" +secondnumber + "=" + (firstnumber %secondnumber));


    }
}
