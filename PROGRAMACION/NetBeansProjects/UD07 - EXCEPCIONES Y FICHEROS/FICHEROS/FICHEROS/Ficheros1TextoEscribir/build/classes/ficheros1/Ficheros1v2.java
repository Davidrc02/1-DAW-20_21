/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author ana
 */
public class Ficheros1v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String cadena = "Esto es lo que quiero escribir";
       // try{
            
            FileWriter fichero = new FileWriter("/home/anag/Escritorio/prueba.txt",true);
            PrintWriter fich = new PrintWriter(fichero);
            fich.write(cadena);
            fich.println();
            fich.println("sigo escribiendo");
            fich.printf("hola %s\n", "ana");
            fich.flush();
            fich.close();
       
       /* }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }*/
    }
}
