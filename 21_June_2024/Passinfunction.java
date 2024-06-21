package com.pooja;

import java.util.Arrays;

public class Passinfunction {
    public static void main(String[] args) {
int []nums = {4,8,6,10,12,15};
        System.out.println(Arrays.toString(nums));
        change(nums);
    }

    static void change(int[] arr){
        arr[0] = 20;
    }
}
