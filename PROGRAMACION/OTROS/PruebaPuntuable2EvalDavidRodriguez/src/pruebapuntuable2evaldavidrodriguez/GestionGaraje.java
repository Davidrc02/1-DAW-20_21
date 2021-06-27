package pruebapuntuable2evaldavidrodriguez;

import java.util.Scanner;

public class GestionGaraje {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Garaje g= new Garaje();
        int opc;
        System.out.println("Pulse 1 para introducir una moto y 2 para un coche");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                int potencia=0, numPlaza=0;
                Coche c = new Coche(potencia, numPlaza);
                break;
            case 2:
                potencia=entrada.nextInt();
                Moto m = new Moto(potencia);
                break;
        }
    }
    
}
