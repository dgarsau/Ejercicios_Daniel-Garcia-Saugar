package org.example;

import java.util.Scanner;

public class Excepciones {

    public void excepciones() {

        Scanner entrada = new Scanner(System.in);

        int num_entero = 0;
        int division = 0;
        int dividendo = 0;

        System.out.println("Introduce el dividendo:");
        String numero = entrada.next();

        System.out.println("Introduce el divisor:");

        if (entrada.hasNextInt()) {
            dividendo = entrada.nextInt();
        } else {
            System.out.println("El formato no es númerico...");
        }

        try {
            num_entero = Integer.parseInt(numero);


        } catch (NumberFormatException e1) {
            System.out.println("No has escrito un numero... " + e1.getMessage());

        } catch (ArithmeticException e2) {
            System.out.println("El denominador es 0. División errónea. " + e2.getMessage());

        }

        finally {

            if (num_entero != 0) {
                division = dividendo / num_entero;
                System.out.println("El resultado es " + division);
            }

        }
    }
}
