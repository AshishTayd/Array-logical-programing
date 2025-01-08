package pack1;

import java.util.Scanner;

public class RotateArray {
    public static int[] meth1(int[] arr,int k) {
        int n = arr.length;

        // Rotate clockwise by 1
        for (Integer j = 1; j <= k; j++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }


        return arr;
    }

    public static  void  main(String[ ]args){
//        Scanner sc=new Scanner(System.in);
//        int[] array = {1, 2, 3, 4, 5};
//        int n = array.length;
//
//        // Rotate clockwise by 1
//        for(int j= sc.nextInt();j>0;j--) {
//            int last = array[n - 1];
//            for (int i = n - 1; i > 0; i--) {
//                array[i] = array[i - 1];
//            }
//            array[0] = last;
//        }
//        // Print rotated array
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
      int[] arr= new RotateArray().meth1(new int[]{1,2,3,4,5},3);
      for(int i=0;i< arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }}

