package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = entrada.next();

        int edad = -1;

        System.out.println("Hola " + nombre + ".");

        while(edad<0){
            try{
                System.out.println("Introduce tu edad:");
                edad = entrada.nextInt();

                if(edad<0){
                    System.out.println("Error. La edad no puede ser un número negativo.");
                }
            }
            catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. La edad tiene que ser un número válido.");
                entrada.nextLine();
            }
        }

        if (edad >= 18) {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");

        } else {
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            System.out.println("Te faltan " + (18 - edad) + " años para ser mayor de edad.");
        }

    }

}










