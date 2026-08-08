import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int max1 = 0; 
        int max2 = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
        }
        System.out.println(max2);
    }
}
