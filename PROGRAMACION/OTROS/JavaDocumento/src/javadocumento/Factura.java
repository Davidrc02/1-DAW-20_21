package javadocumento;

/**
 * <h2>Clase Factura, se utiliza para crear y leer las facturas de una BD</h2>
 * 
 * Busca información de javadoc en <a href="http://google.com">GOOGLE</a>
 * @see <a href="http://google.com">GOOGLE</a>
 * @version 3-2021
 * @author David
 * @since 18-3-2021
 */
public class Factura {
    /**
     * Atributo codigoFactura de la factura
     */
    private String codigoFactura;
    /**
     * Atributo Descripcion de la factura
     */
    private String descripcion;
    /**
     * Cantidad de piezas en una factura
     */
    private int cantidad;
    
    
    /**
     * Constructor con 3 parámetros. Crea objetos Factura con codigoFactura, descripcion y cantidad.
     * @param codigoFactura codigoFactura de la Factura
     * @param descripcion Descripcion de la Factura
     * @param cantidad Cantidad de piezas de la factura
     */
    public Factura(String codigoFactura, String descripcion, int cantidad) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        this.cantidad = cantidad; 
    }
    
    //Métodos públicos
    /**
     * Aumenta la cantidad de piezas de la factura
     */
    public void aumentoCantidad(int aumento){
        cantidad=cantidad+aumento;
    }
    
    //Métodos privados
    /**
     * Comprueba que el codigoFactura no esté vacío
     * @return <ul>
     *  <li>true: el codigoFactura está vacío</li>
     *  <li>false: el codigoFactura no está vacío</li>
     *  </ul>
     */
    private boolean comprobarCodigoFactura(){
        if(codigoFactura.equals("")){
            return false;
        }
        return true;
    }
}