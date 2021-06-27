package Ciclos;
import java.util.Scanner;

/*Leer números hasta que se introduzca un 0.
Para cada uno indicar si es par o impar.*/

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número :");
        num=entrada.nextInt();
        while(num!=0){
            if(num%2==0){
                System.out.println("Es par");
            }
            else if (num%2!=0){
                System.out.println("Es impar");
            }
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt();
        }
        System.out.println("El número que ha introducido es "+num);
        System.out.println("Fin del ejercicio");
    }  
}