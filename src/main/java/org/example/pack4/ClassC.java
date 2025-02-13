package org.example.pack4;

import org.example.pack3.ClasssX;

public class ClassC  extends ClassB {


    public  void m1(String s){


        System.out.println("hello");
    }



        public static void m2 () {


        System.out.println("111");
    }

    {
        System.out.println("hi");
    }

    public static void main(String[] args) {
//        System.out.println("hi");
//        ClassC a= (ClassC) new ClasssX();
//        new ClassC().meth1();
//        a.meth1();
        System.out.println("hhh");
        ClassB a=new ClassC();
        ClassC b=new ClassC();
        ClassC c=new ClassC();
        b.m2();
        a.m1(null);
    }
}
