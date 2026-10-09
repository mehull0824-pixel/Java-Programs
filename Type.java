import java.util.*;
public class Type {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        switch(a>0 ? 1 : (a<0 ? -1 : 0)){
              
                case 1:
                    System.out.println("positive");
                    break;
                case -1:
                    System.out.println("negative");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
                default:
                    System.out.println("invalid input");

        }
    }

    
}
