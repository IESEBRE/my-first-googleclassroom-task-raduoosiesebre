package org.problemesjoel;

import java.util.Scanner;

public class hogwartsNew {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String answer;

        answer = ent.nextLine();

        switch( answer ){
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }


    }
}
