package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio09 {

/*
Algoritmo que calcule el área de una circunferencia
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double num1, num2, num3, media;
        System.out.println("Introduzca el radio");
        num1=entrada.nextDouble();
        System.out.println("");
        num2=entrada.nextDouble();
        System.out.println("");
        num3=entrada.nextDouble();
        media=(num1+num2+num3)/3;
        System.out.println("La media de "+num1+", "+num2+" y "+num3+" es :"+media);
    }
}