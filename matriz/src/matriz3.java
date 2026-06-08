import java.util.Random;
import java.util.Scanner;
public class matriz3 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        int[][] n;
        System.out.println("1) Random;" +
                "\n2) Escrever;\n");
        int i = in.nextInt();
        while (i < 1 || i>2){
            System.out.println("VALOR INVÁLIDO");
            i = in.nextInt();
        }
        switch (i){
            case 1: n = rnd();
            case 2: n = fill();
            default: n = rnd();
        }
        int soma = diagonal(n);
        System.out.println("Soma das diagonais: " + soma);
    }
    // MÉTODO RANDOM
    public static int[][] rnd() {
        Random rnd = new Random();
        int[][] n = new int[6][6];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                n[i][j] = rnd.nextInt(101);
            }
        }
        return n;
    }
    public static int[][] fill (){
        Scanner in = new Scanner (System.in);
        int[][] matriz = new int[6][6];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = in.nextInt();
            }
        }
        return matriz;
    }
    public static int diagonal (int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i==j || i+j==matriz.length){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
}
