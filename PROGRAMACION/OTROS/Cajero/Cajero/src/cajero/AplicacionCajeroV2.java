package cajero;
import java.util.Scanner;
public class AplicacionCajeroV2 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        CuentaBancaria cta= new CuentaBancaria(1000,100,"1234","111v",222);
        int opc;
        if(verificarUsuario(cta)){
            do{
                opc = menu();
                ejecutar(opc, cta);            
            }while(opc!=5);
        } 
    }
    
    public static boolean verificarUsuario(CuentaBancaria cta){
     /* Los 3 intentos para verificar el pin también se podría poner en el método
        validarPin dentro de la clase CuentaBancaria*/
         
        int cont=3;
         Scanner entrada=new Scanner(System.in);
        int pinLeido;
        do{
            System.out.println("Introduzca pin, dispone de "+ cont+ " intentos");
            pinLeido= entrada.nextInt();
            if(cta.validarPin(pinLeido))
                return true;
            else{
                System.out.println("Pin incorrecto");
                cont--;
            } 
        }while(cont>0);
        return false;
    }
    
    public static int menu(){
        Scanner entrada=new Scanner(System.in);
        int opc;
        System.out.println("MENÚ");
        System.out.println("1. Ingreso");
        System.out.println("2. Reintegro ");
        System.out.println("3. Ver saldo actual");
        System.out.println("4. Cambiar pin");
        System.out.println("5. Salir");
        do{
             System.out.println("Introduce tu opción");
             opc = entrada.nextInt();
        }while(opc<1 || opc>5);
       
        return opc;
    }
    
    public static void ejecutar(int opc, CuentaBancaria cta){
        Scanner entrada=new Scanner(System.in);
        int cant;
         switch(opc){
                    case 1:
                        System.out.println("Introduzca cantidad");
                        cant=entrada.nextInt();
                        cta.ingresarDinero(cant);
                        break;
                    case 2:
                        System.out.println("Introduzca cantidad");
                        cant=entrada.nextInt();
                        cta.sacarDinero(cant);
                        break;
                    case 3:
                        System.out.println("Su saldo es: "+ cta.getSaldo());
                    System.out.println("Su disponible es: "+ (cta.getSaldo()+cta.getLimite()));
                        break;
                    case 4:
                        cta.cambiarPin();
                        break;
                    case 5:
                        System.out.println("Fin aplicación");
                }
    }  
}
