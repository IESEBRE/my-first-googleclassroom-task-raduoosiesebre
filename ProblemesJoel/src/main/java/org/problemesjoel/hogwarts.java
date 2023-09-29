package org.problemesjoel;

import java.util.Scanner;

public class hogwarts {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String answer;
        answer = word.nextLine();
        if (answer.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (answer.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (answer.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}

