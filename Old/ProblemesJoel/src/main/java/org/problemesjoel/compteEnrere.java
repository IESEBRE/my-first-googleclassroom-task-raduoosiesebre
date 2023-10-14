package org.problemesjoel;

import java.util.Scanner;

public class compteEnrere {
    public static void main(String[] args) {
        Scanner ent1 = new Scanner(System.in);
        int num = ent1.nextInt();

        while(num>=0){
            System.out.println(num);
            num=num-1;
        }

    }
}
