package org.example;

import java.util.Scanner;

public class  Main {

    public int[] meth1( int [] arr) {

        int target =6;
        int a=arr[0];
        int ar[]=new int[2];
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+arr[i+1])==target){

                ar[0]=arr[i];
                ar[1]=arr[i+1];
                System.out.println("hi");

            }

        }
        return ar;
    }


    public static void main(String[] args) {


        Main ab=new Main();

     int[] x= ab.meth1(new int[]{10,2,4,5});

        for(int m:x){
            System.out.println(m);
        }
      //  System.out.println("Hello world!");
    }}
