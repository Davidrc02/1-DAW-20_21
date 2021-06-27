package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio05 {

/*
Algoritmo que calcule el perimetro de una circunferencia
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        double perimetro, radio, pi=3.1415;
        System.out.println("Introduzca el radio");
        radio=entrada.nextInt();
        perimetro=2*pi*radio;
        System.out.println("El perimetro de la circunferencia con radio "+radio+" es: "+perimetro);
    }
    
}
