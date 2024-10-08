package org.example;
import java.util.Scanner;

public class UD2Ejercicio1 {

    Scanner entrada = new Scanner(System.in);

    public void UD2ejercicio1(){

        System.out.println("INTRODUCE UNA PALABRA O FRASE:");
        String frase = entrada.nextLine();

        System.out.println("Texto original: " + frase);

        int tamanyo = frase.length();
        System.out.println("La longitud del texto es: " + tamanyo);

        String reemplazar = frase.replace(" ", "");
        System.out.println("Texto sin espacios: " + reemplazar);

        tamanyo = tamanyo / 2;
        String trozo1 = frase.substring(0,tamanyo);
        String trozo2 = frase.substring(tamanyo);
        System.out.println("La primera mitad del texto es: " + trozo1 + " . Y la segunda mitad del texto es: " + trozo2);

        frase = frase.toUpperCase();
        System.out.println("Texto en maúsculas: " + frase);

    }
}
