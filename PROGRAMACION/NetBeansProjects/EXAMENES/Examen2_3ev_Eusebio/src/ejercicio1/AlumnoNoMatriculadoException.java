package ejercicio1;
/**
 *
 * @author Eusebio
 */
public class AlumnoNoMatriculadoException extends Exception{
    public AlumnoNoMatriculadoException() {
        super("El alumno no está matriculado en ningún centro");
    }   
}
