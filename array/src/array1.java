public class array1 {
    public static void main (String args[]){
        int ind[] = {2, 6, 5, 32, 3, 90, 85, 3, 55, 10, 11, 56, 32, 22, 102, 3, 23, 84, 90, 44};
        System.out.println("O vetor possui "+ ind.length + " elementos.");
        for(int i = 0; i < ind.length; i++){
            System.out.print("O índice " + i + " tem o valor de " + ind[i]+".");
        }
    }
}
