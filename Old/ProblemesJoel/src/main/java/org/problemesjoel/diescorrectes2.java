package org.problemesjoel;

import java.util.Scanner;

public class diescorrectes2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();
        int any = ent.nextInt();
        boolean anyBixest = (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;


        if (dia>=1 && dia<=365 || dia == 366 && anyBixest){
            System.out.println("Correcte!");
        } else {
            System.out.println("Incorrecte!");
        }
    }
}
