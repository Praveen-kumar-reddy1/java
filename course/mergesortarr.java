public class mergesortarr {


    public static void mergesort(int[] arr, int l, int r){
        // Write your code here
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid); // corrected method call
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int arr[],int l,int mid,int r){
        int temp[]=new int[r-l+1];
        int i=l; // corrected variable name
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=r){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=arr[j];
            j++;
            k++;
        }
        // Copy elements from temp array back to original array
        for (i = 0; i < temp.length; i++) {
            arr[l + i] = temp[i];
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
          
    }
    
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,5);
        printarray(arr);
    }
}
