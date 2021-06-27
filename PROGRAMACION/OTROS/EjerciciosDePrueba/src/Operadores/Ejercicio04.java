package Operadores;

import java.util.Scanner;

public class Ejercicio04 {
    /*Una compañía de venta de carros usados, paga a su personal 
    de ventas un salario de 1000$ mensuales, más una comisión de 
    150$ por cada carro vendido, más el 5% del valor de la venta 
    por carro. Cada mes el capturista de la empresa ingresa en la 
    computadora los datos pertinentes. Haz una aplicación que 
    calcule y muestre el salario mensual de un vendedor dado
    */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double salariofijo=1000, comision=150, 
        valorCarro, numCarros, salario;
        System.out.println("Ingrese el numero de carros vendidos: ");
        numCarros=entrada.nextDouble();
        System.out.println("Ingrese el valor del carro: ");
        valorCarro=entrada.nextDouble();
        salario= salariofijo+(comision*numCarros)+((numCarros*valorCarro)*0.05);
        System.out.println("Su salario es de: "+salario+" dólares");
        
    }
    
}
