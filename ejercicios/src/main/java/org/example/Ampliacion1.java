package org.example;

import java.util.Scanner;

public class Ampliacion1 {
    public void ampliacion1() {

        Scanner entrada = new Scanner(System.in);

        int primo = 0;
        boolean primo1 = true;
        String secuencia = "Números primos: ";

        System.out.println("¿Hasta que número quieres?");
        int cantidad = entrada.nextInt();

        for (int i = 2; i < cantidad; i++) {
            primo1=true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo1=false;
                    break;
                }
            }

            if (primo1){
               secuencia=secuencia.concat(" ," + i);
            }
        }

        System.out.println(secuencia);
    }
}
