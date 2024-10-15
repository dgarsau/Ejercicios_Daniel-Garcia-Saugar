package org.example;

import java.util.Scanner;

public class case_ejemplo1 {
    public void ejemplo1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu altura:");
        int altura = entrada.nextInt();

        if (altura < 150) {
            System.out.println("Persona de altura baja");
        } else if (altura < 175) {
            System.out.println("Persona de altura media");
        } else if (altura >= 176) {
            System.out.println("Persona alta");
        }

    }

}

