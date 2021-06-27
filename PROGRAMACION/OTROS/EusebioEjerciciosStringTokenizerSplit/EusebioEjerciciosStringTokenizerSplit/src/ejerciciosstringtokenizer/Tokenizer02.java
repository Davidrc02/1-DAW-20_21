/*
 * 2.	Dada una cadena formada por una serie de números reales separados 
        por \n, se pide un método que reciba la cadena y devuelva una estructura de 
        datos estática con los distintos números para posteriormente realizar con 
        ellos las media, un listado ordenado y el valor max y min 
        (en métodos independientes)
 */
package ejerciciosstringtokenizer;
import java.util.StringTokenizer;
/**
 *
 * @author Eusebio
 */
public class Tokenizer02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Inicio de la aplicación\n");
        System.out.println("Prueba del método estático extraeNumeros() "
                + "utilizando un objeto de la clase StringTokenizer");
        extraeNumeros();                                                        //Main solo se encanga de lanzar el método extraeNumeros()
        System.out.println("\nFin de la aplicación");
    }
    public static void extraeNumeros(){                                         //Método que extrae y opera con los números que hay en una cadena del formato mostrado
        String cadena="1,23\n45,8\n-6,98\n-0,67";                               //Números que pueden estar utilizando la coma decimal separados por saltos de linea
        String[] numeros;                                                       //Array de String para almacenar los números obtenidos como tokens
        double[] num;                                                           //Array de double para almacenar los números transformados de String a double
        int nToken;                                                             //Int para almacenar el número de tokens encontrados
        System.out.println("Cadena a procesar mediante "
                + "StringTokenizer(cadena,\"\\n\"):"
                + "\n------\n"+cadena+"\n------\n");                            //Mostramos la cadena a procesar que en este caso será un literal declarado dentro del código
        StringTokenizer tokens = new StringTokenizer(cadena,"\n");              //Declaramos el objeto StringTokenizer con char clave '\n' (debe estar ser un String)
        nToken=tokens.countTokens();                                            //Obtenermos el número de tokens
        numeros=new String[nToken];                                             //Inicializamos el array de String con tamaño igual al número de tokens
        num=new double[nToken];                                                 //Lo mismo con el array de double
        for(int i=0;i<numeros.length;i++){                                      
            numeros[i]=tokens.nextToken();                                      //Guardamos los tokens en el array de String
        }
        for(int i=0;i<numeros.length;i++){
            num[i]=procesaNumComa(numeros[i]);                                  //Transformamos y guardamos los numeros como double en el array de double
        }                                                                       //Llamando para cada uno de ellos al método procesaNumComa()
        System.out.println("Resultados:\n");
        System.out.print("\nCadena procesada como array de String: ");
        for(int i=0;i<numeros.length;i++)
            System.out.print(num[i]+" ");
        System.out.println("");
        System.out.printf("\nMedia: %.2f",calculaMedia(num));                   //Llamamos al método calculaMedia para obtener la media pasándole el array de double
        ordenaNumeros(num);                                                     //Llamamos al método ordenaNumeros para ordenar el array de double
        System.out.print("\nNúmeros ordenados: ");
        for(int i=0;i<num.length;i++)                                           //Y lo mostramos ordenado
            System.out.print(num[i]+" ");
        System.out.println("");
        System.out.println("Valor máximo: "+num[0]);                            //Ya que el array está ordenado, el máximo será el número en la posición 0
        System.out.println("Valor mínimo: "+num[num.length-1]);                 //Y el mínimo será el número en la última posición
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double procesaNumComa(String numero){                         //Método que recibe un String que contiene un número real
        numero=numero.replace(",",".");                                         //Y devuelve un double que contiene la transformacion de tipo de String a double
        Double num=new Double(numero);                                          //Primero reemplazamos las posibles comas decimales por puntos para que se acdapte al formato
        return num;                                                             //que controla Java, en caso de que el usuario le pase un número con comas decimales.
    }
    public static double calculaMedia(double[] num){                            //Método que recibe un array de double
        double media=0;                                                         //Y devuelve un double que contiene la media de todos los valores del array
        for(int i=0;i<num.length;i++){                                          
            media+=num[i];
        }
        return media/num.length;
    }
    public static void ordenaNumeros(double[] num){                             //Método que recibe un array de double
        double aux;                                                             //Y lo ordena descendentemente utilizando el algoritmo de la burbuja
        for(int i=num.length;i>0;i--){                                          //Puesto que modifica el array directemente, no necesita devolver nada.
            for(int j=0;j<(i-1);j++){
                if(num[j+1]>num[j]){
                    aux=num[j];
                    num[j]=num[j+1];
                    num[j+1]=aux;
                }
            }
        }
           
    }       
//    PARA ARRAY DE NUMEROS NO ORDENADO
//    public static double[] maxmin(double[] num){                              //Método que recibe un array de double
//        double[] maxmin={num[0],num[0]};                                      //Y devuelve un array de tamaño 2 que contiene:
//        for(int i=0;i<num.length;i++){                                        //En la posición 0: Máximo valor del array
//            if(num[i]>maxmin[0])                                              //En la posicion 1: Mínimo valor de array
//                maxmin[0]=num[i];           
//            if(num[i]<maxmin[1])
//                maxmin[1]=num[i];
//        }
//        return maxmin;
//    }
}
