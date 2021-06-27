package gestionficherostexto;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Eusebio
 */
public class GestorFicherosT {
    private FileWriter fichFW;
    private PrintWriter fichPW;
    private File fichero;
    private FileReader fichR;
    private BufferedReader fichBR;

    public GestorFicherosT() {
        this.fichFW = null;
        this.fichPW = null;
        this.fichero = null;
        this.fichR = null;
        this.fichBR = null;
    }
    
    //MÉTODOS DE ESCRITURA
    //Método para abrir un fichero de texto en modo escritura.
    public void abrirModoEscritura(String ubicacion, boolean modo) { 
        //Iniciamos el intento de apertura del fichero
        try{
            //El parámetro modo, se encarga de manejar el modo de escritura.
            //Si existe el fichero se sobreescribe (false) o se añaden texto conservando el existente(true)
            this.fichFW=new FileWriter(ubicacion, modo);
            //Enlazamos los flujos PrintWriter y FileWriter
            this.fichPW=new PrintWriter(this.fichFW);
        }catch(IOException e){
            //Gestión clásica de excepciones IOException
            System.err.println("1.Error E/S: "+e.getClass().getName());
        }
    }
    //Método para escribir texto en un fichero abierto
    public void escribeLinea(String linea){
        this.fichPW.println(linea);
    }
    
    //Metodo para escribir todas las lineas de un ArrayList de String
    public void escribeTodasLinea(ArrayList<String> lineas){
        Iterator it=lineas.iterator();
        while(it.hasNext())
            this.fichPW.println((String)it.next());
    }
    
    //MÉTODOS DE LECTURA
    //Método para abrir un fichero en modo lectura
    public void abrirModoLectura(String ubicacion){
        try{
            //Se intentará abrir el fichero de la ubicación indicada recogiendo su contenido en el objeto file
            this.fichero=new File(ubicacion);
            //Enlazamos FileReader con el objeto file
            this.fichR=new FileReader(this.fichero);
            //Enlazamos BufferedReader con FileReader
            this.fichBR = new BufferedReader(this.fichR);
        }catch (IOException e) {
            //Gestión clásica de excepciones IOException
            System.err.println("3.Error E/S: "+e.getClass().getName());
        }
    }
    //Método para recoger una linea de un fichero de texto en una cadena
    public String leeLinea() throws IOException{
        //Gestionamos la IOException fuera del método para diferenciar la excepción E/S
        //del momento en el que recibimos null porque se ha acabado el fichero
        String linea=null;
        linea=this.fichBR.readLine();
        return linea;
    }
    //Método para leer todas las lineas de un fichero  
    public ArrayList<String> leeTodasLineas() { 
        String linea=null;
        ArrayList<String> lineas=new ArrayList<>();
        try{
            //Mientras que haya lineas que leer
            while ((linea=leeLinea())!=null){
                //Anadimos la linea encontrada al ArrayList
                lineas.add(linea);
            }
        }catch(IOException e){
            //Gestión clásica de excepciones IOException
            System.err.println("4.Error E/S: "+e.getClass().getName());  
        }
        return lineas;
    }
    //Método para cerrar un fichero abierto 
    public void cerrarFichero() {
        try{
            if(this.fichR!=null){
                this.fichBR.close();
                this.fichR.close();   
            }
            if(this.fichPW!=null){
                this.fichPW.flush();
                this.fichPW.close();
                this.fichFW.close();
            }
        }            
        catch(IOException e){
            System.err.println("5.Error E/S: "+e.getClass().getName());
        }
    }
}
