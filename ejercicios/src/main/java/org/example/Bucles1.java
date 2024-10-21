package org.example;

import java.util.Scanner;

public class Bucles1 {

    public void bucles1() {

        Scanner entrada = new Scanner(System.in);

        String pswd = "patata";
        String pswd_usurario;

        do {
            System.out.println("Introduce tu contraseña:");
            pswd_usurario = entrada.next();
        }

        while (!pswd_usurario.equals(pswd));

        System.out.println("Bienvenido. Contraseña correcta.");

    }
}
