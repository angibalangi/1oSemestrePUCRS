import java.util.Scanner;
public class doWhile5 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        double compras;
        int counter=0;
        String nome;
        do {
            System.out.println("Digite o nome do cliente: ");
            nome = in.nextLine();
            System.out.println("Digite o valor das compras desse cliente no ano passado: ");
            compras = in.nextDouble();
            in.nextLine();
            if (compras>=500) System.out.println("Bônus: "+compras/5);
            else System.out.println("Bônus: "+compras/10);
            counter++;
        } while (counter<=150);
    }
}
