package Condicionales;
import java.util.Scanner;

public class Ejercicio08 {
    
/*
Pedir un número entre 0 y 99999 y decir cuantas cifras tiene
 */
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Integer num, cifras;
        System.out.println("Introduzca un número comprendido entre 1 y 99.999");
        num=entrada.nextInt();
        cifras = String.valueOf(num).length();
        if(num >=0 && num <= 99999){            
            System.out.println("El numero tiene " + cifras + " cifras" );
        }else{            
            System.out.println("El número está fuera del rango");
        }
    }
}