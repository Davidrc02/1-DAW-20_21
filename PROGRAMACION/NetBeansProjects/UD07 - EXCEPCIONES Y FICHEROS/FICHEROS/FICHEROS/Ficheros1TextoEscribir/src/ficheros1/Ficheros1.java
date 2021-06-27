package ficheros1;

import java.io.*;

public class Ficheros1 {
    public static void main(String[] args) {
        String cadena = "Esto es lo que quiero escribir";
        FileWriter fichero = null;
        try{
            fichero = new FileWriter("Archivo.txt",true);
//            Constructor1: FileWriter (String path, boolean append)
//            Constructor2: FileWriter (File fichero, boolean append)
            fichero.write(cadena);
            char[] c = {'\n', 'a', 'b', 'c', 'd'};  
            fichero.write(c);  
            
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
            
        }finally{
            try {
                fichero.flush();
                fichero.close();
            } catch (IOException ex) {
                System.out.println("Error E/S");
            }  
            // La llamada al metodo flush() garantiza que todos los datos
            //enviados a traves del buffer de salida han sido escritos en
            //el fichero, mientras que close() cierra la conexión con el
            //fichero y libera recursos utilizados por esta.
        }
    }
}
