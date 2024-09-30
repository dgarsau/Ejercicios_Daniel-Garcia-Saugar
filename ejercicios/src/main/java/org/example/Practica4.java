package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Practica4 {
    public void practica4() {

        Scanner entrada = new Scanner(System.in);

        int mult1 = 0;
        int mult2 = 0;
        int aux = 0;

        while (aux==0) {

            try {

                System.out.println("Introduce el multiplicando (tres cifras):");
                mult1 = entrada.nextInt();
                System.out.println("Introduce el multiplicador (tres cifras):");
                mult2 = entrada.nextInt();

                if ((mult1 > 999 || mult1 < (-999) || (mult1 > (-100) && mult1 < 100)) || (mult2 > 999 || mult2 < (-999) || (mult2 > (-100) && mult2 < 100))) {
                    System.out.println("Error. Los números deben ser de 3 cifras.");
                }

                else {
                    aux += 1;
                }

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Entrada no válida");
                entrada.nextLine();
            }

        }


        int resultado = mult1 * mult2;

        System.out.println("El producto de la multiplicación es: " + resultado);

        System.out.println("El proceso es:");
        System.out.println("  "+ mult1);
        System.out.println("x " +mult2);
        System.out.println("______");


        if (mult2<0) {

            String multC = Integer.toString(mult2);
            String num3S = multC.substring(3, 4);
            int cifra3 = Integer.parseInt(num3S)*(-1);

            String num2S = multC.substring(2, 3);
            int cifra2 = Integer.parseInt(num2S)*(-1);

            String num1S = multC.substring(1, 2);
            int cifra1 = Integer.parseInt(num1S)*(-1);

            int num3 = cifra3*mult1;
            System.out.println("  " +num3);


            int num2 = cifra2*mult1;
            System.out.println(" " +num2);

            int num1 = cifra1*mult1;
            System.out.println("" +num1);

            System.out.println("______");
            System.out.println(resultado);

        }

        else {

            String multC = Integer.toString(mult2);
            String num3S = multC.substring(2, 3);
            int cifra3 = Integer.parseInt(num3S);

            String num2S = multC.substring(1, 2);
            int cifra2 = Integer.parseInt(num2S);

            String num1S = multC.substring(0, 1);
            int cifra1 = Integer.parseInt(num1S);

            int num3 = cifra3*mult1;
            System.out.println("  " +num3);


            int num2 = cifra2*mult1;
            System.out.println(" " +num2);

            int num1 = cifra1*mult1;
            System.out.println("" +num1);

            System.out.println("______");
            System.out.println(resultado);
        }

    }

}