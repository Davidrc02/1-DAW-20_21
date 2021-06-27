package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio06 {

/*
Algoritmo que calcule el área de un rectangulo
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int base, altura, area, perimetro;
        System.out.println("Introduzca la base");
        base=entrada.nextInt();
        System.out.println("Introduzca la altura");
        altura=entrada.nextInt();
        area=base*altura;
        perimetro=base*2+altura*2;
        System.out.println("Base: "+base+", Altura: "+altura+", Area: "+area+", Perimetro: "+perimetro);
    }
    
}
