import java.util.Scanner;
public class simulado1 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        double a, ac;
        System.out.println("Informe a largura do terreno (m): ");
        a = in.nextDouble();
        System.out.println("Informe o comprimento do terreno (m): ");
        a = a*in.nextDouble();
        System.out.println("Informe a largura da casa (m): ");
        ac = in.nextDouble();
        System.out.println("Informe o comprimento da casa (m): ");
        ac = ac*in.nextDouble();
        System.out.println("Área livre no terreno: "+(a-ac)+" m²");
    }
}
