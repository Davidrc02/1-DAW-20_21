package pruebapuntuable2evaldavidrodriguez;

public class Coche extends Vehiculo{
    private int numPlaza;
    
    public Coche(int potencia, int numPlaza) {
        super(potencia);
        this.numPlaza=numPlaza;
    }
    
    public int numPlazas() {
        return numPlaza;
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = numPlaza;
    }
}
