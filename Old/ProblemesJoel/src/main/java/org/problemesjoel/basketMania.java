package org.problemesjoel;

import java.util.Scanner;

public class basketMania {
    public static void main(String[] args) {
        Scanner emt = new Scanner (System.in);

        int numCasos = emt.nextInt();

        while (numCasos-->0){
            //tratamiento de cada caso
            int numJugados = emt.nextInt(), puntosL = 0, puntosV = 0;
            while (numJugados-->0){
                //tratamiento de cada jugada
                String equipo = emt.next(); //guardamos la cadena V o L
                int punt = Integer.parseInt(emt.next()); //transforma el texto que devuelve next() a numero entero
                //Asignamos los puntos al equipo que ha hecho cada jugada
                if (equipo.equals("V")){
                    puntosV=puntosV+punt;
                } else {
                    puntosL=puntosL+punt;
                }

                //Mostra el resultado de la jugada
                if(puntosV==puntosL){
                    System.out.println("Empate");
                } else if (puntosV>puntosL) {
                    System.out.println("V");
                } else {
                    System.out.println("L");
                    System.out.println("%d %d%n", puntosL, puntosV);
                }

            }






        }
    }
}
