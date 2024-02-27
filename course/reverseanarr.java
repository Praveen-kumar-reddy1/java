import java.util.*;
public class reverseanarr {
    public static void reverse(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    
}
}