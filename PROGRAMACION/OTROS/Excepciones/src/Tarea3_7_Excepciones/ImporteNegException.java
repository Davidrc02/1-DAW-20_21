
package Tarea3_7_Excepciones;

public class ImporteNegException extends Exception{
    public ImporteNegException(){
        super("Excepcion de numero negativo");
    }
    public ImporteNegException(String mensaje){
        super(mensaje);
    }
    
}
