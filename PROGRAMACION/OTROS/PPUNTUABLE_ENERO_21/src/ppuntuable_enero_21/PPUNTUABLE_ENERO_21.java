package ppuntuable_enero_21;

/*Realizar un método que devuelva true si las
dos matrices que recibe como parámetros de
entrada son iguales. Suponemos que el tamaño 
de ambas matrices coincide.*/

public class PPUNTUABLE_ENERO_21 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        boolean condicion=true;
        System.out.println("Matriz A:");
        cargarMatriz(A);
        mostrarMatriz(A);
        System.out.println("");
        System.out.println("Matriz B:");
        cargarMatriz(B);
        mostrarMatriz(B);
        //compararMatriz(condicion); (no sé como corregirlo para que aparezca)
    }
    
    public static void cargarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.printf("%4d",matriz[i][j]);
            }
            System.out.println(" ");
        }
    } 
    
    public static boolean compararMatriz(int[][] A, int[][] B){
        for (int i = 0; i <A.length; i++) {
            for(int j=0; j<A[i].length; j++){
                if(A.equals(B)){
                return true;
                }
            }               
        }
    return false;
    }
}
    
