/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String cadena = "Esto es lo que quiero escribir";
        
        try{
            
            FileWriter fichero = new FileWriter("/home/anag/Escritorio/prueba2.txt",true);
            //Constructor1: FileWriter (String path, boolean append)
            //Constructor2: FileWriter (File fichero, boolean append)
            fichero.write(cadena);
            
            char[] c = {'\n', 'a', 'b', 'c', 'd'};
            
            fichero.write(c);
            
            fichero.flush();
            fichero.close();
            // La llamada al metodo flush() garantiza que todos los datos
            //enviados a traves del buffer de salida han sido escritos en
            //el fichero, mientras que close() cierra la conexión con el
            //fichero y libera recursos utilizados por esta.
       
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
