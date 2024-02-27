public class smallestarr {
    public static void method1(int arr[]){
      int smallest=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
          smallest=arr[i];
        }
      }
      System.out.println(smallest);

    }
    public static void main(String[] args) {
        int arr[]={10,9,11,14,8,6};
        method1(arr);
    }
    
}
