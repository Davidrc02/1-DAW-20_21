package Matrices;

public class MatrizAleatorio {

    public static void main(String[] args) {
        int numAleatorio= (int)(Math.random()*(151-(-5))-5);
    int[][] vector=new int[3][3];
    
    System.out.print("\nMatriz "+"\n{ ");
        for(int i=0;i<vector.length;i++){
            System.out.print("\n");
            for(int j=0;j<vector[0].length;j++){
                System.out.printf("\t%d\t",vector[i][j]);
            }
        }
        System.out.print("\n}\n");
    }
}
//queda por hacer, esto está mal