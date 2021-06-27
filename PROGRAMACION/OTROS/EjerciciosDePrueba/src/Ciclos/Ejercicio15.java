package Ciclos;

import java.util.Scanner;

public class Ejercicio15 {

/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad
de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad, altura, edad_total, cont_edad=0, cont_altura=0, cont_edad18=0, cont_altura175=0;
        double edad_media, altura_media, suma_edad=0, suma_altura=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la edad del alumno "+(i+1));
            edad=entrada.nextInt();
            if(edad<0){
                System.out.println("Por favor introduzca una edad válida");
                edad=entrada.nextInt();
                if (edad<0){
                    System.out.println("No ha introducido una edad válida, por tanto se cierra el programa");
                    return;
                }
            }
            cont_edad++;
            suma_edad+=edad;
            System.out.println("Introduzca la altura(en cm) del alumno "+(i+1));
            altura=entrada.nextInt();
            if(altura<0){
                System.out.println("Por favor introduzca una altura válida");
                altura=entrada.nextInt();
                if (altura<0){
                    System.out.println("No ha introducido una altura válida, por tanto se cierra el programa");
                    return;
                }
            }
            suma_altura+=altura;
            cont_altura++;
            if(edad>=18){
                cont_edad18++;
            }
            if(altura>=175){
                cont_altura175++; 
            }
        }
        edad_media= (double) suma_edad/cont_edad;
        altura_media= (double) suma_altura/cont_altura;
        System.out.println("La edad media es: "+ edad_media);
        System.out.println("La altura media es : "+ altura_media);
        System.out.println("Hay "+cont_edad18+" alumno/s con 18 o más años");
        System.out.println("Hay "+cont_altura175+" alumno/s que miden 1.75m o más");
    }  
}