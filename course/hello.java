class hello{
    public static void countoccurence(String str,char target){
        char arr[]=str.toCharArray();
          int count=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
          }
          System.out.println(count);

    }
    public static void main(String[] args) {
        String s="praveen";
        char target='e';
        countoccurence(s,target);
    }
}
    
        
     