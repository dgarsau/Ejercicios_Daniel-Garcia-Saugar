package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {

        System.out.println("Introduce un número");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("ERROR: los números introducidos son iguales");

        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que "+ num2);
        }
        else {
            System.out.println(num2 + " es mayor que "+ num1);
        }
    }

}
