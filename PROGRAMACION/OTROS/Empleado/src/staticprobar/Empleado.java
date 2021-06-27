package staticprobar;

public class Empleado {
    private String nombre;
    private static int totalEmple=10;
    private int codigo;
    
    public Empleado(String nombre){
        this.nombre=nombre;
        this.codigo= Empleado.totalEmple;
        totalEmple++;
    }
}
