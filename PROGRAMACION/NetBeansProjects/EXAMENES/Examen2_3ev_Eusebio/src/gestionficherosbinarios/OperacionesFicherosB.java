package gestionficherosbinarios;
import java.io.EOFException;
import java.util.ArrayList;
/**
 *
 * @author Eusebio
 */
public interface OperacionesFicherosB {
    //MÉTODOS DE ESCRITURA
    void abrirModoEscritura(String ubicacion, boolean modo);
    void escribeObjeto(Object objeto,boolean modo);
    void cerrarFichero();
    //MÉTODOS DE LECTURA
    void abrirModoLectura(String ubicacion);
    Object leeObjeto()throws EOFException;
    ArrayList<Object> leeTodosObjetos();
}
