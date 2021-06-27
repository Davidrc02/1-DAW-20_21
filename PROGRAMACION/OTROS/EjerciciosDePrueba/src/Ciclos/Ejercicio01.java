package Ciclos;
import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca un número");
        num=entrada.nextInt();
        while(num>=0){
            System.out.println(Math.pow(num,2));
            System.out.println("Introduzca otro número");
            num=entrada.nextInt();
        }
        System.out.println("Fin de el bucle");
    } 
}
