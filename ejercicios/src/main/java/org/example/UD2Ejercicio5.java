package org.example;
import java.util.Scanner;

public class UD2Ejercicio5 {

    public void UD2ejercicio5() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("JUEGO DE ADIVINAR UNA PALABRA QUE ESTE EN UN TEXTO");

        System.out.println("JUGADOR 1: Introduce un texto:");
        String texto = entrada.nextLine();

        System.out.println("JUGADOR 2: Introduce una palabra:");
        String palabra = entrada.nextLine();

        int contador = 10;

        while (contador > 1 && !texto.contains(palabra)) {

            if (!texto.contains(palabra)) {
                System.out.println("La palabra no aparece en el texto.");
                contador -= 1;
                System.out.println("Te quedan " + contador + " intentos");
                System.out.println("Introduce otra palabra:");
                palabra = entrada.nextLine();

            }

        }

        if (texto.contains(palabra)) {
            System.out.println("Felicidades! La palabra aparece en el texto.");
        }
        else {
            System.out.println("No te quedan intentos, gana el Jugador 1");
        }

    }

}





