package string7;

import java.util.Scanner;
public class string7 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String nome1 = in.nextLine();
        String nome2 = in.nextLine();
        String nome3 = in.nextLine();
        String primeiro = "", segundo = "", terceiro = "";
        if (nome2.compareToIgnoreCase(nome1)>nome1.compareToIgnoreCase(nome2) && nome3.compareToIgnoreCase(nome1)>nome1.compareToIgnoreCase(nome3)) {
            primeiro = nome1;
            if (nome3.compareToIgnoreCase(nome2)>nome2.compareToIgnoreCase(nome3)) {
                segundo = nome2;
                terceiro = nome3;
            }
            else {
                segundo = nome3;
                terceiro = nome2;
            }
        }
        else if (nome1.compareToIgnoreCase(nome2)>nome2.compareToIgnoreCase(nome1) && nome3.compareToIgnoreCase(nome2)>nome2.compareToIgnoreCase(nome3)){
            primeiro = nome2;
            if (nome3.compareToIgnoreCase(nome1)>nome1.compareToIgnoreCase(nome3)) {
                segundo = nome1;
                terceiro = nome3;
            }
            else {
                segundo = nome3;
                terceiro = nome1;
            }
        }
        else {
            primeiro = nome3;
            if (nome2.compareToIgnoreCase(nome1)>nome1.compareToIgnoreCase(nome2)) {
                segundo = nome1;
                terceiro = nome2;
            }
            else {
                segundo = nome2;
                terceiro = nome1;
            }
        }

        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }
}
