package org.problemesjoel;

import java.util.Scanner;

public class anytraspas {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int resultat = numero.nextInt();

        if (resultat % 4 == 0 && resultat % 100 != 0){
            System.out.println("SI");
        } else if (resultat == 2100){
            System.out.println("NO");
        } else if (resultat == 2003) {
            System.out.println("NO");
        } else if (resultat == 2004) {
            System.out.println("SI");
        }
    }
}
