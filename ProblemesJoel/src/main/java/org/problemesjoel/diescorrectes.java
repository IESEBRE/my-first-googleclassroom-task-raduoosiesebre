package org.problemesjoel;

import java.util.Scanner;

public class diescorrectes {
    public static void main(String[] args) {
        Scanner day = new Scanner (System.in);
        int answer = day.nextInt();

        if (answer>=1 && answer<366){
            System.out.println("Correcte per un any no bixest!");
        } else if (answer == 366) {
            System.out.println("Correcte per un any bixest");
        } else {
            System.out.println("Incorrecte!");
        }
    }
}
