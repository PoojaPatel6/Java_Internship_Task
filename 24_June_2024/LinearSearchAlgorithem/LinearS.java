package com.pooja.LinearSearch;

public class LinearS {
    public static void main(String[] args) {
        int[] nums = {25, 24, 86, 35, 95, 34, 46, -60, -19};
        int target = 95;

        int indexResult = linearSearch(nums, target);
        System.out.println("Index of target: " + indexResult);

        boolean existsResult = linearSearch3(nums, target);
        System.out.println("Target exists: " + existsResult);

        int elementResult = linearSearch2(nums, target);
        System.out.println("Element found: " + elementResult);
    }

    // Search in array: return index if item found, otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // If result not found return -1
        return -1;
    }

    // Search the target and return true if found, otherwise false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // Run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // If result not found return false
        return false;
    }

    // Search the target and return the element if found, otherwise return Integer.MAX_VALUE
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // If result not found return Integer.MAX_VALUE
        return Integer.MAX_VALUE;
    }
}
