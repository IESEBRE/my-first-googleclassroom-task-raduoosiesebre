package org.condicionals;

import java.util.Scanner;

public class CondicionalsIII {

    public static void main(String[] args) {
        //Nova estructura condicional --> switch

        /*
        switch( expressio ){
            case valor:
                //instruccions del cas
                break;
            //altres case
            case valor2:
                // instructions
                break;

            default: //en qualsevol awltre cas (es opcional)
                //instruccions del default
        }
         */

        //Declaracio de variables

        int cum;
        Scanner ent = new Scanner(System.in);
        int day;
        System.out.println("Tell me a day of the week (1-7) and I will say it's name");
        day = ent.nextInt();

        /*switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                if(day == 6 || day == 7){
                    System.out.println("És finde");
                } else {
                    System.out.println("Dia incorrecte");
                }
        } */

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Is not weekend");
                break;
            case 6:
            case 7:
                System.out.println("És finde");
                break;
            default:
                System.out.println("Incorrect day");
        }
    }
}
