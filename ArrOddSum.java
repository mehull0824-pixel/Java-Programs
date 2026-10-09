import java.util.*;

public class ArrOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            if(arr[i]%2!=0){
                int d = arr[i]%10;
                sum = sum + d;
                arr[i]/=10;
            }
        }
        System.out.print(sum);
    }
    
}

