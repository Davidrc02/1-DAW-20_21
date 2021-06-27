package Ciclos;
public class Ejercicio11 {

/*
Diseñar un programa que muestre el producto de los 10 primeros números impares
*/
    public static void main(String[] args) {
        int num=1,producto=1;
        for (int i = 0; i < 10; i++) {
            producto=producto*num;
            num+=2;            
        }
        System.out.println(producto);
    }
    
}
