package com.pooja;

public class OverLoading {
    public static void main(String[] args) {
        fun(50);
        fun("Pooja");
        int ans = sum(4, 5, 6);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
