package org.apunts;

import java.util.Locale;

public class format {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        char letra='t';
        int num=565512555;
        System.out.printf("%C %n", 'a');
        System.out.format("%C %n", 'a');
        System.out.format("%C %n", letra);
        System.out.format("%c %C %n", letra, 'o');
        System.out.format("%s %s %s %s %S %n", letra, 'o', 23676, "Hola", "Adios");
        System.out.format("%c %C %2$d %3$s %<S %n", letra, 'o', 23676, "Hola", "Adios");
        System.out.format("%s %s %s %-8s %S %n", letra, 'o', 23676, "Hola", "Adios");
        System.out.println();
        System.out.printf("%b %n", num>0);
        System.out.println();
        System.out.printf("Decimal: %d Octal: %o Hexadecimal: %x", num, num, num);
        System.out.println();
        System.out.printf("%f %1$e %1$E %1$g %1$G", Math.PI);
        System.out.println();
        System.out.printf("%+010.2f %n", Math.PI);
        System.out.printf("%10.2f %n", Math.PI);
        System.out.printf("%2f %n", Math.PI);
        System.out.printf("%f %<e %<E %<g %<G", Math.PI);

    }
}
