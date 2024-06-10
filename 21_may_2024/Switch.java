package com.pooja;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        String fruits = in.next();
//
//         switch (fruits) {
//
//            case "Mango":
//                System.out.println("King of Fruits.");
//
//                break;
//            case "Apple":
//                System.out.println("Sweet red Fruits.");
//                break;
//
//            case "Orange":
//                System.out.println("Round Fruits.");
//                break;
//            case "Grapes":
//                System.out.println("Small fruits.");
//                break;
//            default:
//                System.out.println("please Enter valid fruits.");
//        }

        //2nd method
//        String fruits = in.next();
//        switch(fruits){
//            case "Mongo" -> System.out.println("");
//            case "Apple" -> System.out.println("");
//            case "Orange" -> System.out.println("");
//            case "Grapes" -> System.out.println("");
//          default -> System.out.println("Please Enter a valid fruits");
//
//        }



       // 1st method

//        int day = in.nextInt();
//
//        switch(day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please Enter Valid Day: ");
//
//        }



//   // 2nd method

//        int day = in.nextInt();
//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Please Enter Valid Day: ");
//        }

     // 3rd method
//
//        int day = in.nextInt();
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("This is Weekday.");
//                break;
//            case 6:
//            case 7:
//                System.out.println("This is Weekend.");
//                break;
//
//        }


        // 4rh method

//        int day = in.nextInt();
//        switch(day){
//
//            case 1, 2,3,4,5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//        }

        // 5th method
//        int day = in.nextInt();
//            switch(day) {
//
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");
//
//
//
//        }

        int empID = in.nextInt();
        String department = in.next();
        switch(empID){
            case 1:
                System.out.println("Pooja");
                break;
            case 2:
                System.out.println("Bulbul");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch(department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department enter");

                }
                break;
            default:
                System.out.println("Enter correct ID");
        }

    }
}
