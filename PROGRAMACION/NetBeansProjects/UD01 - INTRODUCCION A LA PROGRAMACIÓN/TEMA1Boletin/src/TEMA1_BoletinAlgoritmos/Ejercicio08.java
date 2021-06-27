package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio08 {

/*
Algoritmo que calcule el área de una circunferencia
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double area, radio, pi=3.1415;
        System.out.println("Introduzca el radio");
        radio=entrada.nextInt();
        area=pi*radio*radio;
        System.out.println("El área de la circunferencia con radio "+radio+" es: "+area);
    }
}