import java.util.*;

public class ProdOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int prod = 1;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            prod = prod * arr[i];
        }
        System.out.print(prod);
    }
    
}
