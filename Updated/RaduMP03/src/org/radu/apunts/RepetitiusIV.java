package org.radu.apunts;

import java.util.Scanner;

public class RepetitiusIV {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Introduix un valor enter positiu major que 0:");
            valor=ent.nextInt();
            if(valor<=0){
                System.out.println("T'he dit que ha de ser positiu major que 0!!");
                continue; //negació de la condició del while
            } else break;
        } while(true);

        System.out.println("Adéu!!");

    }
}
