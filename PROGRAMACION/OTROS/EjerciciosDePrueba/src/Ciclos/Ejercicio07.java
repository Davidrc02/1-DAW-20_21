package Ciclos;

import java.util.Scanner;

public class Ejercicio07 {

/*
Pedir números hasta que se introduzca 
uno negativo, y calcular la media.
*/
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);    
        int num, suma=0, cont=0;
        double media;        
        
        do{
            System.out.println("Introduzca un numero: ");
            num=entrada.nextInt();
            if(num>0){
            suma=suma+num;
            cont++;
            }
        }
        while(num>0);
        media=suma/cont;
        System.out.println("La media es: "+media);
    }  
}
