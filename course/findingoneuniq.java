
class findingoneuniq{
    public static void search(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int count=0;
          for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        
        if(count==1){
           System.out.println(arr[i]);
        }
    }
    
    }
    public static void main(String[] args) {
        int []arr = {3,3,5,6,6,2,2,1,1};
        search(arr);
        
        //System.out.print("[" + finalres[0] + ", " + finalres[1] + "]");

    }
}