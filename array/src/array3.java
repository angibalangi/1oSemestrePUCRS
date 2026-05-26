import java.util.Random;
public class array3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n[] = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(100);
        }
        executor(n);
    }
    public static void pares(int n[]) {
        System.out.print("Valores pares: ");
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.print(n[i] + " ");
            }
        }
    }
    public static void indPares(int n[]) {
        System.out.print("\nÍndices pares: ");
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 1) {
                System.out.print(n[i] + " ");
            }
        }
    }
    public static void indImpares(int n[]){
        System.out.print("\nÍndices ímpares: ");
        for (int i = 0; i < n.length; i++) {
            if (i % 2 != 0) {
                System.out.print(n[i] + " ");
            }
        }
    }
    public static void contrario(int n[]){
        System.out.print("\nAo contrário: ");
        for (int i = (n.length-1); i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
    public static int media (int n[]){
        int m = 0;
        for (int i = 0; i < n.length; i++) {
            m += n[i];
        }
        System.out.println("\nMédia: "+m/n.length);
        return m / n.length;
    }
    public static void acimaMedia (int n[], int m){
        System.out.print("Valores acima da média: ");
        for (int i = 0; i < n.length; i++){
            if (n[i] > m){System.out.print(n[i] + " ");}
        }
    }
    public static void menor (int n[]){
        int m = n[1];
        for (int i = 0; i < n.length; i++){
            if (n[i] < m){
                m = n[i];
            }
        }
        System.out.println("\nMenor valor: "+m);
    }
    public static void executor(int n[]){
        pares(n);
        indPares(n);
        indImpares(n);
        contrario(n);
        int media = media(n);
        acimaMedia(n, media);
        menor(n);
    }

}
