package com.pooja.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {24, 5, 2},
                {10, 23, 6, 9},
                {40, 10, 23, 30},
                {20, 4}
        };
        int target = 30;
        int[] ans = search(arr, target); // Changed type to int[]
        System.out.println(Arrays.toString(ans)); // Changed type to int[]

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) { // Changed type to int[]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
