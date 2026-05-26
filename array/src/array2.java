import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int n = scanner();
        int fib[] = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Índice " + i + ": " + fib[i]);
        }
    }
    public static int scanner (){
        Scanner in = new Scanner (System.in);
        int i =  in.nextInt();
        while(i < 0){
            System.out.println("O valor precisa ser positivo");
            i = in.nextInt();
        }
        return i;
    }
}
