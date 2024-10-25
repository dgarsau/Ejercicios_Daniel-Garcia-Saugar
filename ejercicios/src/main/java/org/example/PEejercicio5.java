package org.example;

import java.util.Scanner;

public class PEejercicio5 {
    public void peejercicio5() {

        int sueldo;
        int sueldo_mayor=0;
        int mayor=0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce un sueldo:");
            sueldo = entrada.nextInt();

            if (sueldo > 1000) {
                mayor++;
            }

            if (sueldo>sueldo_mayor){
                sueldo_mayor=sueldo;
            }


        }
        System.out.println("Hay " + mayor + " sueldos mayores a 1000€");
        System.out.println(sueldo_mayor + "€ es el sueldo más alto");
    }
}


