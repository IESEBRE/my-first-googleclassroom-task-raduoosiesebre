package org.activitats;

import java.util.Scanner;

public class Activitat3 {
    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);
        int num = 0;
        int input = 0;
        int suma = 0;

        while (num != -1) {
            num = ent1.nextInt();
            if (num >= 0 && num <=10){
                suma = suma + num;
                input++;
            }
        }

        System.out.println(suma);
    }
}
