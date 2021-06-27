package Condicionales;
import javax.swing.JOptionPane;
public class Ejercicio04 {

    /*En megaplaza se hace un 20% de descuento
    a los clientes cuya compra supere los 300€
    ¿Cuánto pagará un cliente por su compra?
    */
    public static void main(String[] args) {
        final double precio;
        double nuevoprecio;
        
        precio= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio de la compra"));
        
        if(precio>=300){
            nuevoprecio= precio*0.8;
            JOptionPane.showMessageDialog(null,("El precio ha superado "
                    + "los 300$, por tanto su nuevo precio es de"+nuevoprecio));
        }
        else if(precio<300&&precio>0){
            JOptionPane.showMessageDialog(null,("El precio no supera los 300$, "
                    + "por tanto sigue siendo de "+precio+" dólares."));
        }
        else{
            JOptionPane.showMessageDialog(null,"El número introducido no es válido");
        }
    }   
}
