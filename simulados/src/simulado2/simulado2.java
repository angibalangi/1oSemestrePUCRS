import java.util.Scanner;
public class simulado2 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a idade da criança");
        int idade = in.nextInt();
        do {
            System.out.println("Informe uma idade válida (0,12]");
            idade = in.nextInt();
        } while (idade >12);
        System.out.println("Informe o peso da criança (kg)");
        double peso = in.nextDouble();
        do {
            System.out.println("Informe um peso válido {p >= 5}");
            peso = in.nextDouble();
        }while (peso<5);
        int dosagem = dosagemGen(idade, peso);
        System.out.println("A dosagem ideal é "+dosagem);
        System.out.println("O número de gotas necessário é"+(dosagem/10));
    }
    public static int dosagemGen(int i, double p){
        if (p<=9) return 125;
        else if (p>9 && p<=16) return 250;
        else if (p>16 && p<=24) return 375;
        else if (p>24 && p<=30) return 500;
        else return 750;
    }
}
