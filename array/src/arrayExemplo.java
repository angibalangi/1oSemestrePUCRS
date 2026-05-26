import java.util.Scanner;
public class arrayExemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[4];
        int pares=0, impares=0;
        for  (int i = 0; i < array.length; i++) {
            System.out.println("Informe o " + (i + 1) + "o valor do array: ");
            array[i] = in.nextInt();
            if (array[i] % 2 == 0) {
                pares++;
            } else impares++;
        }
        for  (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
