package com.pooja;
public class Shadowing {

    static int x = 80; // it will be shadow
    public static void main(String[] args) {

        System.out.println(x); // 80
        int x;
        x = 40;   // class variable at line 4 is shadowed by this
        System.out.println(x);  //40

        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
