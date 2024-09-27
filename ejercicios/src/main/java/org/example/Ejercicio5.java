package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        while (num1 == num2 || num2 == num3 || num1 == num3) {

            try {
                System.out.println("Introduce el primer número:");
                num1 = entrada.nextInt();
                System.out.println("Introduce el segundo número:");
                num2 = entrada.nextInt();
                System.out.println("Introduce el tercer número:");
                num3 = entrada.nextInt();

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Introduce un número válido.");
                entrada.nextLine();
            }

            if (num1 == num2 || num2 == num3 || num1 == num3){
                System.out.println("ERROR: hay números introducidos que son iguales");
            }


        }

        if (num1>num2 && num1>num3)
            System.out.println(num1 + " es el mayor");

        if (num2>num1 && num2>num3)
            System.out.println(num2 + " es el mayor");
        if (num3>num1 && num3>num2)
            System.out.println(num3 + " es el mayor");
    }

}
