
package Interface0Probar;

public class PruebaInterfaz {

    public static void main(String[] args) {
       IPuedeCantar pc=new Gallo();
       IPuedeCantar[] cantor= new IPuedeCantar[2];
       
       cantor[0]= new Persona();
       cantor[1]= new Gallo();
       
       cantor[0].cantar();
       cantor[1].cantar();
    }
    
}
