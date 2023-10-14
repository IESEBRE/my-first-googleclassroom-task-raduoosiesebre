package org.apunts;

import java.util.Scanner;

public class repetitiusIII {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        int valor;

        do {
            System.out.println("Introdueix un valor enter positiu major que 0: ");
            valor=ent.nextInt();

            if (valor>0){
                break; //negacio de la condicio del while
            } else {
                System.out.println("T'he dit que ha de ser positiu major que 0!");
            }

        } while (true);

        System.out.println("Adios!");

    }
}
