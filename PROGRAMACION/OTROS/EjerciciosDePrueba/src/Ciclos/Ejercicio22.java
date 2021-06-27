package Ciclos;

import java.util.Scanner;

public class Ejercicio22 {

/*
Pedir 5 notas de alumnos y decir al final si hay algun suspenso
*/

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota;
        boolean haysuspensos=false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la nota "+(i+1));
            nota=entrada.nextInt();
            if(nota<0||nota>10){
                System.out.println("Por favor introduzca una nota válida");
                nota=entrada.nextInt();
                if (nota<0){
                    System.out.println("No ha introducido una nota válida, por tanto se cierra el programa");
                    return;
                }
            }
            else if (nota>=0&&nota<=10){
                if(nota<=4&&nota>=0){
                    haysuspensos=true;
                }
            }
        }
        if(haysuspensos==true){
        System.out.println("Hay al menos un suspenso");
        }
        else
            System.out.println("No hay suspensos");
    }  
}
