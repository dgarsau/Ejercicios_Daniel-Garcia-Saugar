package org.example;

import java.util.Scanner;

public class Matrices1 {
    public void matrices1(){

        Scanner entrada = new Scanner(System.in);

        int [][] matriz1 = new int [3][3];
        int buscar;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Introduce el valor de la posición " + i + "," + j +") :");
                matriz1[i][j]=entrada.nextInt();
            }
        }
        System.out.println("Matriz:");

        for(int[] filas: matriz1){
            for(int columnas:filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        System.out.println("Que número quieres buscar");
        buscar=entrada.nextInt();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if(matriz1[i][j]==buscar){
                    System.out.println("El número " + buscar + " se encuentra en la posición (" + i +","+j+")");
                }
            }
        }
    }
}
