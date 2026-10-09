import java.util.*;
public class Cprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2;

        while(i<n){
            if(n%i==0){
                System.out.println("not prime");
                return ;
            }
            i++;
        }
        System.out.println("prime");
        }
    
}
