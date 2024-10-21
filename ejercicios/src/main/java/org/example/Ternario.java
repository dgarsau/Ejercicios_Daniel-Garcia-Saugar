package org.example;

import java.sql.Time;

public class Ternario {
    public void ternario() {


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

        int a=2, b=2, c=4;

        int resultado =c<b ? a*=4:
                a>0 && b>c ? a+=c:
                    a++*2==c ? a*=10 : a--;

        System.out.println(resultado);



    }

}
