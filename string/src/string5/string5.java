import java.util.Scanner;
public class string5 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String palavra = in.nextLine();
        for (int i = palavra.length() - 1; i>=0; i--){
            System.out.print(palavra.charAt(i));
        }
    }
}
