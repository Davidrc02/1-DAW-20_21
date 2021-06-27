/*
 * 1.	Escriba un programa que reciba como entrada una cadena de un campo 
        de texto, la cual representa una fecha en la forma MM/DD/AA. Use 
        StringTokenizeer para dividirla y produzca un mensaje de error si es un 
        elemento no numérico, si no se introdujo o si se especifica una 
        fecha imposible.
 */
package ejerciciosstringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Eusebio
 */
public class Tokenizer01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio de la aplicación\n");                        //Main solo se encanga de lanzar el método compruebaFecha()
        System.out.println("Prueba del método estático compruebaFecha() "
                + "utilizando un objeto de la clase StringTokenizer");
        compruebaFecha();
        System.out.println("\nFin de la aplicación");
    }
    public static void compruebaFecha(){                                        //Método que comprueba una fecha introducida en formato MM/DD/AA
        Scanner sc=new Scanner(System.in);                                      //objeto scanner para leer la entrada del usuario                              
        int nToken;                                                             //int para el número de tokens leidos
        boolean wrongFormat=true,noDigit=true,notAllowed=true;                  //boolean para comprobaciones: error de formato, error de dígitos, y entrada no permitida
        String fechaP;                                                          //String para almazenar la entrada del usuario
        String[] fecha=new String[3];                                           //Array de String de tamaño 3 para almacenar los tokens
        int[] fechaD=new int[3];                                                //Array de int de tamaño 3 para almacenar la fecha en int
        do{
            System.out.println("Introduzca una fecha en formato: MM/DD/AA");
            fechaP=sc.nextLine();                                               //Recogemos la entrada del usuario
            StringTokenizer tokens = new StringTokenizer(fechaP,"/");           //Declaramos StringTokenizer con char clave '/' (debe estar introducido como String)
            nToken=tokens.countTokens();                                        //Extraemos el número de tokens
            if(nToken!=3)                                                       //Si no hay exactamente 3 tokens, error de formato
                System.out.println("Debe utilizar un formato de fecha válido");                          
            else{
                wrongFormat=false;                                              //Hay 3 tokens, desactivamos el error de formato 
                for(int i=0;i<3;i++){
                    fecha[i]=tokens.nextToken();                                //Almazenamos los 3 tokens en nuestro array de String para que no se pierdan
                }
                if(!StringDigitCheck(fecha[0]+fecha[1]+fecha[2]))               //Si alguno de los 3 String contiene algun caracter que no sea un dígito, error de dígito
                    System.out.println("Debe introducir sólo dígitos para "
                            + "representar la fecha");
                else{
                    noDigit=false;                                              //Todos son dígitos, desactivamos el error de dígitos
                    if(fecha[0].length()!=2||fecha[1].length()!=2||
                            fecha[2].length()!=2){                              //Si el tamaño de alguno de los String de fecha no es 2, entrada no permitida
                        System.out.println("Debe introducir DOS dígitos por "
                                + "cada elemento de la fecha");
                    }
                    else{
                        for(int i=0;i<fecha.length;i++)                         
                            fechaD[i]=StringIntegerTransform(fecha[i]);         //Transformamos los String en int y los almacenamos en un array de int con mes, día, año
                        if(fechaD[0]<1||fechaD[0]>12)                           //Si el mes introducido no esta entre 1 y 12, entrada no permitida
                            System.out.println("Fecha no válida, "
                                    + "debe introducir un mes "
                                    + "entre el 1 y el 12");
                        else if(fechaD[1]<1||fechaD[1]>31)                      //Si el día introducido no esta entre 1 y 31, entrada no permitida
                            System.out.println("Fecha no válida, "
                                    + "debe introducir un día "
                                    + "entre el 1 y el 31");
                        else if(fechaD[0]==2&&fechaD[1]>29)                     //Si el mes es Febrero y el día es mayor que 29, entrada no permitida
                            System.out.println("Fecha no válida, "
                                    + "Febrero no puede tener más de 29 días");
                        else if((fechaD[0]==4||fechaD[0]==6||fechaD[0]==9||
                                fechaD[0]==11)&&fechaD[1]==31)                  //Si el día es 31 de Abril, Junio, Septiembre, o Noviembre, entrada no permitida
                            System.out.println("Fecha no válida, "
                                    + "Abril, Junio, Septiembre y Nomviembre "
                                    + "no pueden tener 31 días");
                        else if(fechaD[0]==2&&fechaD[1]==29&&fechaD[2]%4!=0)    //Si el mes es Febreso, el día es 29, y el año no es mútiplo de 4, entrada no permitida
                            System.out.println("Fecha no válida, ha introducido "
                                    + "el 29 de Febrero de un año no bisiesto");
                        else
                            notAllowed=false;                                   //Si ninguno de los condicionales se cumple, la fecha es válida, desactivamos la entrada no permitida
                        }
                    }                    
                }
        }while(wrongFormat||noDigit||notAllowed);                               //Seguirá pidiendo fecha hasta que todos los errores estén desactivados
        System.out.println("Fecha introducida correctamente");                  //Cuando salga del do while imprimirá un mensaje 
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//CÓDIGOS DE UTILIDAD                                                           COMENTARIOS
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static boolean StringDigitCheck(String cadena){                      //Devuelve true si todos los caracteres de un string son dígitos y false en caso contrario                                            //Obtengo la cadena como array de caracteres
        for(int i=0;i<cadena.length();i++){                                     //Recorro las posiciones del String
            if(cadena.charAt(i)<48||cadena.charAt(i)>57)                        //Los códigos ASCII de los caracteres numéricos van del 48 al 57
                return false;                                                   //Si cualquier caracter está fuera de este intervalo es que no es un dígito
        }
        return true;                                                            //Si el bucle termina y no ha entrado nunca en el if, es que todos son dígitos
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int StringIntegerTransform(String numero){                    //Transforma un string de números en un int, SÓLO PUEDE RECIBIR STRING DE DÍGITOS
        int num=0,exp=0;                                                        //Declaro dos variables int inicializadas a 0 para el número resultado y el exponente de 10
        for(int i=(numero.length()-1);i>=0;i--){                                //Recorro el String de números de forma INVERSA
            num+=((int)numero.charAt(i)-48)*Math.pow(10,exp);                   //Sumo los valores de los char transformados a int multiplicándolos por potencias de 10 
            exp++;                                                              //Incremento el contador del exponente de 10 en cada iteración
        }
        //System.out.println("Número transformado a int: "+num);
        return num;                                                             //Devuelve el número transformado a int
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
