package Ciclos;
import java.util.Scanner;

public class Ejercicio04 {

/*Pedir números hasta que se teclee
uno negativo, y mostrar cuántos números se han introducido.*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num, cont=0;
        System.out.println("Introduzca un número: ");
        num=entrada.nextInt();
        while(num>=0){
            cont++;
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt();
        }
        System.out.println("Se han introducido "+cont+" números.");
        System.out.println("Fin del ejercicio");
    } 
}
