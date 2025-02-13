package org.example.pack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassA {


    public String meth1(){

        String name="Java is Awesome";
        String arr[]=name.split(" ");
        String s="";
        for(int i= arr.length-1;i>=0;i--)
        {
            s+=arr[i]+" ";
        }
        System.out.println("hi");
        return s;

    }
    public void meth2(){
        System.out.println(10);
        String b=meth1();
        System.out.println(b);
    }


    public static void main(String[] args) {

        new ClassA().meth2();

        if(1==1){
            System.out.println(true);
        }else {
        System.out.println(false);}
    }
}
