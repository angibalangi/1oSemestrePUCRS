import java.util.Random;
public class array12 {
    public static void main(String args[]){
        int[] n = rnd();
        n = sort(n);
        print(n);
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
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(101);
        }
        return n;
    }
    public static int[] sort(int[] n){
        for (int i = 0; i < n.length; i++) {
            for (int c = i + 1; c < n.length; c++) {
                if (n[i] > n[c]) {
                    int b = n[i];
                    n[i] = n[c];
                    n[c] = b;
                }
            }
        }
        return n;
    }
}
