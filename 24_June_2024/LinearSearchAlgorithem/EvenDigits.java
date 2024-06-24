package com.pooja.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {10,12,5,15,40,-28,50};
        System.out.println(findNumbers(nums));
        System.out.println(digits(6756));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }



    // check a number contain even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // count int digits in a number
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }


        int count = 0;
        while(num > 0){
            count++;
            num = num/10;

        }
        return count;
    }


    }


