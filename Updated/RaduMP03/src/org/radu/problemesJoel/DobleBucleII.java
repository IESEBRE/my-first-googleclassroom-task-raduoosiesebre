package org.radu.problemesJoel;

import java.util.Scanner;

public class DobleBucleII {
    public static void main(String[] args) {
        Scanner numInput = new Scanner (System.in);

        int number = numInput.nextInt();
        int linenumber = numInput.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j>=i; j--){
                System.out.println(j);
            }
        }
        System.out.println();
    }
}
