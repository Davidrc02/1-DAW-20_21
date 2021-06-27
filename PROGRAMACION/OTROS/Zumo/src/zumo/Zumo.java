
package zumo;

public class Zumo {
    private int litros;//contenido actual del deposito de zumo.
    private int precio_litros;
    private String sabor;
    private int litros_max;//capacidad máxima del depósito.
    
    /*Constructor por defecto*/
    public Zumo(){
    }

    /*Método que permite rellenar el depósito de zumo
    siempre y cuando la capacidad no se sobrepase. 
    Este método será probado con JUnit.*/
    public void rellenar(int litros) throws Exception{
        if((this.litros+litros)>this.litros_max)
        {throw new Exception("No se puede sobrepasar la capacidad del depósito");}
    this.litros=this.litros-litros;
    }
}