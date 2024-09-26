package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {

        System.out.println("Introduce un número");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        if (num2 == 0) {
            System.out.println("ERROR: no se puede dividir entre 0");

        } else {
            int resultado = num1 / num2;
            System.out.println("La división entre los dos numeros es: " + resultado);
        }


    }

}