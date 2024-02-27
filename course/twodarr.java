import java.util.*;
public class twodarr {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=13;
       // System.out.println(arr[1][2]);
      // Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
           System.out.print(i+" "+j);
        }
        
       }
    }
    
}
}
