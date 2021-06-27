package Operadores;

import java.util.Scanner;

public class Ejercicio6 {

    //Haz una aplicación que calcule el cuadrado de una suma
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a, b, cuadrado;
        System.out.println("Introduzca a: ");
        a=entrada.nextDouble();
        System.out.println("Introduzca b: ");
        b=entrada.nextDouble();
        cuadrado= Math.pow(a,2)+Math.pow(b, 2)+(2*a*b);
        System.out.println("El cuadrado es: "+ cuadrado);
    }   
}
