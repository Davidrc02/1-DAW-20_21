package Ciclos;

import java.util.Scanner;

public class Ejercicio06 {

/*
Pedir números hasta que se introduzca un 0, mostrar
la suma de todos los números introducidos.
*/
  
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num, suma=0;
        
        do{
            System.out.println("Introduzca un numero: ");
            num=entrada.nextInt();
            suma= suma + num;
        }
        while(num!=0);
        System.out.println("La suma es: "+suma);
    }  
}
