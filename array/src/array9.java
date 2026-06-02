import java.util.Random;

public class array9 {
    public static void main(String[] args) {
        // CHAMANDO MÉTODOS
        int[] n1 = rnd();
        int[] n2 = rnd();
        int[] soma = somaVetor(n1,n2);
        print (soma);
    }
    // MÉTODO RANDOM
    public static int[] rnd() {
        Random rnd = new Random();
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(101);
        }
        return n;
    }
    // MÉTODO PRINT
    public static void print (int[] n){
        for (int i = 0;i < n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
    // MÉTODO SOMA
    public static int[] somaVetor (int[] n1, int[] n2){
        int[] soma = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            soma[i] = n1[i] + n2[i];
        }
        return soma;
    }
}
