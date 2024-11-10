package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica1 {
    public void UD3practica1() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String potencia;

        String[] equipo = new String[7];
        int[] equipo_int = new int[7];

        int[] equipo1 = new int[7], equipo2 = new int[7];

        int total, aux;
        int vuelta=1;

        boolean error=true, longitud=true, formato;

        int samurai = random.nextInt(7) + 1;
        int puntos1=0, puntos2=0;


        do {
            while (error) {

                total = 0;
                formato = false;

                while (longitud) {
                    System.out.println("EQUIPO " + vuelta);
                    System.out.println("Introduce la potencia de los samurais");
                    System.out.println("(7 numeros, separados por espacios, 30 puntos en total.)");
                    potencia = entrada.nextLine();
                    potencia = potencia.trim();
                    equipo = potencia.split(" ");

                    if (equipo.length != 7) {
                        System.out.println("ERROR. Se tienen que introducir 7 samuráis.");
                        System.out.println("________________________________________________________");
                    } else {
                        longitud = false;
                    }
                }

                longitud=true;

                for (int i = 0; i < equipo.length; i++) {
                    try {
                        aux = Integer.parseInt(equipo[i]);
                        equipo_int[i] = aux;
                        total += aux;
                    } catch (NumberFormatException e) {
                        formato = true;
                    }
                }

                if (formato) {
                    System.out.println("ERROR. Entrada no válida (Tienen que ser números)");
                    System.out.println("________________________________________________________");
                } else if (total != 30) {
                    System.out.println("ERROR. La potencia total no es 30.");
                    System.out.println("________________________________________________________");
                } else {
                    System.out.println("Equipo completado!");
                    System.out.println("________________________________________________________");
                    error=false;
                }
            }

            error=true;

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
        while (vuelta < 3);

        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla empieza con el Samurai " + samurai);
        System.out.println();

        while (puntos1 < 4 && puntos2 < 4) {

            if (samurai > 7) {
                samurai = 1;
            }

            if (equipo1[samurai - 1] > equipo2[samurai - 1]) {
                System.out.println("Samurai " + samurai + ": Gana Equipo 1. " + equipo1[samurai - 1] + " vs " + equipo2[samurai - 1]);
                equipo2[samurai - 1] = 0;
                puntos1++;
            } else if (equipo1[samurai - 1] < equipo2[samurai - 1]) {
                System.out.println("Samurai " + samurai + ": Gana Equipo 2. " + equipo1[samurai - 1] + " vs " + equipo2[samurai - 1]);
                equipo1[samurai - 1] = 0;
                puntos2++;
            } else {
                System.out.println("Samurai " + samurai + ": Empate, los dos samuráis mueren.");
                equipo1[samurai - 1] = 0;
                equipo2[samurai - 1] = 0;
                puntos1++;
                puntos2++;
            }
            samurai++;
        }

        System.out.println();

        if(puntos1>puntos2){
            System.out.println("Equipo 1 GANA! Equipo 2 ha tenido " + puntos1 + " bajas.");
        }else if (puntos1<puntos2){
            System.out.println("Equipo 2 GANA! Equipo 1 ha tenido " + puntos2 + " bajas.");
        }else {
            System.out.println("Empate. Los dos equipos han tenido 4 bajas.");
        }
    }
}



