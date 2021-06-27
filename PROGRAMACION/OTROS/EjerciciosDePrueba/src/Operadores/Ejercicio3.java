package Operadores;

import java.util.Scanner;

public class Ejercicio3 {

    /*Guillermo tiene n dólares. Luis tiene la mitad 
    de lo que posee Guillermo. Juan tiene la mitad de 
    lo que posee Luis y Guillermo juntos.
    Haz una aplicación que calcule y muestre la cantidad
    de dinero que tiene cada uno
    */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float dineroGuillermo;
        float dineroLuis, dineroJuan;
        System.out.println("Introduce el dinero tiene Guillermo: ");
        dineroGuillermo=entrada.nextFloat();
        dineroLuis= dineroGuillermo/2;
        dineroJuan= (dineroGuillermo+dineroLuis)/2;
        System.out.println("Guillermo tiene "+dineroGuillermo+" dólares");
        System.out.println("Luis tiene "+dineroLuis+" dólares");
        System.out.println("Juan tiene "+dineroJuan+" dólares");
        System.out.println("Todos juntos tienen "
                +(dineroGuillermo+dineroLuis+dineroJuan)+" dólares");
    }
}
