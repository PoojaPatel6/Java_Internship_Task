package com.pooja;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,56,43,75,56,78,32);
        fun();
        multiple(2, 4, "Pooja","Bulbul","Susmitha");
        demo(2,3,4);
        demo("Shreya","Priyanka");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }




static void multiple(int a, int b, String...v){

}
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
