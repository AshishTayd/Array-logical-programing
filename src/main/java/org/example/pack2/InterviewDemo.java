package org.example.pack2;

import java.util.Arrays;

public class InterviewDemo {
    //Write a Java program to sort an array of strings that contain numbers
    // (e.g., "3", "1", "10", "2"). The numbers should be sorted in ascending order.

    public static void main(String[] args) {

        String[] numbers ={"3","1","10","2"};
        String[] sorted =Arrays.stream(numbers).map(Integer::parseInt).sorted()
            .map(String::valueOf).toArray(String[]::new);

        System.out.println("Sorted String"+Arrays.toString(sorted));
    }


}
