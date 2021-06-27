package ejercicio1;
import java.util.Comparator;

/**
 *
 * @author Eusebio
 */
public class ComparadorEdad implements Comparator<Alumno>{
    //Comparator para la edad del alumno
    @Override
    public int compare(Alumno a1, Alumno a2) {
       int result=((Integer)a1.getEdad()).compareTo((Integer)a2.getEdad());
       return result;
    }
    
}
