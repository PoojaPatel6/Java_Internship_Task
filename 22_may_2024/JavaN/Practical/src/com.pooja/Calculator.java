package com.pooja;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while (true){

            //take operator input

            System.out.print("Enter the Operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {


                //input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {

                    ans = num1 + num2;
                }

                if (op == '-') {

                    ans = num1 - num2;
                }

                if (op == '*') {

                    ans = num1 * num2;
                }


                if (op == '/') {

                    ans = num1 / num2;
                }


                if (op == '%') {

                    ans = num1 % num2;
                }

            }else if (op == 'x' || op == 'X') {

                break;

            }else {
                System.out.println("Invalid Operations: ");
            }

                System.out.println(ans);

            }

        }


    }

