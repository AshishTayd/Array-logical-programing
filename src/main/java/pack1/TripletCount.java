package pack1;

import java.util.*;

public class TripletCount {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int n = arr.length;

        System.out.println("Number of triplets: " + countTriplets(arr, n));
    }

    public static int countTriplets(int[] arr, int n) {
        int count = 0;

        // First, sort the array
        Arrays.sort(arr);

        // Fix the third element (the sum) and try to find two numbers before it
        for (int i = n - 1; i >= 0; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
