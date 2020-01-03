package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String LuckyString[] = {"ordinary","lucky","Very lucky"};
        System.out.println("Enter birthday :Mouth day");
        int MonthNumber = Integer.parseInt(scanner.next());
        while (MonthNumber<1||MonthNumber>12){
            System.out.println("error Mouth:");
            MonthNumber = Integer.parseInt(scanner.next());
        }
        int DateNumber = Integer.parseInt(scanner.next());
        while (DateNumber<1||DateNumber>31){
            System.out.println("error day:");
            DateNumber = Integer.parseInt(scanner.next());
        }
        int LuckyNumber = (MonthNumber*2+DateNumber)%3;
        System.out.println("you will:"+LuckyString[LuckyNumber]);
    }
}