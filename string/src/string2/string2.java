import java.util.Scanner;
public class string2 {
    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String fraseIn = in.nextLine();
        String fraseNo = upVogal(fraseIn);
        System.out.println(fraseNo);
    }
    public static String upVogal (String fraseIn){
        String fraseNo = fraseIn.replace('a', 'A');
        fraseNo = fraseNo.replace('e','E');
        fraseNo = fraseNo.replace('i','I');
        fraseNo = fraseNo.replace('o','O');
        fraseNo = fraseNo.replace('u','U');
        return fraseNo;
    }
}
