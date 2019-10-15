package com.company;
public class divBy13and7and5 {
    public static void main(String[] args) {
        int number = 1;
        int iter = 0; // Iteration Number
        System.out.println("while condition n=14: " + (14%7==0));
        System.out.println("long while condition: " + (number < 100 & number % 13 == 0 || number % 7 == 0 || number % 5 == 0));
        while (number < 22) {
            System.out.print("iter: " + iter + " number:"+ number);
            number++;
            if (number % 13 == 0 | number % 7 == 0 | number % 5 == 0) {
                System.out.print("   iter: " + iter + " number:"+ number);
            }
            System.out.println();
            iter++;
        }
    }
}