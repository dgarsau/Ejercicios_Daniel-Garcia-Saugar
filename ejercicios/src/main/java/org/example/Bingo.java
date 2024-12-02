package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public void bingo() {

        Integer sorteo[] = crearSorteo();
        int[][] carton = new int[3][3];
        carton = rellenarCarton(carton);

    }

    public static Integer[] crearSorteo() {

        Random aleatorio = new Random();

        int bolas = aleatorio.nextInt(30) + 10;
        Integer sorteo[] = new Integer[bolas];
        int num_aleatorio = 0;

        for (int i = 0; i < sorteo.length; i++) {

            do {
                num_aleatorio = aleatorio.nextInt(90) + 1;
            } while (Arrays.asList(sorteo).contains(num_aleatorio));  //a) y b) crear vector comprobando repetidos

            sorteo[i] = num_aleatorio;

        }

        System.out.println(bolas + " bolas extraídas hasta ahora: " + Arrays.toString(sorteo));

        System.out.print("\n");

        return sorteo;

    }

    public static int[][] rellenarCarton(int[][] carton){

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < carton.length; i++) {

            System.out.println("Fila " + (i + 1) + ": ");
            String valores = teclado.next();

            comprobarFormato();

            String fila[] = valores.split("-");

            for (int j = 0; j < carton[0].length; j++) {
                carton[i][j] = Integer.parseInt(fila[j]);
            }
        }

        return carton;
    }

    public static void comprobarFormato(){

        if (!valores.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
            System.out.println("Cerrando programa... Introduce valores con el formato correcto (N-N-N).");
            System.exit(0);
        }else{
            System.exit(0);
        }
    }



    public void bingo2() {


        Scanner teclado = new Scanner(System.in);

        System.out.println("*** BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO ***");

        //a)

        //c)
        System.out.println("*** Introduce los datos de tu cartón ***");

        //d)
        System.out.println("Datos del cartón introducido: ");
        for (int[] filas : carton) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");


        System.out.println("PREMIOS: ");

        System.out.print("\n");

        //e)
        //compruebo bingo
        boolean haybingo = true;
        bingo:
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[0].length; j++) {

                if (!Arrays.asList(vector).contains(carton[i][j])) {
                    System.out.println("No hay BINGO.");
                    haybingo = false;
                    break bingo;
                }
            }
        }

        if (haybingo) {
            System.out.println("HAY BINGO!!");
            return;
        }

        //f)
        //si no hay BINGO compruebo línea
        linea:
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[0].length; j++) {

                if (!Arrays.asList(vector).contains(carton[i][j])) {
                    System.out.println("Línea " + (i + 1) + ": NO");
                    continue linea;
                }

            }

            System.out.println("Línea " + (i + 1) + ": CORRECTA!!");
            break;

        }
    }
}
