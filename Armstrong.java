import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int d=0;
        for(int i=n; i>0; i=i/10 ){
            d++;
        }
        for(int i=n; i>0; i=i/10){
            int rem=n%10;
            int p=1;
            for(int j=0; j<d; j++){
                p=p*rem;
            }
            sum=sum+p;
            n=n/10;

        }
        if(sum==temp){
        System.out.println("Armstrong");
        }
        else{
            System.out.println("not");
        }
    }
    
}
