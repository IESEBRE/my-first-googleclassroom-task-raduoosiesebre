package org.radu.apunts;

import java.util.Scanner;

public class Iguals {
    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num1, num2;

        //lectura de dades
        System.out.println("Introduix 2 números enters:");
        num1=ent.nextInt();
        num2=ent.nextInt();

        //Resultat
        if( num1 == num2 ) {
            System.out.println("Els valors són iguals.");
        } else if (num1 != num2) {
            System.out.println("Els valors no son iguals");
        }

    }
}
