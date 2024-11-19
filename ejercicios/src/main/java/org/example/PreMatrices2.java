package org.example;

import java.util.Scanner;

public class PreMatrices2 {
    public void prematrices2(){

        Scanner entrada = new Scanner(System.in);

        int altura;
        String arbol="*";

        System.out.println("Cómo de alto quieres el arbol: ");
        altura = entrada.nextInt();


        for (int i = 0; i < altura; i++) {

            System.out.println(arbol);
            arbol=arbol.concat("*");

        }

    }
}
