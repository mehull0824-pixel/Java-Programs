import java.util.*;
public class Fproduct {
    public static int calcProduct(int a, int b) {
        int product = a*b;
        return product;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calcProduct(a,b);
        System.out.println(product);
    }
    
}
