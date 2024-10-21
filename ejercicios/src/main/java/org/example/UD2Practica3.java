package org.example;

import java.util.Scanner;

public class UD2Practica3 {
    public void UD2practica3() {

        Scanner entrada = new Scanner(System.in);

        char caracter;
        boolean error = false;
        int cifra;
        int resultado;
        int sum = 0;
        int posicion = 0;
        int falta = 0;


        System.out.println("Introduce un ISBN:");
        String ISBN = entrada.next();


        for (int i = 0; i < 10; i++) {

            caracter = ISBN.charAt(i);

            if (caracter == 'X') {
                cifra = 10;

            } else if (caracter == '?') {
                error=true;
                posicion=(10-i);
                continue;
            }

            else {
                cifra = Integer.parseInt(String.valueOf(caracter));
            }

        resultado = cifra * (10-i);
        sum += resultado;

        }

        if (error){

            for(int j=0; j<10; j++) {

                if ((sum+j*posicion)%11==0){
                    System.out.println("El dígito que falta es "+ j);
                }

                //falta = sum - falta;
                //System.out.println("El dígito que falta es " + falta);

            }
        } else if (sum % 11 == 0){
            System.out.println("El ISBN es válido");
        }
        else {
            System.out.println("El ISBN no es válido");
        }
    }

}



