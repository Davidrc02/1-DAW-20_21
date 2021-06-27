package gestionficherosbinarios;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
/**
 *
 * @author Eusebio
 */
public class GestorFicherosB implements OperacionesFicherosB{
    //Declaramos una clase propia MyObjectOutputStream para evitar el problema del header
    public class MyObjectOutputStream extends ObjectOutputStream{
        public MyObjectOutputStream(OutputStream out) throws IOException{
                super(out);
        }
        //Sobreescribimos el método writeStreamHeader que es el que causa problemas
        @Override
        protected void writeStreamHeader() throws IOException{
        }
    }
    //Atributos
    private FileOutputStream fBinario;
    private MyObjectOutputStream fichWriteAdd;
    private ObjectOutputStream fichWriteOver;
    private FileInputStream fujo;
    private ObjectInputStream fichRead;
    
    //Constructor basico de la clase GestorFicherosB
    public GestorFicherosB(){
        this.fBinario=null;
        this.fichWriteAdd=null;
        this.fichWriteOver=null;
        this.fujo=null;
        this.fichRead=null;
    }
    
    //MÉTODOS DE ESCRITURA
    //Método para abrir un fichero binario en modo escritura.    
    @Override
    public void abrirModoEscritura(String ubicacion, boolean modo) {                          
        //Iniciamos el intento de apertura del fichero
        try{            
            //El parámetro modo, se encanrga de manejar el modo de escritura.
            //Si existe el fichero se sobreescribe (false) o se añaden objetos conservando los existente(true)            
            this.fBinario = new FileOutputStream(ubicacion,modo);             
            //Enlazamos los flujos FileOutputStream y ObjectOutputStream o MyObjectOutputStream según convenga
            if(modo)
                this.fichWriteAdd = new MyObjectOutputStream(this.fBinario);  
            else
                this.fichWriteOver = new ObjectOutputStream(this.fBinario);  
        }catch(IOException e3){
            //Gestión clásica de excepciones IOException
            System.err.println("1.Error E/S: "+e3.getClass().getName());
        }
    }  
    //Método para escribir un objeto en un fichero abierto
    @Override
    public void escribeObjeto(Object objeto,boolean modo){
        try{
            if(modo)
                this.fichWriteAdd.writeObject(objeto); 
            else
                this.fichWriteOver.writeObject(objeto);
        }catch(IOException e3){
            //Gestión clásica de excepciones IOException
            System.err.println("2.Error E/S: "+e3.getClass().getName());
        }
    }
    //Método para cerrar un fichero abierto 
    @Override
    public void cerrarFichero() {
        //Gestión clásica de cierre de ficheros de cualquier tipo
        try{
            if(this.fichWriteAdd!=null){
                this.fichWriteAdd.flush();
                this.fichWriteAdd.close();
                this.fBinario.close();
            }
            if(this.fichWriteOver!=null){
                this.fichWriteOver.flush();
                this.fichWriteOver.close();
                this.fBinario.close();
            }
            if(this.fichRead!=null){
                this.fichRead.close();
                this.fujo.close();
            }            
        }catch(IOException e4){
            System.err.println("3.Error E/S: "+e4.getClass().getName());
        }
    }
    
    //MÉTODOS DE LECTURA
    //Método para abrir un fichero en modo lectura   
    @Override
    public void abrirModoLectura(String ubicacion){
        //Iniciamos el intento de apertura del fichero
        try{
            //Se intentará abrir el fichero de la ubicación indicada 
            this.fujo=new FileInputStream(ubicacion);
            //Enlazamos los flujos FileInputStream con ObjectInputStream
            this.fichRead=new ObjectInputStream(this.fujo);
            //Almacenamos el objeto leido en nuestro Object          
        }catch (IOException e5) {
            //Recepción de la posible excepción de error de entrada/salida de datos
            System.err.println("4.Error E/S: "+e5.getClass().getName());    
        }
    }
    //Método para recoger un objeto de un fichero
    @Override
    public Object leeObjeto() throws EOFException{
        //Declaramos un Object para almacenar el primer objeto que hay en el fichero
        Object objeto=null;
        //Iniciamos el intento de lectura del fichero binario
        try{            
            //Almacenamos el objeto leido en nuestro Object
            objeto=this.fichRead.readObject();            
        }catch (IOException e5) {
            //Recepción de la posible excepción de error de entrada/salida de datos
            System.err.println("5.Error E/S: "+e5.getClass().getName());    
        }
        catch (ClassNotFoundException e6) {
            //Recepción de la posible excepción de clase no encontrada
            System.err.println("6.Error clase no encontrada: "+e6.getClass().getName());
        }
        //devolvemos el Object
        return objeto;
    }
    //Método para leer todos los objetos de un fichero  
    @Override
    public ArrayList<Object> leeTodosObjetos() {        
        //Declaramos un ArrayList de Object para almacenar el contenido del fichero objeto por objeto
        ArrayList<Object> contenido = new ArrayList<>();
        //Variable booleana para salir del bucle de lectura
        boolean continuar=true;              
        //Bucle de lectura
        while(continuar){
            //Intentamos leer un objeto
            try{
               contenido.add(this.leeObjeto());
            }catch(EOFException eof){
                //Cuando capturemos la excepción EOFException habremos terminado de leer el fichero binario
                continuar=false;
            } 
        } 
        //devolvemos el ArrayList de Object
        return contenido;
    }     
}
