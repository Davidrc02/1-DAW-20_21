package Condicionales;

import java.util.Scanner;

public class Ejercicio12 {

    /*Pedir una nota de 0 a 10 y mostrarla de
    la forma: Insuficiente, Suficiente, Bien,
    Notable y Sobresaliente
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int letra;
        
        System.out.println("Introduzca su nota");
        letra=entrada.nextInt();
        switch(letra){
            case 0:
            case 1:
            case 2: 
            case 3: 
            case 4: System.out.println("Su nota es Insuficiente");
                break;
            case 5: System.out.println("Su nota es Sufieciente");
                break;
            case 6: System.out.println("Su nota es Bien");
                break;
            case 7:             
            case 8: System.out.println("Su nota es Notable");
                break;
            case 9: 
            case 10: System.out.println("Su nota es Sobresaliente");
                break;
            default: System.out.println("Nota no válida");
        }
    }
}