package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio10 {

/*
Algoritmo que calcule el área de una circunferencia
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double volumen, radio, pi=3.1415;
        System.out.println("Introduzca el radio");
        radio=entrada.nextInt();
        volumen=4/3*pi*radio*radio*radio;
        System.out.println("El volumen de la esfera con radio "+radio+" es: "+volumen);
    }
}
