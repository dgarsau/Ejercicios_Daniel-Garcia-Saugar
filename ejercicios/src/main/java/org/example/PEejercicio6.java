package org.example;

import java.util.Scanner;

public class PEejercicio6 {
    public void peejercicio6(){

        Scanner entrada = new Scanner(System.in);

        int edad;
        int altura;
        int mayor_edad=0;
        int mayor_altura=0;
        int edad2=0;
        int altura2=0;
        int edad_media=0;
        int altura_media=0;



        System.out.println("¿Cuántos alumnos quieres introducir?");
        int alumnos = entrada.nextInt();

        for (int i=1 ; i<=alumnos; i++){

            System.out.println("Introduce la edad del alumno " +i);
            edad = entrada.nextInt();

            System.out.println("Introduce la altura del alumno " + i + " (cm)");
            altura = entrada.nextInt();

            if (edad>18){
                mayor_edad++;
            }

            if (altura>175){
                mayor_altura++;
            }

            edad2+=edad;
            altura2+=altura;

            edad_media=edad2/alumnos;
            altura_media=altura2/alumnos;

        }

        System.out.println("Hay " + mayor_edad + " alumnos mayores de 18 años.");
        System.out.println("Hay " + mayor_altura + " alumnos que miden más de 175 cm.");

        System.out.println("La edad media es " + edad_media);
        System.out.println("La altura media es " + altura_media);
    }
}
