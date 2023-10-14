package org.radu.problemesMestre;

public class Activitat5 {
    public static void main(String[] args) {
        int num = -50;

        while(num<=50){
            System.out.println(num++ % 2 == 0 ? num+" es parell" : num+ " és imparell");
            num++;
        }
    }
}
