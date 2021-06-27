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
    public static void main(String[] args)  {
        
        String cadena = "Esto es lo que quiero escribir";
        FileWriter fichero =null;
        PrintWriter fich = null;
        try{
            
            fichero = new FileWriter("prueba.txt",true);
            fich = new PrintWriter(fichero);
            fich.write(cadena);
            fich.println();
            fich.println("sigo escribiendo");
            fich.printf("hola %s\n", "ana");
           
       
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
         }finally{
                fich.flush();
                fich.close();
        }
    }
}
