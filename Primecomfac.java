import java.util.*;
public class Primecomfac {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x;
        if(a<b)
            x=b;
        else
            x=b;
        
        for(int i=1; i<=x; i++){
            if((a%i==0) && (b%i==0)){
                System.out.println(i);
            }
        }


    }
}
