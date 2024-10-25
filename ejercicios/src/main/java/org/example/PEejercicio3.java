package org.example;

import java.util.Scanner;

public class PEejercicio3 {
    public void peejercicio3(){

        Scanner entrada = new Scanner(System.in);

        int mes=10;
        int total=0;

        System.out.println("A cuantos meses lo quieres financiar:");
        int meses = entrada.nextInt();

        System.out.println("Financiacion a " + meses + " meses");

        for(int i = 1; i<=meses; i++){
            System.out.println("Mes " + i + ": " + mes + "€");
            total+=mes;
            mes*=2;
        }

        System.out.println("Total a pagar: " + total + "€");
        
    }
}
