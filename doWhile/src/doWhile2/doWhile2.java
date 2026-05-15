public class doWhile2 {
    public static void main (String args[]){
        int counter=100;
        int num=0;
        do {
            if (counter % 7 == 0) {
                System.out.println(counter);
                num++;
            }
            counter++;
        } while (num<=50);
    }
}
