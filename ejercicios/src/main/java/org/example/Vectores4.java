package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Vectores4 {
    public void vectores4() {

        Scanner entrada = new Scanner(System.in);

        int vector[] = {1, 3, 5, 7, 9};
        int vector2[] = new int[vector.length - 1];

        int indice;
        boolean aux=false;

        for(int i=0; i<vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        System.out.println("Ingresa el índice a eliminar: ");
        indice = entrada.nextInt();

        for (int i = 0; i < vector.length-1; i++) {
            if (i < indice) {
                vector2[i] = vector[i];
            }else{
                vector2[i] = vector[i + 1];
            }
        }

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

    }
}



