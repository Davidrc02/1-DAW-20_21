package Operadores;

import java.util.Scanner;

public class Ejercicio05 {
    
/* La calificación final de un estudiante de Informática 
se calcula con base a las calificaciones de cuatro aspectos
de su rendimiento académico: participación, primer examen parcial,
segundo examen parcial y examen final.     Sabiendo que las 
calificaciones anteriores entran a la calificación final con 
ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que 
calcule e imprima la calificación final obtenida por un estudiante.*/
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double participacion, examen1, examen2, examenfinal, calificacion;
        System.out.println("Introduzca la calificación de la participación: ");
        participacion=entrada.nextDouble();
        System.out.println("Introduzca la calificación del primer parcial: ");
        examen1=entrada.nextDouble();
        System.out.println("Introduzca la calificación del segundo parcial: ");
        examen2=entrada.nextDouble();
        System.out.println("Introduzca la calificación del examen final: ");
        examenfinal=entrada.nextDouble();
        calificacion=(0.1*participacion)+(0.25*examen1)+
        (0.25*examen2)+(0.4*examenfinal);
        System.out.println("Su calificación final es de: "+calificacion);
    }
    
}
