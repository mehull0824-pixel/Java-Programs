import java.util.*;
class BoundSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] array = {{1,2,3,4},
                        {4,5,7,8,},
                        {6,6,4,2},
                         {2,5,3,6,}};
                         int sum = 0;
                         for(int i=0; i<array.length; i++){
                            for(int j=0; j<array[0].length; j++){
                                if(i==0 || (i=array.length-1)){
                                    sum+=array[i][j];
                                }
                                if(j==0 && (i<0 && i<array.length-1))
                                    sum+=array[i][j];
                                if(j==array[0].length && (i>0 && i<array.length-1))
                                    sum+=array[i][j];
                            }
                         }
                         System.out.print(sum);
    }
}