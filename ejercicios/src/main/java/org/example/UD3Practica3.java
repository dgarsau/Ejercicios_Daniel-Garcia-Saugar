package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UD3Practica3 {
    public void UD3practica3() {

        Scanner entrada = new Scanner(System.in);

        int m;
        int n;
        int aux = 0;

        int palabras=0;

        boolean error = true;

        String fila = "";
        String palabrastring = "";

        String[][] sopa = new String[0][0];
        String[] linea = new String[0];
        String[] palabra = new String[0];

        int posicionm = -1;
        int posicionn = 0;

        while (error) {
            try {
                System.out.println("Introduce el número de filas:");
                m = entrada.nextInt();
                System.out.println("Introduce el número de columnas:");
                n = entrada.nextInt();

                sopa = new String[m][n];
                linea = new String[sopa[0].length];
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. La entrada no es válida.");
                entrada.nextLine();
            }
        }

        error = true;

        for (int i = 0; i < sopa.length; i++) {
            while (error) {
                System.out.println("Introduce las letras de la fila " + (i + 1) + ":");
                fila = entrada.next();
                if (fila.matches("[a-zA-Z]+") && fila.length()==sopa[0].length) {
                    error = false;
                } else {
                    System.out.println("ERROR. La entrada introducida no es válida.(Tienen que ser " + sopa[0].length + " letras)");
                }

            }
            error = true;
            linea = fila.split("");

            for (int j = 0; j < sopa[0].length; j++) {
                sopa[i][j] = linea[j];
            }
        }

        error=true;

        for (String[] filas : sopa) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                sopa[i][j]=sopa[i][j].toLowerCase();
            }
        }

        while(error){
            try{
                System.out.println("Cuántas palabras quieres buscar?");
                palabras=entrada.nextInt();
                error=false;
            }catch(InputMismatchException e){
                System.out.println("ERROR. La entrada introducida no es válida.");
                entrada.nextLine();
            }
        }

        for (int k = 1; k <= palabras; k++) {

            System.out.println("Introduce la palabra "+ k +":");
            palabrastring = entrada.next();
            palabrastring = palabrastring.toLowerCase();
            palabra = palabrastring.split("");

            for (int i = 0; i < sopa.length; i++) {
                for (int j = 0; j < sopa[0].length; j++) {
                    if (palabra[aux].equals(sopa[i][j])) {
                        if (aux == 0) {
                            posicionm = i;
                            posicionn = j;
                        }
                        aux++;
                        if (aux == palabra.length) {
                            System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En horizontal (Izquierda a derecha)");
                            aux = 0;
                            posicionm = -1;
                            posicionn = -1;
                        }
                    } else {
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                }
                aux=0;
            }

            for (int i = sopa.length - 1; i >= 0; i--) {
                for (int j = sopa[0].length - 1; j >= 0; j--) {
                    if (palabra[aux].equals(sopa[i][j])) {
                        if (aux == 0) {
                            posicionm = i;
                            posicionn = j;
                        }
                        aux++;
                        if (aux == palabra.length) {
                            System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En horizontal (Derecha a izquierda)");
                            aux = 0;
                            posicionm = -1;
                            posicionn = -1;
                        }
                    } else {
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                }
                aux=0;
            }

            for (int i = 0; i < sopa[0].length; i++) {
                for (int j = 0; j < sopa.length; j++) {
                    if (palabra[aux].equals(sopa[j][i])) {
                        if (aux == 0) {
                            posicionm = j;
                            posicionn = i;
                        }
                        aux++;
                        if (aux == palabra.length) {
                            System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En vertical (Arriba a abajo)");
                            aux = 0;
                            posicionm = -1;
                            posicionn = -1;
                        }
                    } else {
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                }
                aux=0;
            }

            for (int i = sopa[0].length - 1; i >= 0; i--) {
                for (int j = sopa.length - 1; j >= 0; j--) {
                    if (palabra[aux].equals(sopa[j][i])) {
                        if (aux == 0) {
                            posicionm = j;
                            posicionn = i;
                        }
                        aux++;
                        if (aux == palabra.length) {
                            System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En vertical (Abajo a arriba)");
                            aux = 0;
                            posicionm = -1;
                            posicionn = -1;
                        }
                    } else {
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                }
                aux=0;
            }

            for (int i = 0; i < sopa.length; i++) {
                if (palabra[aux].equals(sopa[i][i])) {
                    if (aux == 0) {
                        posicionm = i;
                        posicionn = i;
                    }
                    aux++;
                    if (aux == palabra.length) {
                        System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En diagonal (Izquierda a derecha)");
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                } else {
                    aux = 0;
                    posicionm = -1;
                    posicionn = -1;
                }
            }

            aux=0;

            for (int i = sopa.length - 1; i >= 0; i--) {
                if (palabra[aux].equals(sopa[i][i])) {
                    if (aux == 0) {
                        posicionm = i;
                        posicionn = i;
                    }
                    aux++;
                    if (aux == palabra.length) {
                        System.out.println("Encontrada! En la posicion " + posicionm + "," + posicionn + ". En diagonal (Derecha a izquierda)");
                        aux = 0;
                        posicionm = -1;
                        posicionn = -1;
                    }
                } else {
                    aux = 0;
                    posicionm = -1;
                    posicionn = -1;
                }
            }

            aux=0;
        }
    }
}


