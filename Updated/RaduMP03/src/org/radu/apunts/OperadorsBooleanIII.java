package org.radu.apunts;

public class OperadorsBooleanIII {
    public static void main(String[] args) {
        int num = 0;

        if (num != 0) {
            System.out.println(1000 % num == 0);
        } else {
            System.out.println("Val 0");
        }

        //System.out.println(num == 0 || 1000 % num == 0); //or -> mostrem true si num val 0

        //System.out.println(1000 % num == 0 || num == 0 ); //or >> rebem / by zero si num val 0
    }
}
