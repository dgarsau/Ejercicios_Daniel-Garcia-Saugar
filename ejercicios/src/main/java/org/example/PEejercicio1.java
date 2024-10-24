package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PEejercicio1 {
    public void peejercicio1(){

        int num=0;
        int mayor=0;
        int menor=0;
        int igual=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuántos números quieres:");
        int cantidad = entrada.nextInt();


        for (int i=0 ; i<cantidad; i++){

            System.out.println("Introduce un número:");
            num = entrada.nextInt();

            if (num>0){
                mayor++;
            }else if (num<0){
                menor++;
            }else{
                igual++;
            }
        }

        System.out.println("Mayores que 0 = " +mayor);
        System.out.println("Menores que 0 = " +menor);
        System.out.println("Iguales que 0 = " +igual);

    }
}
