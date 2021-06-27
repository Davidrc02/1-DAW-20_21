package Tarea3_7_Excepciones;

/*
Construir una clase FacturaEmitida que descienda de la clase Factura y que incluya los atributos
emisor (empresa que emite la factura) y cliente y al menos, un método llamado imprimirFactura que
muestre todos los atributos (tanto los heredados de Factura como de FacturaEmitida).

La clase Factura dispondrá de los atributos: CIF (alfanumérico), numero de factura y total.
Esta clase tendrá un único constructor al que se le pasará por parámetros estos atributos y los inicializará.

Se deberán de contemplar las siguientes excepciones:

• Importe negativo: producirá una interrupción en el programa si el atributo total se almacena con una
cantidad negativa.

• Emisor en blanco: será informativo, y se producirá si se inicializa el emisor con la cadena vacía.
Todos los atributos serán privados y además de los métodos indicados en el enunciado, 
se deberán de crear aquellos que se estimen conveniente que hagan falta.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionPrincipal{
    ArrayList<FacturaEmitida> listaFacturas= new ArrayList<>();
    
    public static void main(String[] args) {
        crearFacturaEmitida();
    }
    
    public static void crearFacturaEmitida(){
        Scanner entrada= new Scanner(System.in);
        String CIF, emisor, cliente;
        int numFactura, total;
        System.out.println("Bienvenido a la creación de facturas");
        CIF=entrada.nextLine();
    }
   
}
