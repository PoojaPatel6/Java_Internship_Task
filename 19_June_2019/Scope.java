package com.pooja;

public class Scope {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        String name = "Pooja";
        {
//           int  a = 70;
            a = 100;  //reassign a original value
            System.out.println(a);
            name = "Anshi";
            System.out.println(name);
            int c = 90;
        }
        int c = 600;
//        System.out.println(c);
        System.out.println(a);
        System.out.println(name);


        //Scoping in for loop
        for(int i = 0; i<4; i++){
//            System.out.println(i);
            int num = 80;
             a = 10000;
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num = 60;
        System.out.println(num);
        System.out.println(marks);
    }
}
