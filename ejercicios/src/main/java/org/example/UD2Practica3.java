package org.example;

import java.util.Scanner;

public class UD2Practica3 {
    public void UD2practica3() {

        Scanner entrada = new Scanner(System.in);

        String ISBN = "";
        boolean error = true;
        boolean error2 = false;
        boolean error3 = false;
        char caracter;
        int cifra = 0;
        int resultado;
        int sum = 0;
        int posicion = 0;
        int veces = 0;


        while (error) {

            System.out.println("Introduce un ISBN:");
            ISBN = entrada.next();
            ISBN = ISBN.toUpperCase();

            if (ISBN.length() != 10) {
                System.out.println("ERROR. El ISBN debe tener 10 cifras");
            } else {
                for (int i = 0; i < 10; i++) {
                    caracter = ISBN.charAt(i);
                    if (caracter == '?' || caracter == 'X' || Character.isDigit(caracter)) {
                        error = false;
                        continue;

                    } else {
                        System.out.println("ERROR. El formato no es válido");
                        error = true;
                        break;
                    }
                }

            }

        }

        for (int i = 0; i < 10; i++) {

            caracter = ISBN.charAt(i);

            if (caracter == 'X') {
                if (ISBN.indexOf("X") == 9) {
                    cifra = 10;
                } else {
                    error3 = true;
                    break;
                }

            } else if (caracter == '?') {
                error2 = true;
                posicion = (10 - i);
                veces++;
                continue;
            } else {
                cifra = Integer.parseInt(String.valueOf(caracter));
            }

            resultado = cifra * (10 - i);
            sum += resultado;

        }

        if (error2) {

            for (int j = 0; j < 10; j++) {
                if (veces > 1) {
                    System.out.println("ERROR. No se pueden poner 2 interrogaciones");
                    break;
                }

                if ((sum + j * posicion) % 11 == 0) {
                    System.out.println("El dígito que falta es " + j);
                }
            }

        }else if (error3){
            System.out.println("ERROR. Solo puede haber una X y debe estar al final.");

        }else if (sum % 11 == 0){
            System.out.println("El ISBN es válido");

        } else {
            System.out.println("El ISBN no es válido");
        }
    }

}



