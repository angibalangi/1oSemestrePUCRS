import java.util.Scanner;

public class matriz1 {
    public static void main (String args[]){
        int[][] matriz = new int[5][5];
    }
    public static int[][] preencherMatriz (int[][] matriz){
        Scanner in = new Scanner (System.in);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        return matriz;
    }
    public static void printMatriz (int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
