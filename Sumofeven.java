import java.util.*;
public class Sumofeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n%2==0){
            int d = n%10;
            sum +=d;
            n/=10;

        }
        System.out.println(sum);
    }
    
}
