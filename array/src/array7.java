import java.util.Scanner;
import java.util.Random;
public class array7 {
    public static void main (String[] args) {
        int[] saldos = rnd();
        int[] bonus = bonus(saldos);
        print(saldos);
        System.out.println();
        print(bonus);
    }
    public static int[] rnd() {
        Random rnd = new Random();
        int[] n = new int[30];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(5000);
        }
        return n;
    }
    // MÉTODO CALCULAR BÔNUS
    public static int[] bonus (int[] n){
        int[] bonus = new int[n.length];
        for  (int i = 0; i < n.length; i++) {
            if (n[i]>4000) bonus[i] = (n[i])*5/4;
            else if (n[i]>2500) bonus[i] = (n[i])*6/5;
            else if (n[i]>1500) bonus[i] = (n[i])*115/100;
            else if (n[i]>500) bonus[i] = (n[i])*11/10;
            else bonus[i] = n[i];
        }
        return bonus;
    }
    // MÉTODO PRINT
    public static void print (int[] n){
        for (int i = 0;i < n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
}
