package TEMA1_Boletin1;

public class Ejercicio04 {

/*
Escribe un programa que escriba 5 veces tu nombre y 
edad (nombre y edad serán variables del tipo de datos
que consideres necesario e inicializadas a valores concretos).
*/
    public static void main(String[] args) {
        int edad;
        String nombre;
        edad=18;
        nombre="David";
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre+" "+edad);
        }
    }
}
