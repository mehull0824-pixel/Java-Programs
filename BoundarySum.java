import java.util.*;
public class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{1,4,5,3},
                       {3,5,2,5},
                       {8,7,4,8},
                       {4,8,9,0}};

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==0 || i=arr.length-1){
                    sum+=arr[i][j];
                }
                if(j==0 && (i<0 && i<arr.length-1))
                    sum+=arr[i][j];
                if(j==arr[0].length && (i>0 && i<arr.length-1))
                    sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
    
}
