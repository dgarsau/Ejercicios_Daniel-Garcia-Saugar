package org.example;

import java.util.Scanner;

public class UD2Ejercicio2 {

    public void UD2ejercicio2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase:");
        String frase1 = entrada.nextLine();
        System.out.println("Introduce otra palabra o frase:");
        String frase2 = entrada.nextLine();

        int tamanyo1 = frase1.length();
        int tamanyo2 = frase2.length();

        if (tamanyo1>tamanyo2){
            System.out.println("La frase más larga es " +frase1);
        }else{
            System.out.println("La frase más larga es " +frase2);
        }
    }
}
