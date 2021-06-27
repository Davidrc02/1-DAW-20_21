package arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
//       La declaracion, como siempre, puede ir inicializada en la misma linea o aparte.
        int[] vector1= new int[5];
        char[] vector2;
        vector2= new char[5];
        Scanner entrada = new Scanner(System.in);
        cargarVector(vector1);
        mostrarVector(vector1);

       // Visualizamos el contenido del array:
        for(int i=0; i<vector1.length; i++)
            System.out.println(vector1[i]);

       // Modificamos el contenido del array:        
        
         for(int i=0; i<vector1.length; i++){
             System.out.println("Introduzca el valor de la posicion " + (i+1));
             vector1[i] = entrada.nextInt();
        }
         
        }         
        public static void cargarVector(int[] numeros){
             Scanner entrada = new Scanner(System.in);
             for(int i=0; i<numeros.length; i++){
             System.out.println("Introduzca el valor de la posicion " + (i+1));
             numeros[i] = entrada.nextInt();
             }
         }
         
        public static void mostrarVector(int[] numeros2){
            for(int i=0; i<numeros2.length; i++)
            System.out.println(numeros2[i]); 
        }
          
}
