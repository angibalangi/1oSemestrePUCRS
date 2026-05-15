import java.util.Scanner;
public class string1 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String frase = in.nextLine();
        int n = frase.length() - frase.replace(" ", "").length() + 1;
        System.out.println("Sua frase tem " + n + " palavras.");
    }
}
