package Backtracking13;

import java.util.*;
public class Permutation {
    static void permutation(int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            // swap
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            // recursion
            permutation(arr, index + 1);
            // backtrack
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 0);
    }
}