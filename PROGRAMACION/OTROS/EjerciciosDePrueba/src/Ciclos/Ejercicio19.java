package Ciclos;

import java.util.Scanner;

public class Ejercicio19 {

/*
Dadas 6 notas, escribir la cantidad de alumnos 
aprobados, condicionales(=4) y suspensos.
*/  
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota, aprobados=0, condicionales=0, suspensos=0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduzca la nota del alumno "+(i+1));
            nota=entrada.nextInt();
            switch(nota){
                case 1:
                case 2:
                case 3: 
                    suspensos++;
                    break;
                case 4:
                    condicionales++;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    aprobados++;
                    break;
                default:
                    System.out.println("La nota introducida no es válida");
                    return;
            }
        }
        System.out.println("La cantidad de aprobados es de: "+aprobados+".\n"
                +"La cantidad de suspensos es de : "+suspensos+".\n"
                +"La cantidad de condicionales es de : "+condicionales+".");
    } 
}
