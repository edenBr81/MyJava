package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter i: " );
        int num=scan.nextInt();

        for(int i=1; i<=10; i++){
        System.out.println(+num + "*" + i + "=" + i*num);

    }
}
}