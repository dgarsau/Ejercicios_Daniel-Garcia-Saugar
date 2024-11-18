package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UD3Practica2 {
    public void UD3practica2() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        Integer[] numeros = new Integer[49];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        Integer[] premio = new Integer[6]; //(1,49)
        String[] boleto;
        Integer[] boleto_int = new Integer[7];
        Integer[] boleto_sinreintegro = new Integer[6];

        int aux;
        int reintegro_boleto;

        int complementario;
        int reintegro;

        String juego;

        boolean formato = false;
        boolean existe_numero = false;
        boolean duplicados = false;

        int aciertos=0;
        int acierto_reintegro=0;
        int acierto_complemetario=0;
        String categoria;


        while (!formato || !existe_numero || duplicados) {

            System.out.println("Introduce los datos de tu boleto:");
            juego = entrada.nextLine();
            juego = juego.trim();
            formato = juego.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

            if (!formato) {
                System.out.println("ERROR. El formato introducido no es válido.");
                System.out.println("________________________________________________________");
            } else {
                boleto = juego.split("[-/]");

                for (int i = 0; i < boleto_int.length; i++) {
                    boleto_int[i] = Integer.parseInt(boleto[i]);
                }

                for (int i = 0; i < boleto_int.length - 1; i++) {
                    existe_numero = Arrays.asList(numeros).contains(boleto_int[i]);
                    if (!existe_numero) {
                        System.out.println("ERROR. Un número introcido no es válido.");
                        System.out.println("________________________________________________________");
                        break;
                    }
                }

                for (int i = 0; i < boleto_sinreintegro.length; i++) {
                    boleto_sinreintegro[i] = boleto_int[i];
                }

                Arrays.sort(boleto_sinreintegro);
                duplicados = false;
                for (int i = 0; i < boleto_sinreintegro.length - 1; i++) {

                    if (boleto_sinreintegro[i] == boleto_sinreintegro[i + 1]) {
                        System.out.println("ERROR. Hay números duplicados.");
                        System.out.println("________________________________________________________");
                        duplicados = true;
                        break;
                    }
                }
            }
        }

        reintegro_boleto=boleto_int[6];

        System.out.println("Ha salido:");

        for (int i = 0; i < premio.length; i++) {
            do {
                aux = random.nextInt(49) + 1;
            } while (Arrays.asList(premio).contains(aux));

            premio[i] = aux;
        }
        Arrays.sort(premio);

        do {
            complementario = random.nextInt(49) + 1;
        } while (Arrays.asList(premio).contains(complementario));

        reintegro=random.nextInt(10);

        System.out.println(Arrays.toString(premio));
        System.out.println("Complementario: " +complementario);
        System.out.println("Reintegro: " +reintegro);

        System.out.println("________________________________________________________");

        for (int i = 0; i < premio.length; i++) {
            if(Arrays.asList(premio).contains(boleto_sinreintegro[i])){
                aciertos++;
            }else{
                if(boleto_sinreintegro[i]==complementario){
                    acierto_complemetario++;
                }
            }
        }
        if (reintegro==reintegro_boleto){
            acierto_reintegro++;
        }


        if(aciertos==6 && acierto_reintegro==1){
            categoria="Categoría Especial: 6 números y el complementario.";
        } else if (aciertos==6) {
            categoria="1ª Categoría: 6 números.";
        } else if (aciertos==5 && acierto_complemetario==1){
            categoria="2ª Categoría: 5 números y el complementario.";
        } else if (aciertos==5){
            categoria="3ª Categoría: 5 números.";
        } else if (aciertos==4){
            categoria="4ª Categoría: 4 números.";
        } else if (aciertos==3){
            categoria="5ª Categoría: 3 números.";
        } else if (acierto_reintegro==1) {
            categoria="Reintegro.";
        } else {
            categoria="No premiado.";
        }

        System.out.println("RESULTADOS:");
        System.out.println(aciertos + " aciertos.");

        if(acierto_complemetario==1) {
            System.out.println("Complementario.");
        }

        if(acierto_reintegro==1) {
            System.out.println("Reintegro.");
        }

        System.out.println("Premio: " + categoria);

    }
}
