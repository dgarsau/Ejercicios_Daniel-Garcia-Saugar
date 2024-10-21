package org.example;

import java.util.Scanner;

public class Bucles8 {
    public void bucles8(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String cadena = entrada.nextLine();

        char letra;

        for (int i = cadena.length()-1; i>=0 ; i--) {

            letra = cadena.charAt(i);
            System.out.println(letra);

        }

    }
}
