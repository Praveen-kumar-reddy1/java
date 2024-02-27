public class largestarr {
    public static void method1(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            
            }
            
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        int arr[]={10,20,50,40,100};
        method1(arr);
        
    }
}
