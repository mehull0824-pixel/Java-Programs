import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int d[] = {500,200,100,50,20,10,5,2,1};
         int count = 0;
        for(int i:d){
            if(n>=i){
                count+=n/i;
                n%=i;
            }
        }
        System.out.println(count);
    }   
}