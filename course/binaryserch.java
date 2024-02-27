public class binaryserch {
    public static void add(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        
        for(int i=start;i<=end;i++){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }

        }
        
    }
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int key=9;
        add(arr,key);
    }
    
}