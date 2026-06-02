import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        // DECLARAR VARIÁVEIS
        int n = in();
        int fib[] = new int[n];
        // GAMBIARRA PROS PRIMEIROS
        fib[0] = 1;
        if (n>1) fib[1] = 1;
        // DEFININDO VALORES ATÉ n
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        // CHAMANDO MÉTODO PRINT
        print(fib);
    }
    // MÉTODO SCANNER POSITIVO
    public static int in (){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        while (n<=0){
            System.out.println("VALOR DEVE SER MAIOR QUE 0");
            n = in.nextInt();
        }
        return n;
    }
    // MÉTODO PRINT VETOR
    public static void print (int[] n){
        for (int i = 0;i < n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
}
