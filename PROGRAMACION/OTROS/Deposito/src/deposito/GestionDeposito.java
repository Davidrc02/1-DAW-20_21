package deposito;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeposito {
    private ArrayList<DepositoEstructurado> d=new ArrayList<>();
    
    public ArrayList<DepositoEstructurado> getDepositos(){
        return this.d;
    }
    
    public void InsertarDeposito(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        String titular, res;
        int capital, capitalampliado, plazo, cont=0;
        double tipointeres, tipointeresampliado;
        DepositoEstructurado dep;
        do{
        System.out.println("Inserte los datos del artículo "+(cont+1)+":");
        System.out.println("Inserte el titular del depósito");
        titular=sc.next();
        System.out.println("Inserte el número de capital que desea ingresar");
        capital=sc.nextInt();
        System.out.println("Inserte el plazo en días:");
        plazo=sc.nextInt();
        while(plazo<=0){
            System.out.println("No puede introducir un tamaño 0 o inferior");
            System.out.println("Introduzca de nuevo el plazo: ");
            plazo=sc.nextInt();
        }
        System.out.println("Introduzca el interes");
        tipointeres=sc1.nextDouble();
        System.out.println("Ahora vamos a introducir los datos del depósito ampliado");
        System.out.println("Introduzca el capital ampliado");
        capitalampliado=sc.nextInt();
        System.out.println("Introduzca el interes ampliado");
        tipointeresampliado=sc.nextDouble();
        cont++;
        dep=new DepositoEstructurado(titular, capital, plazo, tipointeres, capitalampliado, tipointeresampliado);
        System.out.println("¿Desea insertar otro depósito? (S/N)");
        res=sc.next();
        while(!res.equalsIgnoreCase("S")&&!res.equalsIgnoreCase("N")){
                System.out.println("Respuesta fuera de rango");
                System.out.println("¿Desea insertar otro artículo? (S/N)");
                res=sc.next();
            }
        }while(res.equalsIgnoreCase("S"));
        this.d.add(dep);
    }
    public boolean contiene(String titular){
        for(DepositoEstructurado dep:this.d){
            if(dep.getTitular().equalsIgnoreCase(titular))
                return true;           
        }
        return false;
    }
    public int getIndex(String titular){
       for (int i=0;i<this.d.size();i++){
           if(this.d.get(i).getTitular().equalsIgnoreCase(titular))
               return i;
       }
       return -1;
    }
    public void muestraDepositoTitular(String titular){
        if(this.contiene(titular))
            System.out.println(this.d.get(getIndex(titular)));
        else
            System.out.println("Deposito no encontrado");
    }
}
