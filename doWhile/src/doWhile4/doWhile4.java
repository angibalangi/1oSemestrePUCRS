import java.util.Scanner;
public class doWhile4 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        int escolha=1;
        double saldo=0;
        double sacar=0;
        double depositar=0;
        do {
            System.out.println("Escolha o desejado:\n1)Sacar\n2)Depositar\n3)Saldo");
            escolha=in.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Informe o valor desejado: ");
                    sacar=in.nextDouble();
                    if(sacar>saldo)System.out.println("Você não tem o suficiente.");
                    else {
                        saldo=saldo-sacar;
                        System.out.println("Você retirou R$"+sacar);
                    }
                    break;
                case 2:
                    System.out.println("Informe o valor desejado: ");
                    depositar=in.nextInt();
                    saldo=saldo+depositar;
                    System.out.println("Você depositou R$"+depositar);
                    break;
                case 3:
                    System.out.println("Seu saldo é R$"+saldo);
            }
        }while (escolha>0 && escolha<4);
    }
}
