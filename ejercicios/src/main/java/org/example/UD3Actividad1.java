package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Actividad1 {
    public void UD3actividad1() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int saldo = 10000;
        int apuesta;

        String[] colores = {"rojo", "negro"};
        String[] pares = {"par", "impar"};

        int numero = 50;
        String color = "", par = "";
        boolean existe_numero = false, existe_color = false, existe_par = false;

        Integer[] numeros = new Integer[36 + 1];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println(Arrays.toString(numeros));

        int numero_banca = random.nextInt(37);
        int random1 = random.nextInt(2);
        String color_banca = colores[random1];
        int random2 = random.nextInt(2);
        String par_banca = pares[random2];
        int modo;
        int modo2;


        while (saldo > 0) {

            numero_banca = random.nextInt(37);
            random1 = random.nextInt(2);
            color_banca = colores[random1];
            random2 = random.nextInt(2);
            par_banca = pares[random2];

            System.out.println("¿A qué modo quieres jugar? (normal=1) (elegir numero/color/par=2");
            modo = entrada.nextInt();
            System.out.println("Introduce la apuesta:");
            apuesta = entrada.nextInt();
            saldo -= apuesta;

            switch (modo) {

                case 1:

                    while (!existe_numero || !existe_color || !existe_par) {

                        while (!existe_numero) {
                            System.out.println("Introduce un número:");
                            numero = entrada.nextInt();
                            existe_numero = Arrays.asList(numeros).contains(numero);
                            if (!existe_numero) {
                                System.out.println("El número introducido no está en la ruleta");
                            }
                            if (numero == 0) {
                                existe_color = true;
                                existe_par = true;
                            }
                        }
                        while (!existe_color) {
                            System.out.println("Introduce un color");
                            color = entrada.next();
                            existe_color = Arrays.asList(colores).contains(color);
                            if (!existe_color) {
                                System.out.println("El color introducido no está en la ruleta");
                            }
                        }
                        while (!existe_par) {
                            System.out.println("Introduce si es par o impar:");
                            par = entrada.next();
                            existe_par = Arrays.asList(pares).contains(par);
                            if (!existe_par) {
                                System.out.println("Eso no es par o impar");
                            }
                        }
                    }

                    existe_numero = false;
                    existe_color = false;
                    existe_par = false;

                    System.out.println(numero_banca + ", " + color_banca + ", " + par_banca);

                    if (numero == numero_banca) {
                        System.out.println("Has acertado el número.");
                        apuesta *= 35;
                        saldo += apuesta;
                    } else if (color.equals(color_banca)) {
                        System.out.println("Has acertado el color.");
                        apuesta *= 2;
                        saldo += apuesta;
                    } else if (par.equals(par_banca)) {
                        System.out.println("Has acertado el par");
                        apuesta *= 2;
                        saldo += apuesta;
                    } else {
                        System.out.println("Pierdes");
                    }



                case 2:

                    System.out.println("¿A qué quieres apostar? (numeros=1, color=2, par/impar=3");
                    modo2= entrada.nextInt();

                    switch (modo2){

                        case 1:

                            System.out.println("Introduce el número:");
                            numero=entrada.nextInt();

                            System.out.println("Ha salido el número: "+numero_banca);

                            if(numero==numero_banca){
                                System.out.println("Has ganado!");
                                apuesta*=35;
                            }else{
                                saldo-=apuesta;
                            }

                        case 2:

                            System.out.println("Introduce el color:");
                            color=entrada.next();

                            System.out.println("Ha salido el color: "+color_banca);

                            if(color.equals(color_banca)){
                                System.out.println("Has ganado!");
                                apuesta*=2;
                            }else{
                                saldo-=apuesta;
                            }

                        case 3:

                            System.out.println("Introduce el par/impar:");
                            par=entrada.next();

                            System.out.println("Ha salido el número: "+par_banca);

                            if(par.equals(par_banca)){
                                System.out.println("Has ganado!");
                                apuesta*=2;
                            }else{
                                saldo-=apuesta;
                            }

                    }
                    
                    System.out.println("Saldo restante: " + saldo + "€");

            }
        }
    }
}
