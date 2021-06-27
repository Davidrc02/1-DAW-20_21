package Operadores;
import java.util.Scanner;

public class Ejercicio07 {
    
/*Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas 
equivalentes. Por ejemplo, dado un total de 1000 horas
debe mostrar 5 semanas, 6 días y 16 horas.*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        final int horas;
        int dias, semanas, horas2;
        System.out.println("Introduzca un número total de horas: ");
        horas=entrada.nextInt();
        dias=((horas/24)%7);
        semanas=((horas/24)/7);
        horas2=horas%24;
        System.out.println(horas+" horas son: "+semanas+" semanas, "
                + dias+" dias, "+horas2+" horas.");
    }
}
