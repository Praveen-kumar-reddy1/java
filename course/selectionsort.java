class selectionsort{
    public static void selection(int arr[]){
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
      }
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
    