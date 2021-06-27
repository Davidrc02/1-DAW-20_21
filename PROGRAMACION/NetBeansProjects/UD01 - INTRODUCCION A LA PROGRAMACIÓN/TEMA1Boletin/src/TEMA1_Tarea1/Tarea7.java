package TEMA1_Tarea1;

import java.util.Scanner;

public class Tarea7 {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada= new Scanner(System.in);
        int opc;
        System.out.println("-----------------------TAREA 7-----------------------");
        System.out.println("Introduzca 1 para el ejrcicio1 o 2 para el ejercicio2");
        opc=entrada.nextInt();
        switch(opc){
            case 1:Ejercicio01();
                break;
            case 2:Ejercicio02();
                break;
            default:
                System.out.println("No has introducido ni 1 ni 2");
        }
        System.out.println("--------------------FIN APLICACIÓN---------------------");
    }   
    public static void Ejercicio01(){
        /*
        Escribir un programa en Java que declare una
        variable de cada uno de los tipos de datos propios
        del lenguaje y las inicialice a los valores que consideres.
        Posteriormente visualiza en pantalla el valor de todas ellas. 
        */
        int entero=1;
        String cadena="string";
        double doble=1.5;
        float flotante=1.5F;
        boolean condicion=true;
        char caracter='a';
        System.out.println("Entero: "+entero+", Cadena: "+cadena+", Doble: "+doble+", Flotante: "+flotante+", Condición: "+condicion+", Caracter"+caracter);
    }
    public static void Ejercicio02(){
        /*
        Escribir un programa en Java que declare dos variables 
        numéricas enteros e inicializalas a los valores 15 y 10
        respectivamente. Muestra en pantalla el resultado de la suma,
        resta, multiplicación y división de ambos.
        */
        int num1=15, num2=10, suma, resta, division, producto;
        suma=num1+num2;
        resta=num1-num2;
        division=num1/num2;
        producto=num1*num2;
        System.out.println("Suma: "+suma+", Resta: "+resta+", Division: "+division+", Producto: "+producto);
    }
}
