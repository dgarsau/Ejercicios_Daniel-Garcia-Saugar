package org.example;

import java.util.Random;

public class Random4 {
    public void random4(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tam = caracteres.length();

        Random random = new Random();

        int longitud_contrasenya = random.nextInt(3) +6;

        int indice;
        String contrasenya="";

        for (int i=0; i<longitud_contrasenya; i++){

            indice = random.nextInt(tam);
            contrasenya += caracteres.charAt(indice);

        }

        System.out.println(contrasenya);
    }
}
