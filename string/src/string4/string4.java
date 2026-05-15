import java.util.Scanner;
public class string4 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        String[] nomeSplit = nome.split(" ");
        for (String s : nomeSplit) {
            System.out.print(s.charAt(0));
        }
        System.out.print(" é a sua rubrica.");
    }
}
