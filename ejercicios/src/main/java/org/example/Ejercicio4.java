package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {

        System.out.println("¿Cuánto mide la base?");
        Scanner entrada = new Scanner(System.in);
        int b = entrada.nextInt();

        while (b < 0) {
            System.out.println("El valor de la base tiene que ser positivo");
            System.out.println("¿Cuánto mide la base?");
            b = entrada.nextInt();
        }

            System.out.println("¿Cuánto mide la altura?");
        int h = entrada.nextInt();

        while (h < 0) {
             System.out.println("El valor de la altura tiene que ser positivo");
             System.out.println("¿Cuánto mide la altura?");
                h = entrada.nextInt();
            }

            int resultado = (b*h)/2;
            System.out.println("El area del triángulo es "+ resultado);
        }

    }


