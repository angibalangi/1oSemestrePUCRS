import java.util.Scanner;
public class doWhile6 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        int pares = 0;
        int media = 0;
        int mediapar = 0;
        int impares = 0;
        int counter = 0;
        int num = in.nextInt();
        do {
            counter++;
            media = counter+media;
            if (num%2==0) {
                pares++;
                mediapar = num + mediapar;
            }
            else impares++;
            num = in.nextInt();
        } while (num != 0);
        System.out.println("Ímpares: "+impares);
        System.out.println("Pares: "+pares);
        System.out.println("Média: "+(media/counter));
        if (pares==0) System.out.println("Média dos pares: 0");
        else System.out.println("Média dos pares: "+(mediapar/pares));
    }
}
