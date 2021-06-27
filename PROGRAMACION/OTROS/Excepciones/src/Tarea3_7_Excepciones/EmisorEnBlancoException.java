package Tarea3_7_Excepciones;

public class EmisorEnBlancoException extends Exception{
    public EmisorEnBlancoException(){
        super("Emisor en blanco");
    }
    public EmisorEnBlancoException(String mensaje){
        super(mensaje);
    }
}
