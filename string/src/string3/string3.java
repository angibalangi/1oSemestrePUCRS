import java.util.Scanner;
public class string3 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        int nVogal, maisVogal = 0;
        String palavraVogal = "ERRO", palavra = in.nextLine();
        while (palavra.equals("SAIR")) {
            System.out.println("Insira pelo menos uma palavra.");
            palavra = in.nextLine();
        }
        while (!palavra.equals("SAIR")){
            nVogal = vogalCounter(palavra);
            if (nVogal>maisVogal) {
                maisVogal = nVogal;
                palavraVogal = palavra;
            }
            palavra = in.nextLine();
        }
        System.out.println("A palavra com mais vogais é " + palavraVogal);
    }
    public static int vogalCounter (String palavra){
        int nVogal = 0, counter = 0;
        while (counter<palavra.length()){
            if (palavra.charAt(counter) == 'a' ||
                    palavra.charAt(counter) == 'e' ||
                    palavra.charAt(counter) == 'i' ||
                    palavra.charAt(counter) == 'o' ||
                    palavra.charAt(counter) == 'u' ||
                    palavra.charAt(counter) == 'A' ||
                    palavra.charAt(counter) == 'E' ||
                    palavra.charAt(counter) == 'I' ||
                    palavra.charAt(counter) == 'O' ||
                    palavra.charAt(counter) == 'U') {
                nVogal++;
            }
            counter++;
        }
        return nVogal;
    }
}
