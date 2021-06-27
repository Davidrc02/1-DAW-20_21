package excepciones;

public class MyException extends Exception{
    private int dato;
    
    public MyException(int parametro){
        this.dato=parametro;
    }
    
    @Override
    public String toString(){
        return "Error el dato introducido, " + this.dato;
    }
}
