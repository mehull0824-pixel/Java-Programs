import java.util.*;
public class Christree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int s=0; s<i-1; s++){
                System.out.print(" ");
                for(int stars=1; stars<=2*(n-i)+1; stars++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
    
}
