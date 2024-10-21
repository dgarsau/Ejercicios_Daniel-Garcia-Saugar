package org.example;

import java.util.Scanner;

public class Bucles6 {

    public void bucles6(){

        Scanner entrada= new Scanner(System.in);

        int operando;
        int resultado = 0;

        System.out.println("¿Cuántos números quieres sumar?");
        int num = entrada.nextInt();

        for (int i = 1; i <=num ; i++){
            System.out.println("Introduce un número:");
            operando= entrada.nextInt();
            resultado += operando;
        }

        System.out.println("La suma de todos los números es" + resultado);

    }
}
