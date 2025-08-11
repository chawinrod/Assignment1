package PartA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            char menu = printMenu();
            switch (menu) {
                case 'a':
                    System.out.println("Please enter a number");
                    break;
                case 'b':
                    System.out.println("Please enter a number");
                    break;
                case 'c':
                    System.out.println("Please enter a number");
                    break;
                case 'd':
                    System.out.println("Please enter a number");
                    break;
                case 'e':
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
    public static char getInput() {
        System.out.print("Please select: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
    public static char printMenu(){
        System.out.println("""
                ===============================================================
                The Geek Cafe
                ===============================================================
                a) Order
                b) Bake muffins
                c) Show sales report
                d) Update prices
                e) Exit""");
        return getInput();
    }

    public static char printOrder(){
        System.out.println("""
                > Select the food item
                1. Muffin
                2. Shake
                3. Coffee""");
        return getInput();
    }

    public static char printOrder(boolean combo){
        System.out.println("""
                > Select the food item
                1. Muffin
                2. Shake
                3. Coffee
                4. No more""");
        return getInput();
    }

    public static void printPayment()
    {
        System.out.println("""
                Total Cost of order is $32.00.
                Please enter money for payment: 35.00
                Change returned $3.00.
                """);
    }

    public static void bakeMuffins(){
        System.out.println("Ok, 25 Muffins added. Total muffins in café is now 34.");
    }

    public static void showSales(){
        System.out.println("""
                Total Sales:
                Muffin: 16 $32.00
                Shake:  0  $0.00
                Coffee: 0  $0.00
                --------------------------------------
                        16 $32.00
                """);
    }
}