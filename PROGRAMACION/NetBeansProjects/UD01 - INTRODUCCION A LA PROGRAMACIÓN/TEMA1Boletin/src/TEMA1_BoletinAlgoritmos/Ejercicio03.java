package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio03 {

/*
Algoritmo que calcule el área de un cuadrado    
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int lado, area;
        System.out.println("Introduzca el lado");
        lado=entrada.nextInt();
        area=lado*lado;
        System.out.println("El area del cuadrado con lado "+lado+ " es: "+area);
    }
    
}
