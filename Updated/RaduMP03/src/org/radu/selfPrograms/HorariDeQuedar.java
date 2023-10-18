package org.radu.selfPrograms;

import java.util.Scanner;

public class HorariDeQuedar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int raduExitHour = 20;

        System.out.println("Que hora saldremos? > ");
        int inputtedNumber = scanner.nextInt();

        if (inputtedNumber >= raduExitHour){
            System.out.println("ACEPTO");
        } else {
            System.out.println("RECHAZO");
        }
    }
}


