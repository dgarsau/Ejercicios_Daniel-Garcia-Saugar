package org.example;

import java.util.Scanner;

public class Vectores4 {
    public void vectores4() {

        Scanner entrada = new Scanner(System.in);

        int vector[] = {1, 3, 5, 7, 9};
        int vector2[] = new int[vector.length - 1];

        int numero;
        boolean posicicon;

        for(int i=0; i<vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        System.out.println("Ingresa el índice a eliminar: ");
        numero = entrada.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (numero >= i) {
                vector2[i] = vector[i];
                continue;
            }
            vector2[i] = vector[i];
        }

        for(int i=0; i<vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }

    }
}



