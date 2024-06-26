package com.pooja.BinarySearch;

public class Binarysearch {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,10,15,16,19,20,36,40,45,50};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
   // return -1 if it does not exist
static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
//            int mid = (start + end)/2;    //find the middle element
          int mid = start + (end - start)/2;
          if(target < arr[mid]){
              end = mid - 1;

          }else if(target > arr[mid]){
              start = mid + 1;
          }else{
              return mid;
          }


        }return -1;
}

}
