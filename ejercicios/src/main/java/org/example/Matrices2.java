package org.example;

import java.util.Random;

public class Matrices2 {
    public void matrices2() {

        Random random = new Random();

        int fila= random.nextInt(5)+1;
        int columna= random.nextInt(5)+1;

        int[][] matriz = new int[fila][columna];
        int suma=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= random.nextInt(30)+1;
            }
        }

        System.out.println("Matriz:");

        for(int[] filas: matriz){
            for(int columnas:filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma +=matriz[i][j];
            }
            System.out.println("Fila "+i+" :" + suma);
            suma=0;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma +=matriz[j][i];
            }
            System.out.println("Columna "+i+" :" + suma);
            suma=0;
        }
    }
}
