package org.example;

import java.util.Scanner;

public class PEejercicio2 {
    public void peejercicio2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la base:");
        int base = entrada.nextInt();
        int numero=base;

        System.out.println("Introduce el exponente:");
        int exponente = entrada.nextInt();

        for (int i=1; i<exponente; i++){
            base*=numero;
        }

        System.out.println("El resultado es " +base);


    }
}
