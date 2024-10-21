package org.example;

import java.util.Scanner;

public class Bucles4 {
    public void bucles4() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String cadena = entrada.nextLine();

        char letra;

        for (int i = 0; i <= cadena.length()-1; i++) {

            letra = cadena.charAt(i);
            System.out.println(letra);

        }
    }
}

