package com.java.basico.ED1.test;

public class TesteFatorial {
    public static void main(String[] args) {
        System.out.println(fat(5));
        System.out.println(Math.pow(2,3));
    }

    public static double fat(double num){
        double result = 1;
        for(double i = num; i > 1; i--){
            result *= i;
        }
        return result;
    }
}
