import java.util.Random;
class array8 {
    public static void main(String[] args) {
        // CHAMANDO MÉTODOS
        int[] n = rnd();
        int soma = soma(n);
        print(n);
        System.out.println("\nMédia: "+soma/n.length);
    }
    // MÉTODO RANDOM
    public static int[] rnd() {
        Random rnd = new Random();
        int[] n = new int[30];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(11);
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
    public static int soma(int[] n){
        int soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }
        return soma;
    }
}
