import java.util.Scanner;
public class Marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String a = sc.nextLine();
        System.out.println("Enter your roll no.");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your course :");
        String c = sc.nextLine();
        System.out.println("Enter your age:");
        int d = sc.nextInt();
        System.out.println("Enter your marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        
        
        int m3 = sc.nextInt();
        int total = (m1+m2+m3);
        System.out.println(total);
        
    }

    
}
