package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6() {

        Scanner entrada = new Scanner(System.in);

        boolean tomate = false;
        boolean aceite = false;
        boolean jamon = false;

        String aux;

        System.out.println("¿Tienes tomate? (S/N)");
        aux = entrada.next();

        if (aux.equals("S")) {
            tomate = true;
        }

        System.out.println("¿Tienes aceite? (S/N)");
        aux = entrada.next();

        if (aux.equals("S")) {
            aceite = true;
        }

        System.out.println("¿Tienes jamon? (S/N)");
        aux = entrada.next();

        if (aux.equals("S")) {
            jamon = true;
        }


        if (tomate == true && aceite == true && jamon == true) {
                System.out.println("No hay que ir a comprar");
        }

        else
                System.out.println("Hay que ir a comprar");

        }


    }




