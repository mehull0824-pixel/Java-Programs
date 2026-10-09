import java.util.*;
public class Butter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1; row<=n/2+1; row++){
            for(int s=0; s<row-1; s++){
                System.out.print(" ");
                for(int stars=1; stars<2*((n/2+1)-row)+1; stars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int row=2; row<=n/2+1; row++){
            int symbol=n/2-row;
            for(; symbol>=0; symbol--){
                System.out.print(" ");
                for(int j=1; j<=2*row-1; j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
