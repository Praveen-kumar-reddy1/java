import java.util.*;
public class movezerotoend {
    public static void move(int arr[]){
        int nz=0;
        int z=0;
        for(int i=0;i<arr.length;i++){
            if(arr[nz]==0){
                nz++;
            }
            else{
                int temp=arr[nz];
                 arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String args[]){
        int arr[]={0,10,22,8,0,5,0};
        move(arr);
    }
}
