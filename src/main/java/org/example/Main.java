package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalculator = new IntsCalculator();
        System.out.println(intsCalculator.sum(2, 2));
        System.out.println(intsCalculator.mult(10, 22));
        System.out.println(intsCalculator.pow(2, 10));
    }
}