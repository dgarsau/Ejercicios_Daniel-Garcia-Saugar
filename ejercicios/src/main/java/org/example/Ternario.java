package org.example;

import java.sql.Time;

public class Ternario {
    public void ternario() {

        int a; int b; int c; int resultado;

        //CASO1

//        if (a++==2 && c>b++){
//            resultado=a+=b;
//        }
//        else if (a>0&&a==b){
//            resultado=a += c;
//        }
//        else if (a == c){
//            resultado=a++;
//        }else{
//            resultado=a--;
//        }
//

        //CASO2

//        if (a++==1 && a>b++){
//            resultado=a+=b;
//        }
//        else if (a>0&&a==b){
//            resultado=a+=c;
//        }
//        else if (a==c){
//            resultado=a++;
//        }else{
//            resultado=a--;
//        }

        //CASO 3

//        if(a++==1 && a>b++){
//            resultado=a+=b;}

//        } else if (a>0 && a==b){
//            resultado= a+=c;
//        } else if (b==c){
//            resultado=a++;
//        } else{
//            resultado=a--;
//        }

//        System.out.println(resultado);

        a = 1; b = 2; c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);


    }

}
