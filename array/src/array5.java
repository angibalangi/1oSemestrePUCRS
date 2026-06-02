import java.util.Scanner;
public class array5 {
    public static void main (String[] args){
        // DECLARAR VARIÁVEIS
        int n1 = in();
        int n2 = in();
        int tm, vtm, c=0;
        // CHECAR QUAL É MAIOR PARA TAMANHO NÃO SER NEGATIVO
        if  (n1 > n2){
            tm = (n1-n2)+1;
        } else tm = (n2-n1)+1;
        // CHECAR QUAIS SÃO PARES PARA TAMANHO DO VETOR
        if (n1%2==0 && n2%2==0){
            vtm = (tm/2)+1;
        } else if (n1%2!=0 && n2%2!=0){
            vtm = (tm/2)-(1/2);
        } else vtm = tm/2;
        // CALCULAR VETOR
        int[] pares = new int[vtm];
        for (int i = Math.min(n1,n2); i <= tm; i++){
            if  (i%2==0){
                pares[c] = i;
                c++;
            }
        }
        print(pares);
    }
    // MÉTODO SCANNER POSITIVO
    public static int in (){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        while (n<0){
            System.out.println("VALOR DEVE SER POSITIVO");
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
