public class seclarandsmall {
    public static int method(int arr[]){
       int largest=Integer.MIN_VALUE;
       int slargest=-1;
       int smallest=Integer.MAX_VALUE;
       int ssmallest=-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          slargest=largest;
           largest=arr[i];
           
        }
        else if(arr[i]<largest&&arr[i]>slargest){
          slargest=arr[i];
        }

          if(arr[i]<smallest){
          ssmallest=smallest;
           smallest=arr[i];
           
        }
        else if(arr[i]>smallest&&arr[i]<ssmallest){
          ssmallest=arr[i];

        }
        
}
       int res[]={slargest,ssmallest};
      return res;
    }
  
    public static void main(String[] args) {
        int arr[]={4,33,90,200,78};
       System.out.println(method(arr));
      }
}