package org.example;

import java.util.Scanner;

public class Matrices3 {
    public void matrices3(){

        Scanner entrada = new Scanner(System.in);

        int estudiantes;
        int asignaturas;

        int aux=0;
        int total=0;
        int media=0;


        System.out.println("¿Cuántos estudiantes hay?");
        estudiantes=entrada.nextInt();
        System.out.println("¿Cuántas asignaturas hay?");
        asignaturas=entrada.nextInt();

        String[][] tabla = new String[estudiantes+1][asignaturas+1];

        tabla[0][0]="estudiantes";

        for (int i = 1; i < tabla.length; i++) {
            System.out.println("Introduce el nombre del estudiante " + i);
            tabla[i][0]=entrada.next();
        }

        for (int i = 1; i < tabla[0].length; i++) {
            System.out.println("Introduce la asignatura " + i);
            tabla[0][i]=entrada.next();
        }

        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[0].length; j++) {
                System.out.println("Inserta la nota de " + tabla[i][0] + " para la asignatura de " + tabla[0][j]);
                tabla[i][j]=entrada.next();
            }
        }

        for(String[] filas: tabla){
            for(String columnas:filas){
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < tabla.length; i++) {

            total=0;

            for (int j = 1; j < tabla[0].length; j++) {
                aux=Integer.parseInt(tabla[i][j]);
                total +=aux;
            }
            media=total/asignaturas;
            System.out.println("La nota media del alumno " + tabla[i][0] + " es " + media);
        }

        for (int i = 1; i < tabla[0].length; i++) {

            total=0;

            for (int j = 1; j < tabla.length; j++) {
                aux=Integer.parseInt(tabla[j][i]);
                total +=aux;
            }
            media=total/estudiantes;
            System.out.println("La nota media de la asignatura " + tabla[0][i] + " es " + media);
        }

    }
}
