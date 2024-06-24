package com.pooja.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

int[] arr = {20,10,28,39,-45,69,24,-40,60};
int target = 10;
        System.out.println(linearSearch(arr, target, 1,4));

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
         //  run for loop
        for(int index = start; index <= end; index++){

            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return-1;
    }


}
