package TEMA1_Boletin1;

import java.util.Scanner;

public class Ejercicio06 {

/*Escribe un programa que dado tu nombre y 
apellidos, te salude de forma personalizada.
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        String nombre, apellido;
        System.out.println("¿Cuál es tu nombre?");
        nombre=entrada.nextLine();
        System.out.println("¿Cuál es tu apellido?");
        apellido=entrada.nextLine();
        System.out.println("Hola "+nombre+" "+apellido);
    }
}
