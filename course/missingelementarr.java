public class missingelementarr {
    
        public static int missingNumber(int []a, int N) {
            
            int sum1=0;
            for(int i=0;i<N-1;i++){
                sum1=sum1+a[i];
            }
            System.out.println(sum1);
    
            int sum2=0;
            for(int j=1;j<=N;j++){
                sum2=sum2+j;
            }
            System.out.println(sum2);
             
            int result=sum2-sum1;
            return result;
    
}
        public static void main(String[] args) {
            int a[]={1,2,4,5};
            int N=5;
           System.out.println(missingNumber(a,N)); 

        }
    }