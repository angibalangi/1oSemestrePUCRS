import java.util.Scanner;
public class doWhile3 {
    public static void main (String args[]){
        Scanner in=new Scanner(System.in);
        int counter=1;
        int fat=1;
        int som=0;
        int num=in.nextInt();
        do {
            som=counter+som;
            fat=counter*fat;
            counter++;
        } while (counter<=num);
        if (num>0){
            System.out.println("Somatório: "+som);
            System.out.println("Fatorial: "+fat);
        } else System.out.println("ERRO");
    }
}
