package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica1 {
    public void UD3practica1(){

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String equipo[] = new String[7];

        int equipo_int[]= new int [7];

        int equipo1[]= new int [7];
        int equipo2[]= new int [7];

        String potencia = "";

        int total=0;
        int aux;
        boolean error=true;

        int primer_samurai= random.nextInt(1,7);



        int vuelta=1;

        //potencia=potencia.replaceAll("\\D+", " ");

        do {

            while(error) {

                System.out.println("Introduce la potencia de los samurais (Equipo "+vuelta+"):");
                potencia = entrada.nextLine();
                potencia=potencia.replaceAll("\\D+", " ");
                equipo = potencia.split(" ");

                for (int i = 0; i < equipo.length; i++) {
                    aux = Integer.parseInt(equipo[i]);
                    equipo_int[i] = aux;
                    total += aux;
                }
                if (total != 30) {
                    System.out.println("ERROR. La suma de la potencia no es 30.");
                    total = 0;
                } else {
                    error = false;
                }
            }

            error=true;
            total = 0;

            switch (vuelta) {
                case 1:
                    equipo1 = equipo_int.clone();
                    break;
                case 2:
                    equipo2 = equipo_int.clone();
                    break;
            }

            vuelta++;

        }

        while(vuelta<3);

        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla empieza con el Samurai " + primer_samurai);

        for (int i=0; i<equipo.length ; i++){
            if(equipo1[primer_samurai+i]>equipo2[primer_samurai+i]){
                System.out.println("Samurai "+ (primer_samurai+i) + ". Gana Equipo 1. " +equipo1[primer_samurai+i]+ " vs " + equipo2[primer_samurai+i]);
            }

        }

















//            if (total != 30) {
//                total = 0;
//            } else {
//                error = false;
//            }
//        }

//        while(error) {
//
//            System.out.println("Introduce la potencia de los samurais (Equipo 1):");
//
//            for (int i = 0; i < equipo1.length; i++) {
//                equipo1[i] = entrada.nextInt();
//                total1 += equipo1[i];
//            }
//            if (total1!=30){
//                total1=0;
//                System.out.println("ERROR. La potencia total no suma 30.");
//            }else{
//                System.out.println("Equipo completado.");
//                error=false;
//            }
//        }
//
//        error=true;
//
//        while (error) {
//
//            System.out.println("Introduce la potencia de los samurais (Equipo 2):");
//
//            for (int i = 0; i < equipo2.length; i++) {
//                equipo2[i] = entrada.nextInt();
//                total2 += equipo1[i];
//            }
//            if (total2 != 30) {
//                total1 = 0;
//                System.out.println("ERROR. La potencia total no suma 30.");
//            } else {
//                System.out.println("Equipo completado.");
//                error = false;
//            }
//        }



    }
}
