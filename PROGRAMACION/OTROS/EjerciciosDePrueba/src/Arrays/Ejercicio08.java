package Arrays;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int numero;
        int posicion;
        //Pedimos los 8 números
        for(int i=0;i<8;i++){
            System.out.print("Digite un número: ");
            tabla[i] = entrada.nextInt();
        }
        //Pedimos el nuevo número que queremos insertar
        System.out.print("Digite el número que desea insertar en la tabla: ");
        numero = entrada.nextInt();
        //Pedimos la posición que queremos insertar
        System.out.print("Digite la posición donde quiere insertarlo: ");
        posicion = entrada.nextInt();
        /*Recorremos el arreglo desde la penúltima posición, ya que 
        aunque el arreglo tenga un tamaño de 10 números, tiene 9 posiciones, 
        ya que comienza en la posición [0], por lo tanto empezamos
        desde la posición 8 y vamos moviendo todos los números hasta llegar
        a la posición que hemos definido:*/
        for(int i=8;i>=posicion;i--){
            tabla[i+1] = tabla[i];
        }
        //Insertamos el número en la posición
        tabla[posicion] = numero;
        //Imprimimos el arreglo
        for(int i:tabla){
            System.out.println(i);
        } 
    } 
}
