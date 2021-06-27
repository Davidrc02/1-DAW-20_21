package ejercicio1;
import gestionficherosbinarios.GestorFicherosB;
/**
 *
 * @author Eusebio
 */
public class AcademiaB extends Academia{    
    //CONSTRUCTOR
    public AcademiaB(String nombre, int numAulas, String certificacion, int codigo) throws TipoNoValidoException {
        super(nombre, numAulas, certificacion, codigo);
    }
    
    //Métodos abstractos de la superclase
    //Método que comprueba el código en una Academia de tipo B
    @Override
    final Character compruebaTipo(String certificacion) throws TipoNoValidoException{
        //Las academias de tipo B solo pueden tener de código B1 o B2
        if(!(certificacion.equals("B1")||certificacion.equals("B2")))
            throw new TipoNoValidoException();
        return 'B';
    }
    //Metodo que al invocarlo guarda la academia en un fichero binario llamado AcademiasB
    @Override
    void copiaSeguridad() {
        GestorFicherosB gfb=new GestorFicherosB();
        //Modo de escritura de añadir
        gfb.abrirModoEscritura("AcademiasB", true);
        gfb.escribeObjeto(this, true);
        gfb.cerrarFichero();
    }

    //Método de la Interfaz
    //Las academias B tienen un cupo de alumnos de 15
    @Override
    public int numeroPlazas() {
        return 15;
    }    
}
