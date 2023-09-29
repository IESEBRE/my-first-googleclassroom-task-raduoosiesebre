package org.problemesjoel;

import java.util.Scanner;

public class caramels {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);
        int candy = result.nextInt();
        int kids = result.nextInt();

        System.out.println(candy % kids);
    }
}
