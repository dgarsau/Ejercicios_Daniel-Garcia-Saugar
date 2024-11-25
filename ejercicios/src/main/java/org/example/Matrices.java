package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
    public void matrices() {

//        int[][] matriz = new int[3][4];
//        int[][] matriz2 = {{12,32,44,1},{33,2,90,56}};
//
//        System.out.println(matriz2[0][2]);
//
//        int aux=0;

//        for (int i = 0; i < matriz.length; i++) {
//
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j]=aux;
//                aux++;
//            }
//        }

//        for(int[] filas: matriz2){
//            System.out.println(Arrays.toString(filas));
//        }
//
//        for(int[] filas: matriz2){
//            for(int[] columnas: matriz2){
//                System.out.print(columnas + " ");
//            }
//        System.out.print("ln");
//        }

//        Scanner entrada = new Scanner(System.in);
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.println("Dime el valor de la posición (" + i + "," + j +"):");
//                matriz[i][j]=entrada.nextInt();
//            }
//        }
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(Arrays.deepToString(matriz));

//        int[][] matriz3 = new int[5][5];
//
//        for (int i = 0; i < matriz3.length; i++) {
//            for (int j = 0; j < matriz3[i].length; j++) {
//
//                if(i==j){
//                    matriz3[i][j]=1;
//                }
//            }
//        }
//
//        for (int i = 0; i < matriz3.length; i++) {
//            for (int j = 0; j < matriz3[i].length; j++) {
//
//                if(matriz3[i][j]==1){
//                    System.out.print("X ");
//                }else{
//                    System.out.print("- ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < matriz3.length; i++) {
//            for (int j = matriz3.length-1; j >=0 ; j++) {
//                
//            }
//        }
//        
//        System.out.println();
//
//        for(int[] filas:matriz3){
//            for(int columnas: filas){
//                System.out.print(columnas + " ");
//            }
//            System.out.println();
//        }
//    }


        int[][] matriz4 = {{12, 2, 44, 1}, {33, 2, 90, 56}};
        int[][] matriz5 = {{33, 2, 90, 56}, {12, 32, 44, 1}};
        int[][] matriznueva = new int [matriz4.length][matriz4[1].length];

        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[i].length; j++) {
                if (matriz4[i][j]>matriz5[i][j]){
                    matriznueva[i][j]=matriz4[i][j];
                } else if (matriz4[i][j]<matriz5[i][j]){
                    matriznueva[i][j]=matriz5[i][j];
                } else {
                    System.out.println(matriz4[i][j] + " y " + matriz5[i][j] + " Son iguales");
                    matriznueva[i][j]=matriz5[i][j];
                }
            }
        }

        for(int[] filas:matriznueva){
            for(int columnas: filas){
                System.out.print(columnas + " ");
            }
            System.out.println();

        }
    }
}
