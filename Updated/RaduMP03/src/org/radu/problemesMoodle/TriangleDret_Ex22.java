package org.radu.problemesMoodle;

import java.util.Scanner;

public class TriangleDret_Ex22 {
    public static void main(String[] args) {
        Scanner intt = new Scanner (System.in);
        int input = intt.nextInt();

        //Primer dibuix
        for(int i=1; i<=input; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=input; i++){
            for (int j=input; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Segon dibuix
        for(int i=1; i<=input; i++){
            //Bucle que dibuixa espais en blanc
            for(int j = input-1; j >= 1; j--){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=input; i>=1; i--){
                System.out.print("*");
        }
        System.out.println();
    }
}

