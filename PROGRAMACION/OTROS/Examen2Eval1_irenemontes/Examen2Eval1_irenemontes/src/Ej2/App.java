package Ej2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Alumno miAlumno;
        int aprob=0, susp=0, uno=0;
        
        for (int i=0; i<10; i++) {
            miAlumno=cargarAlum();
            
            switch (miAlumno.asigSuspensas()){
                case 0:
                    aprob++;
                    break;
                case 1:
                    uno++;
                    break;
                case 2:
                    susp++;
            }
        }
        
        System.out.printf("Hay %d alumnos aprobados, %d suspensos y %d que solo aprobaron una.", aprob, susp, uno);
        
    }
    
    public static Asignatura cargarAsig(){
        Scanner entrada = new Scanner (System.in);
        Asignatura as1;
        int codigo, duracion;
        String nombre;
        float nota;
        
        System.out.println("Introduzca el código:");
        codigo=entrada.nextInt();
        
        do{
            System.out.println("Introduzca la duración:");
            duracion=entrada.nextInt();
        }while(duracion<0);
        
        System.out.println("Introduzca el nombre:");
        nombre=entrada.nextLine();
        
        do{
        System.out.println("Introduzca la nota:");
        nota=entrada.nextFloat();
        }while(nota<0||nota>10);
        
        as1 = new Asignatura (codigo, nombre, duracion, nota);
        
        return as1;
    }
    
    public static Alumno cargarAlum(){
        Scanner entrada = new Scanner (System.in);
        Alumno alum1;
        String nombre, dni;
        Asignatura asig1, asig2;
        
        System.out.println("Introduzca el nombre:");
        nombre=entrada.nextLine();
        System.out.println("Introduzca el dni:");
        dni=entrada.next();
        asig1=cargarAsig();
        asig2=cargarAsig();
        
        alum1 = new Alumno (nombre, dni, asig1, asig2);
        
        return alum1;
    }
    
    
}
