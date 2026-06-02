import java.util.Random;
public class array11 {
    public static void main(String[] args) {
        // CHAMANDO MÉTODOS
        int[] n = rnd();
        int[] f = fatorialVetor(n);
        print (f);
    }
    // MÉTODO PRINT
    public static void print (int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
    // MÉTODO RANDOM
    public static int[] rnd() {
        Random rnd = new Random();
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(11);
        }
        return n;
    }
    // MÉTODO QUE GERA O VETOR DE FATORIAIS
    public static int[] fatorialVetor(int[] n) {
        // DECLARAÇÃO E GAMBIARRA
        int[] f = new int[n.length];
        f[0] = 1;
        // COLOCANDO VALORES USANDO MÉTODO FATORIAL
        for (int i = 1; i < f.length; i++) {
            f[i] = fatorial(n[i]);

        }
        return f;
    }
    // MÉTODO QUE FAZ O FATORIAL
    public static int fatorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
