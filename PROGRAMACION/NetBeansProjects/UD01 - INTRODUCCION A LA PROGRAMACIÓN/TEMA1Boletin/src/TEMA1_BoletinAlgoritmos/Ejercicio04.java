package TEMA1_BoletinAlgoritmos;

import java.util.Scanner;

public class Ejercicio04 {

/*
Algoritmo que calcule el área de un triángulo
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int base, altura, area;
        System.out.println("Introduzca la base");
        base=entrada.nextInt();
        System.out.println("Introduzca la altura");
        altura=entrada.nextInt();
        area=(base*altura)/2;
        System.out.println("El area del cuadrado con base "+base+" y altura "+altura+" es: "+area);
    }
    
}
