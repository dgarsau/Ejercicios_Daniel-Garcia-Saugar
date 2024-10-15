package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadExcepciones {

    public void actividadexcepciones() {

        Scanner entrada = new Scanner(System.in);

        LocalDateTime actual = LocalDateTime.now();

        int anyo_actual = actual.getYear();
        int anyo_int = 1800;
        int anyos = 0;

        boolean error = true;

        while (error == true) {

            System.out.println("Elige el modo (1/2)");
            String modo = entrada.next();

            switch (modo) {

                case "1":

                    System.out.println("¿En que año naciste?");
                    String anyo = entrada.next();

                    try {
                        anyo_int = Integer.parseInt(anyo);
                    } catch (NumberFormatException e1) {
                        System.out.println("Has introducido un formato erróneo. No es un número.");
                        entrada.nextLine();
                    }

                    if (anyo_int < 1900 || anyo_int > anyo_actual) {
                        System.out.println("El año introducido no es correcto.");

                    }else{
                        error=false;
                    }
                    break;

                case "2":

                    System.out.println("¿Cuántos años tienes?");

                    try {
                        anyos = entrada.nextInt();
                    } catch (InputMismatchException e2) {
                        System.out.println("Has introducido un formato erróneo. No es un número.");
                        entrada.nextLine();
                    }

                    anyo_int = anyo_actual - anyos;

                    if (anyo_int > 2024 || anyo_int < 1900) {
                        System.out.println("La entrada introducida no es válida");
                    }else{
                        error=false;
                    }
                    break;

                default:
                    System.out.println("El modo introducido no es correcto");
                    break;

            }

                    if (anyo_int >= 1900 && anyo_int <= 1927) {
                        System.out.println("Eres de la generación no bautizada");
                    } else if (anyo_int >= 1928 && anyo_int <= 1944) {
                        System.out.println("Eres de la generación silent");
                    } else if (anyo_int >= 1945 && anyo_int <= 1964) {
                        System.out.println("Eres Baby Boomer");
                    } else if (anyo_int >= 1965 && anyo_int <= 1981) {
                        System.out.println("Eres de la generación X");
                    } else if (anyo_int >= 1982 && anyo_int <= 1994) {
                        System.out.println("Eres Millennial");
                    } else if (anyo_int >= 1995 && anyo_int <= 2009) {
                        System.out.println("Eres de la generación Z");
                    }
            }

        }

    }


