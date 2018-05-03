package com.company;

public class Mahar2 {

    public static void main(String[] args) {

        System.out.println(isDaphneArray(new int[]{10,-2,3,-6,9}));
    }
    private static int isDaphneArray(int[]a){

        int max=a[0];
        int min=a[0];
        int indexMax=0;
        int indexMin=0;

        for(int i=1;i<a.length;i++){

          if(a[i]>max){
              max=a[i];
              indexMax=i;
          }else if( a[i]==max || a[i]==min){
              return 0;
          }else if (a[i]<min){
              min=a[i];
              indexMin=i;
          }

        }

        return indexMin>indexMax?1:0;

    }
 }
