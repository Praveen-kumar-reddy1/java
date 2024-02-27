import java.util.*;
public class rotatearray {
     static void reverse(int a[],int start,int end){
        while(start<end){
            int temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }        
    }
    public static void rotate(int a[],int k){
        if(k<0){
            k=k+a.length;
        }
        else{
            k=k%a.length;
        }

    reverse(a,0,k-1);
    reverse(a,k,a.length-1);
    reverse(a,0,a.length-1);
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        int k=4;
        rotate(a,k);
        System.out.println(Arrays.toString(a));   
    }
    
}
