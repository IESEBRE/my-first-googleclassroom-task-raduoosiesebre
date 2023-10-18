package org.radu.problemesMestre;

import java.util.Scanner;

public class DivisorsII {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int tractat = 1;
        while (tractat <= num){
            int divisor = 1;
            int counter = 0;
            while (divisor <= tractat){
                if (tractat % divisor == 0){
                    counter++;
                }
                if (counter > 2){
                    break;
                }
                divisor++;
            }
            System.out.println(tractat + (counter==2 ? "SI" : "NO"));
            tractat++;
        }


    }
}
