package com.pooja;
import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
//        int n = s1.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);
//        System.out.println(isArmstrong(n));
        for(int i = 100; i< 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }



    }
    //Print all 3 digits armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum= 0;
        while (n> 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;

  }
        return sum == original;
    }




    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int c = 2; c * c <= n; c++) {
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }
}


