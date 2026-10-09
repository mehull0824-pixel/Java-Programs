import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for(int i=1; i<n; i++){
           // System.out.print(i+" ");
      //  }
        fun(n);
        System.out.println();
    }
    //static void fun(int n, int i) {
      //  if(i>n)return;
        //System.out.print(i+ " ");
       // fun(n, i+1);
    //}
    //single variable recursion
    static void fun(int n) {
        if(n <= 0) return;
        System.out.print(n + " ");
        fun(n - 1);
    }
}
