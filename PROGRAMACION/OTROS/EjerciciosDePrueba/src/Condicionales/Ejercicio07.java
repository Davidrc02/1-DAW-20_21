package Condicionales;
import java.util.Scanner;

public class Ejercicio07 {

/*
Pedir tres numeros y mostrarlos de mayor a menor   
*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a, b, c;
        System.out.println("Introduzca a");
        a=entrada.nextInt();
        System.out.println("Introduzca b");
        b=entrada.nextInt();
        System.out.println("Introduzca c");
        c=entrada.nextInt();
        if(a>b&&a>c&&b>c){
            System.out.println("El orden es abc");
        }
        else if(a>b&&a>c&&c>b){
            System.out.println("El orden es acb");
        }
        else if(b>a&&b>c&&a>c){
            System.out.println("El orden es bac");
        }
        else if(b>a&&b>c&&c>a){
            System.out.println("El orden es bca");
        }
        else if(c>a&&c>b&&a>b){
            System.out.println("El orden es cab");
        }
        else if(c>a&&c>b&&b>a){
            System.out.println("El orden es cba");
        }
    }
} 

