package ejercicio1;
import gestionficherosbinarios.GestorFicherosB;
/**
 *
 * @author Eusebio
 */
public class AcademiaC extends Academia{   
    //CONSTRUCTOR
    public AcademiaC(String nombre, int numAulas, String certificacion, int codigo) throws TipoNoValidoException {
        super(nombre, numAulas,certificacion,codigo);
    }
    
    //Métodos abstractos de la superclase
    //Método que comprueba el código en una Academia de tipo C
    @Override
    final Character compruebaTipo(String certificacion) throws TipoNoValidoException {
        //Las academias de tipo C solo pueden tener de código C1
        if(!certificacion.equals("C1"))
            throw new TipoNoValidoException();
        return 'C';
    }
    //Metodo que al invocarlo guarda la academia en un fichero binario llamado AcademiasC
    @Override
    void copiaSeguridad() {
        GestorFicherosB gfb=new GestorFicherosB();
        //Modo de escritura de añadir
        gfb.abrirModoEscritura("AcademiasC", true);
        gfb.escribeObjeto(this, true);
        gfb.cerrarFichero();
    }

    //Método de la Interfaz
    //Las academias C tienen un cupo de alumnos de 10
    @Override
    public int numeroPlazas() {
        return 10;
    }    
}
