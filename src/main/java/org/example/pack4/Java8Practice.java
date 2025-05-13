package org.example.pack4;

import java.util.ArrayList;
import java.util.List;

public class Java8Practice {
    public static void main(String[] args){
        List<Integer> li=new ArrayList<>();

        li.add(10);
        li.add(20);
        li.add(30);


        li.stream().sorted();
        System.out.println();
    }
}
