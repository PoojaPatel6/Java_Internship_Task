package com.pooja;
import java.util.Scanner;

public class MultidimentionArray {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
//        1 2 3
//        4 5 6
//        7 8 9

//
//       int[][]arr = new int[3][];
//       int[][] arr2D = {
//               {1, 2, 3},     // 0th index
//               {4, 5},        // 1st index
//               {6, 7, 8, 9}   // 2nd index
//       };
       int[][] arr = new int [3][2];
        System.out.println(arr.length); // no of rows


        for(int row = 0; row < arr.length; row++){
            // for each col in every row///

            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

              for(int row = 0; row< arr.length; row++){
 //            for(int col = 0; col< arr[row].length; col++){
 //                System.out.println(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
