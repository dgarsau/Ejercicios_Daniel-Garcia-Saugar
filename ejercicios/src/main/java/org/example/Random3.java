package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Random3 {
    public void random3(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int num;
        int cantidad=0;
        int max=0;
        int min=0;
        boolean error = true;

        while(error) {

            try {

                System.out.println("Introduce el valor mínimo:");
                min = entrada.nextInt();
                System.out.println("Introduce el valor máximo:");
                max = entrada.nextInt();

                if (min > max) {
                    System.out.println("ERROR. El mínimo no puede ser mayor que el máximo");
                } else {
                    error = false;
                    System.out.println("¿Cuántos números quieres?");
                    cantidad = entrada.nextInt();
                }

            }
            
            catch (InputMismatchException e){
                System.out.println("ERROR. Entrada no válida.");
                entrada.nextLine();
                error = true;

            }

        }

        for(int i=0; i<cantidad; i++){
            num = random.nextInt(max - min + 1) + min;
            System.out.println(num);
        }

    }
}
