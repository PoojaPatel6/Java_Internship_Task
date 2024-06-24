package com.pooja.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {20,10,30,40,-29,-50,60,38};

        System.out.println(min(arr));
    }

    // suppose arr.length != 0
    // return minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
