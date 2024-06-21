package com.pooja;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //Primitive Array
        int[] arr = new int[6];
        arr[0] = 23;
        arr[1] = 40;
        arr[2] = 200;
        arr[3] = 50;
        arr[4] = 90;
        arr[5] = 80;

        // Printing the initial value at index 2
        System.out.println(arr[2]); // This will print 200

        // Input using loops
//         for (int i = 0; i < arr.length; i++) {
//            arr[i] = s1.nextInt();

//            // Print each element in the array
//         System.out.println("Element at index " + i + ": " + arr[i]);

//        }

        // Printing the entire array

//       System.out.println(Arrays.toString(arr));


        // Array of  OBJECT
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = s1.next();
        }

        // Printing the entire string array
        System.out.println(Arrays.toString(str));
        str[1] = "Pooja";
        System.out.println(Arrays.toString(str));
    }
}



