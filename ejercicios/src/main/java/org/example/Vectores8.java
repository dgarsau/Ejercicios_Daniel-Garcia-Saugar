package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Vectores8 {
    public void vectores8(){

        Scanner entrada = new Scanner(System.in);

        int indice;
        int numero;
        int vector1[] = {1, 2, 3, 5};
        int vector2[] = new int[vector1.length+1];

        System.out.println(Arrays.toString(vector1));

        System.out.println("¿En qué posición quieres insertar el elemento?");
        indice=entrada.nextInt();
        System.out.println("¿Qué número quieres insertar?");
        numero=entrada.nextInt();


        for (int i = 0; i < vector1.length+1; i++) {
            if (i < indice) {
                vector2[i] = vector1[i];
            } else if (i==indice) {
                vector2[i] = numero;
            }else{
                vector2[i] = vector1[i-1];
            }
        }

        System.out.println(Arrays.toString(vector2));

    }
}
