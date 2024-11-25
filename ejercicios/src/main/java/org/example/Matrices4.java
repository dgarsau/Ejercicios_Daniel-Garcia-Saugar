package org.example;

import java.util.Scanner;

public class Matrices4 {
    public void matrices4(){

        Scanner entrada = new Scanner(System.in);
        String[] fila;

        int[] vector = {3,4,5,3,2};
        int[][] matriz = new int[2][vector.length];

        for (int i = 0; i < vector.length; i++) {
            matriz[0][i] = vector[i];
        }

        for (int[] filas : matriz){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

//        int matriz2[][] = new int[3][4];
//
//        for (int i = 0; i < matriz2.length; i++) {
//            System.out.println("Introduce la fila " + i);
//            fila=entrada.next().split(",");
//
//            for (int j = 0; j < matriz2[0].length; j++) {
//                matriz2[i][j]=Integer.parseInt(fila[j]);
//            }
//        }
//
//        for (int[] filas : matriz2){
//            for (int columnas : filas){
//                System.out.print(columnas + " ");
//            }
//            System.out.println();
//        }

        String matriz3[][] = new String[10][10];

        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("Introduce la fila " + i);
            fila=entrada.next().split("");

            for (int j = 0; j < matriz3[0].length; j++) {
                matriz3[i][j]=fila[j];
            }
        }

        for (String[] filas : matriz3){
            for (String columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

    }
}




