/*
2.- Se pide crear una aplicación que realice una gestión específica con las 
facturas de una empresa. De las facturas tenemos que guardar información sobre: 
su código (de tipo cadena), artículo (de tipo cadena), importe (de tipo real 
que debe tomar un valor mayor que cero) e IVA (de tipo entero y con valores 
comprendidos entre 10 y el 20). 

Se pide:
- Diseñar las clases con al menos 3 métodos constructores y el resto de métodos 
que consideres necesarios. 
- Crear un método que devuelva el importe final de una factura tras aplicarle el
% de IVA correspondiente.
- Crear un método para facturas denominado mismoArticulo. Este método booleano 
recibirá una factura como parámetro de entrada y devolverá verdadero si ambas 
facturas son del mismo artículo y falso en caso contrario.
- Crear en la clase principal, una pequeña aplicación que cargue los valores de 
10 facturas y calcule el importe total de todas ellas.
- Crear también en la clase principal, la funcionalidad necesaria para obtener 
un array que contenga sólo los códigos de las 10 facturas.
(6.5 puntos)
 */
package ej2;

public class Factura {
    private String codigo;
    private String articulo;
    private float importe;
    private int iva;

    public Factura() {
    }

    public Factura(String codigo, String articulo, float importe, int iva){
        this.codigo = codigo;
        this.articulo = articulo;
        this.importe = importe;
        this.iva = iva;
    }
    
    public Factura(float importe){
        this.importe = importe;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getArticulo(){
        return this.articulo;
    }

    public float getImporte(){
        return this.importe;
    }

    public int getIva(){
        return this.iva;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setArticulo(String articulo){
        this.articulo = articulo;
    }
    
    public float importeFinal(){
        float impFinal;
        impFinal = this.importe*((float)this.iva/100)+this.importe;
        return impFinal;
    }
    
    public boolean mismoArticulo(Factura fct){
        if(fct.codigo.equals(this.codigo))
            return true;
        return false;
    }
    
    
}
