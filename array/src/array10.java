public class array10 {
    public static void main(String[] args) {
        int[] n = primos();
        print (n);
    }
    // MÉTODO PRINT
    public static void print (int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
    // MÉTODO PRIMOS
    public static int[] primos () {
        // DECLARANDO VARIÁVEIS
        int[] n = new int[100];
        int c = 1;
        n[0] = 2;
        // CALCULANDO
        for (int i = 2; c < 100; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                n[c] = i;
                c++;
            }
        }
        return n;
    }
}
