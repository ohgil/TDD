package com.tdd.calc;

public class CalcApp {
    public static int run(String exp) {
        String[] bits = exp.split(" \\+ ");
        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[0]);
        return a + b;
    }
}