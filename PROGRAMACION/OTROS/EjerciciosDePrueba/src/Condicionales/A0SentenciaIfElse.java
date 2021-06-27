package Condicionales;

import java.util.Scanner;

public class A0SentenciaIfElse {

    public static void main(String[] args) {
        int num, dato=5;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        
        if(num==dato){
            System.out.println("El número es igual a 5");
        }
        else
            System.out.println("El número introducido es distinto a 5 o no es un número");
    }
    
}
