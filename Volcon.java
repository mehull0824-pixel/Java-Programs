import java.util.*;
public class Volcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("vowel");
                break;
                default:
                    if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                    
                        System.out.println("Consonant");
                    }
                    
                    else{
                        System.out.println("Not an alphabet");
                    }
                    
                    }
        }
    }
    

