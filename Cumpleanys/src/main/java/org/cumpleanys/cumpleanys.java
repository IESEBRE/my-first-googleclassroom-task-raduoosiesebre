package org.cumpleanys;

import java.util.Scanner;

public class cumpleanys {

        public static void main(String[] args) {
            int resultatFinal;

            Scanner anys = new Scanner(System.in);
            resultatFinal = anys.nextInt() + 1;

            System.out.println("L'any vinent tindràs " + resultatFinal + " anys");
        }
}
