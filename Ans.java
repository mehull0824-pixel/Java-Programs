import java.util.*;
public class Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            int s = n-row;
            for(int col=1; col<=n; col++){
                if(s>0){
                    System.out.print(" ");
                    s--;
                }
                else{
                    System.out.print("*");
                }
                for(int j=1; j<row; j++){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
    
}
