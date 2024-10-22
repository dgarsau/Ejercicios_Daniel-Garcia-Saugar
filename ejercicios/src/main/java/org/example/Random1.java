package org.example;

import java.util.Random;

public class Random1 {
    public void random1(){

        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        System.out.println("El valor del dado 1 es " + dado1);
        System.out.println("El valor del dado 2 es " + dado2);

        int resultado = dado1+dado2;
        System.out.println("El resultado es " + resultado);

    }
}
