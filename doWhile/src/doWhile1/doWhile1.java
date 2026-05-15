package doWhile1;

public class doWhile1 {
    public static void main (String args[]){
        int counter=501;
        int soma=0;
        do{
            if (counter%2!=0) {
                System.out.println(counter);
                soma=soma+counter;
            }
            counter++;
        } while (counter<=700);
        System.out.println("Soma: "+soma);
    }

}
