package org.radu.apunts;

import java.util.Scanner;

public class LogicExpression {
    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        String name = "John";
        String name2 = new String("John");
        int age = 18;


        System.out.println(name.equals("John") || !(age > 17));

        System.out.println(name.equals("John") && !(age > 17));

        System.out.println((name.equals("John") || name.equals("John")) && age >= 17 && age < 19);
    }
}
