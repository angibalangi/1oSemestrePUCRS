package string6;

import java.util.Scanner;
public class string6 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String palavra = in.nextLine();
        padrao1(palavra);
        padrao2(palavra);
        padrao3(palavra);
        padrao4(palavra);
    }
    public static void padrao1 (String p){
        for (int i = 1; i <= p.length(); i++){
            System.out.println(p.substring(0, p.length()-(p.length()-i)));
        }
    }
    public static void padrao2 (String p){
        String r ="";
        for (int i = p.length() - 1; i >= 0; i--) {
            r += p.charAt(i);
        }
        int t = r.length();
        for (int i = t; i > 0; i--){
            System.out.println(r.substring((t-i),t));
        }
    }
    public static void padrao3 (String p){
        for (int i = 1; i <= p.length(); i++){
            String v = p.substring(0, p.length()-(p.length()-i));
            for (int i2 = 0; i2<= (p.length()-v.length()-1); i2++) System.out.print(" ");
            System.out.println(v);
        }
    }
    public static void padrao4 (String p){
        for (int i = p.length(); i > 0; i--){
            String v = p.substring((p.length()-i),p.length());
            for (int i2 = 0; i2<=p.length()-v.length()-1; i2++) System.out.print(" ");
            System.out.println(v);
        }

    }
}
