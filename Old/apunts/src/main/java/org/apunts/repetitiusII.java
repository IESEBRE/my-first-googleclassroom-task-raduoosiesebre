package org.apunts;

import java.util.Scanner;

public class repetitiusII {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        int valor=1;

        //System.out.println("Introdueix un valor enter (0 per finalizar)");
        //valor=ent.nextInt();

        //Demanar a l'usuari la introducció d'un valor mentre no es complix una condició
        /*
        while(valor!=0){
            System.out.println("Introdueix un valor enter (0 per finalizar)");
            valor=ent.nextInt();
        }
         */

        /*
        do{

        }while(condicio_true)
         */

        do {
            System.out.println("Introdueix un valor enter (0 per finalizar)");
            valor=ent.nextInt();
        } while (valor!=0);
    }
}
