package org.problemesjoel;

import java.util.Scanner;

public class cercarparelles {
    public static void main(String[] args) {
        Scanner ent1 = new Scanner (System.in);
        int c1, c2, c3;
        c1 = ent1.nextInt();
        c2 = ent1.nextInt();
        c3 = ent1.nextInt();

        if (c1 == c2 || c2 == c3 || c1==c3){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
