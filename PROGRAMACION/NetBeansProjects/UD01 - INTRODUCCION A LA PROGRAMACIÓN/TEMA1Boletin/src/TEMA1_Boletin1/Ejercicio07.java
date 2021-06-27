package TEMA1_Boletin1;

import java.util.Scanner;

public class Ejercicio07 {

/*
Escribe un programa que dados cinco  números enteros
positivos cualesquiera, calcule su suma y  su multiplicación.    
*/
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int num, suma=0, producto=1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un número");
            num=entrada.nextInt();
            if(num>=0){
                suma=suma+num;
                producto=producto*num;
            }
            else if(num<0){
                System.out.println("Introduzca un número positivo");
                num=entrada.nextInt();
                if(num>=0){
                    suma=suma+num;
                    producto=producto*num;
                }
                else{
                    System.out.println("Ha introducido dos veces un número negativo");
                    return;
                }
            }
            else{
                System.out.println("Ha habido un fallo");
                return;
            }
        }
        System.out.println("La suma de los 5 números enteros es: "+suma
                +" y su producto es: "+producto);
    } 
}
