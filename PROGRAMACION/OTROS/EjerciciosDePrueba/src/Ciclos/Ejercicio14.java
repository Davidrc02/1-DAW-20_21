package Ciclos;

import java.util.Scanner;

public class Ejercicio14 {

/*
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double sueldo;
        int cont=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca el sueldo numero "+(i+1));
            sueldo=entrada.nextDouble();
            if(sueldo<0){
                System.out.println("Tiene que introducir un sueldo positivo: ");
                sueldo=entrada.nextDouble();
            }
            else if (sueldo>1000){
                cont++;
            }
        }
        System.out.println("Hay "+cont+" sueldo/s de +$1000.");
    } 
}
