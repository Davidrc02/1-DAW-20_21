package gestionalumno;

import java.util.Scanner;
import gestionalumno.GestionAlumno;
import gestionalumno.Alumno;

public class AplicacionAlumno {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
    int tam;
        System.out.println("Introduzca el tamaño de la clase: ");
    tam=entrada.nextInt();
    GestionAlumno g =new GestionAlumno(tam);
    int opc= menu(); 
    switch1(opc, g);
        
    }
    public static int menu(){
    Scanner entrada=new Scanner(System.in);
        int opc;
        System.out.println("1.- Crear alumno\n" +
        "2.- Poner o modificar nota\n" +
        "3.- Borrar alumno (como no pueden quedar huecos vacíos en el array, el borrado de una posición conlleva el desplazamiento de objetos alumno para que todos ellos queden juntos empezando siempre desde la posición 0).\n" +
        "4.- Listado clase\n" +
        "5.- Obtener datos alumno/s con máxima nota\n" +
        "6.- Obtener datos alumno/s con mínima nota\n" +
        "7.- Consultar nota media clase    \n" +
        "8.- Estadísticas de clase (Números de suspensos, suficientes, bien, notables y sobresalientes)\n" +
        "9.- Listado de NIE.\n" +
        "10.- Salir\n\n"+
        "Introduzca una opción");
    opc=entrada.nextInt();
    return opc;
    }
    
    public static void switch1(int opc, GestionAlumno g){
        Scanner entrada=new Scanner(System.in);
        int nie;
        double nota;
        String nombre;
        do{
        switch(opc){
            case 1: g.insertar();
                System.out.println("Alumno creado");
                break;
            case 2: System.out.println("Introduzca su nie: ");
                    nie=entrada.nextInt();
                    System.out.println("Introduzca su nota");
                    nota=entrada.nextDouble();
                g.modificarNota(nie, nota);
                    System.out.println("La nueva nota del alumno con nie: "+nie+" es: "+nota);
                break;
            case 3:
                System.out.println("Introduzca su nie: ");
                nie=entrada.nextInt();
                g.borrarAlumno(nie);
                System.out.println("Alumno borrado");
                break;
            case 4: 
                g.listadoClase();
                break;
            case 5: 
                g.aMejorNota();
                break;
            case 6: 
                g.aPeorNota();
                break;
            case 7:
                g.mediaNotas();
                break;
            case 8:
                g.estadisticas();
                break;
            case 9:
                g.listaNies();
                break;
            case 10:
                return;
        }
        }while(true);       
        
    }            
}
    