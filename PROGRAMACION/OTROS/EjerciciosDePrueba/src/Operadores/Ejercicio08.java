package Operadores;

import java.util.Scanner;

public class Ejercicio08 {

    /*Construir un programa que calcule y muestre
    por pantalla las raices de la ecuación de 
    segundo grado de coeficientes reales.
    */
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a,b,c, x1, x2, raiz;
        System.out.println("Ingrese a: ");
        a=entrada.nextDouble();
        System.out.println("Ingrese b: ");
        b=entrada.nextDouble();
        System.out.println("Ingrese c: ");
        c=entrada.nextDouble();
        raiz=Math.sqrt((Math.pow(b,2))-(4*(a)*(c)));
        x1=(-(b)+(raiz))/(2*(a));
        x2=(-(b)-(raiz))/(2*(a));
        System.out.println("X1= "+x1+" y X2= "+x2);
    } 
}
