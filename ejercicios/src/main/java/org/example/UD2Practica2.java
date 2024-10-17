package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UD2Practica2 {
    public void UD2practica2() {

        Scanner entrada = new Scanner(System.in);
        double resultado = 0;
        double num1 = 0;
        double num2 = 0;

        boolean error = true;
        boolean error2 = true;

        System.out.println("Calculadora simple");

        while (error) {

            try {
                System.out.println("Introduce el primer número");
                num1 = entrada.nextInt();
                error = false;

            } catch (InputMismatchException e1) {
                System.out.println("ERROR. Entrada no válida.");
                entrada.nextLine();
            }

        }

        while (error2) {

            System.out.println("¿Qué operación quieres hacer? (+,-,/,x,R)");
            String signo = entrada.next();
            signo = signo.toUpperCase();

            try {

                switch (signo) {
                    case "+":
                        System.out.println("Introduce el segundo número");
                        num2 = entrada.nextInt();
                        resultado = num1 + num2;
                        error2 = false;
                        System.out.println(resultado);
                        break;
                    case "-":
                        System.out.println("Introduce el segundo número");
                        num2 = entrada.nextInt();
                        resultado = num1 - num2;
                        System.out.println(resultado);
                        error2 = false;
                        break;
                    case "/":
                        System.out.println("Introduce el segundo número");
                        num2 = entrada.nextInt();
                        if (num2==0) {
                            System.out.println("No se puede dividir entre 0");

                        } else {
                            System.out.println("No se puede dividir entre 0");
                            resultado = num1 / num2;
                            System.out.println(resultado);
                            error2 = false;
                        }
                        break;

                    case "X":
                        System.out.println("Introduce el segundo número");
                        num2 = entrada.nextInt();
                        resultado = num1 * num2;
                        error2 = false;
                        System.out.println(resultado);
                        break;
                    case "R":
                        if (num1>0) {
                            resultado = Math.sqrt(num1);
                            System.out.println(resultado);
                        }else
                            System.out.println("No se puede calcular la raíz de un número negativo");
                        error2 = false;
                        break;

                    default:
                        System.out.println("ERROR. Signo no válido.");

                }

            } catch (InputMismatchException e1) {
                System.out.println("Error. Entrada no válida.");
                entrada.nextLine();
            }

        }

    }

}



