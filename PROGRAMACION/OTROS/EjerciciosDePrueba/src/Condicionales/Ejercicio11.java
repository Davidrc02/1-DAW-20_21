package Condicionales;

import java.util.Scanner;

/*Construir un programa que simule el
funcionamiento de una calculadora que 
puede realizar las  cuatro operaciones 
aritméticas básicas (suma, resta, producto
y división) con valores numéricos enteros.
El usuario debe especificar la operación con
el primer carácter del primer parámetro de
la línea de comandos: S o s para la suma,
R o r para la resta, P, p, M o m para el
producto y D o d para la división.
*/

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double num1, num2, suma, resta, producto, division;
        char letra;
        
        System.out.println("Introduzca el primer dígito");
        num1=entrada.nextDouble();
        System.out.println("Introduzca el segundo dígito");
        num2=entrada.nextDouble();
        System.out.println("¿Qué operación desea realizar?\nIntroduzca"
                + " s/S para suma, r/R para resta, d/D para division,"
                + " p/P/m/M para producto.");
        letra=entrada.next().charAt(0);
        suma=num1+num2;
        resta=num1-num2;
        producto=num1*num2;
        division=num1/num2;
        switch(letra){
            case 's':
            case 'S': System.out.println("La suma es: "+suma);
                break;
            case 'r': 
            case 'R': System.out.println("La resta es: "+resta);
                break;
            case 'd': 
            case 'D': System.out.println("La división es: "+division);
                break;
            case 'm':             
            case 'M':
            case 'p': 
            case 'P': System.out.println("El producto es: "+producto);
                break;
            default: System.out.println("Opción introducida no válida");
        }
    }
}
