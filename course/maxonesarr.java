import java.util.*;
public class maxonesarr {
    public static int findingones(int arr[]){
        int count=0;
        int max_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                count++;
            else
            count=0;
            if(count>max_count){
                max_count=count;
            }

        }
        return max_count;
    } 
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findingones(arr));
    }
    
}
