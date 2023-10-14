package org.problemesjoel;

import java.util.Scanner;

public class avimesgran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();

        scanner.nextLine();

        String name2 = scanner.nextLine();
        int age2 = scanner.nextInt();

        if (age1 > age2) {
            System.out.println(name1);
        } else if (age2 > age1) {
            System.out.println(name2);
        } else {
            System.out.println("Tenen la mateixa edat");
        }

        scanner.close();
    }
}

