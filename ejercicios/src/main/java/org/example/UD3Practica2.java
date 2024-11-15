package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica2 {
    public void UD3practica2(){

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int[] premio = new int[6]; //(1,49)
        String[] boleto;
        int[] boleto_int = new int [7];
        int[] boleto_sinreintegro = new int [6];

        String juego;
        boolean formato=false;
        boolean existe_numero=false;
        boolean duplicados=false;

        //comprobar como la ruleta

        int complementario; //(1,49) , no puede estar repetido
        int reintegro; //(0,9)

        Integer[] numeros = new Integer[49];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }

        System.out.println(Arrays.toString(numeros));

        while(!formato || !existe_numero || duplicados) {

            duplicados = false;

            System.out.println("Introduce los datos de tu boleto:");
            juego = entrada.nextLine();
            formato = juego.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

            if (!formato) {
                System.out.println("ERROR. El formato introducido no es válido.");
            } else if (formato) {
                boleto = juego.split("[-/]");

                for (int i = 0; i < boleto_int.length; i++) {
                    boleto_int[i] = Integer.parseInt(boleto[i]);
                }

                for (int i = 0; i < boleto_int.length - 1; i++) {
                    existe_numero = Arrays.asList(numeros).contains(boleto_int[i]);
                    if (!existe_numero) {
                        System.out.println("ERROR. Un número introcido no es válido");
                        break;
                    }
                }
            } else {
                for (int i = 0; i < boleto_sinreintegro.length; i++) {
                    boleto_sinreintegro[i] = boleto_int[i];
                }

                Arrays.sort(boleto_sinreintegro);

                for (int i = 0; i < boleto_sinreintegro.length - 1; i++) {

                    if (boleto_sinreintegro[i] == boleto_sinreintegro[i + 1]) {
                        System.out.println("ERROR. Hay números duplicados.");
                        duplicados = true;
                        break;
                    }
                }
            }
        }

        System.out.println("El formato es correcto");




    }
}
