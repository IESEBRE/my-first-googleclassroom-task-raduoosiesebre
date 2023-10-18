package org.radu.problemesMestre;

import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numCases = input.nextInt();

        while (numCases --> 0){
            int num = input.nextInt();
            int divisor = 1;
            int counter = 0;
            while (divisor>=1){
                if (num % divisor == 0){
                    counter++;
                }
                if (counter > 2){
                    System.out.println("NO");
                    break;
                }
                divisor--;
            }
            System.out.println(counter==2 ? "SI" : "NO");
        }
    }
}
