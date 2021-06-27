/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface0Probar;

/**
 *
 * @author David
 */
public class Persona implements IPuedeCantar{
    private String nombre;
    
    @Override
    public void cantar() {
        System.out.println("Lalalalala");
    }
    
}
