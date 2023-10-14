package org.operators;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean variable1 = true;
        boolean variable2 = false;

        // Just print
        System.out.println(variable1);
        System.out.println(!variable1);
        
        //Logical Checkings
        System.out.println( variable1 && variable2);

        //0 Logic
        System.out.println( variable1 || variable2);
    }
}
