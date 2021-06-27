package TEMA1_Boletin1;

public class Ejercicio05 {
    
/*
Escribe un programa que dado un número real
muestre su doble, triple y cuádruple primero
de forma tabular y luego en filas   
*/
    
    public static void main(String[] args) {
        int num=7, doble, triple, cuadr;
        doble=2*num;
        triple=3*num;
        cuadr=4*num;
        System.out.println("Doble\tTriple\tCuádruple");
        System.out.println(doble+"\t"+triple+"\t"+cuadr);    
        System.out.println("El doble de "+num+" es "+doble);
        System.out.println("El triple de "+num+" es "+triple);
        System.out.println("El cuádruple de "+num+" es "+cuadr);
    }
}
