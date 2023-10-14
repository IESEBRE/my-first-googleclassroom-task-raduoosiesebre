package org.activitats;

import java.util.Scanner;

public class Activitat2 {
    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);
        int num = ent1.nextInt();
        int input = 0;

        while(num!=-1){
            num=ent1.nextInt();
            input++;
        }
        System.out.println(input);

    }
}
