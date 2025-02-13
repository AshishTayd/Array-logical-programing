package pack1;

import java.util.Scanner;

public class RotateArray {
    public static char[] meth1(char[] arr,int k) {

            char[] acrr=new char[4];

        for (Integer j = 1; j <= k; j++) {
            char last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }


        for(int j=0;j<arr.length;) {
            j += 2;
            System.out.print(arr[j]+" ");
           // System.out.println(acrr[j]);
            //System.out.println("hi");

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
      char[] arr= new RotateArray().meth1(new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},3);
      for(int i=0;i< arr.length;i++){
          System.out.print(arr[i]+" ");
      }
    }
}

