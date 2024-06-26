package com.pooja.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

//int[]arr = {1,2,3,4,10,15,16,19,20,36,40,45,50};
int []arr = {80,65,60,50,45,34,30,25,20};
//int target = 40;
        int target = 50;
int ans = orderAgnosticBS(arr, target);
System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
         boolean isAsc = arr[start] < arr[end];
//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        while(start <= end){
//            int mid = (start + end)/2;    //find the middle element
            int mid = start + (end - start)/2;

       if(arr[mid] == target){
           return mid;
     }
       if(isAsc){
           if(target < arr[mid]) {
               end = mid - 1;
           }else {
               start = mid + 1;
           }
       }else{
           if(target > arr[mid]) {
               end = end - 1;
           }else {
               start = mid + 1;
           }
            }



        }return -1;

    }
}

