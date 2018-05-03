package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Enter x: ");
        int x=scan.nextInt();
        System.out.println("Enter y:");
        int y=scan.nextInt();
        System.out.println("Enter z: " + "\n");
        int z=scan.nextInt();
        System.out.println("Average is:"+"=" + (x+y+z)/2);


    }
}
