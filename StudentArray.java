import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            
        }
        int max = marks[0];
        for(int i=1; i<n; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        int min = marks[0];
        for(int i=1; i<n; i++){
            if(marks[i] < max){
                min = marks[i];
            }

    }
    System.out.println("Highest marks:" + max);
    System.out.println("Lowest marks:" + min);

    System.out.println(Integer.MAX_VALUE);

    long sum = 0;
    for(int i=0; i<n; i++){
        sum+=marks[i];
    }
    System.out.println("Sum:" + sum);


    double avg = (double)sum/n;
    System.out.println("Average:"+ avg);


    System.out.println("Value to search");
    int val = sc.nextInt();

    boolean found = false;
    for(int i=0; i<n; i++){
        if(marks[i]==val){
            found = true;
            break;
        }
    }
    if(found) System.out.println("found");
    else System.out.println("Not found");
        
    }
 }

