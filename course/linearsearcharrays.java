class linearsearcharrays{
    public static int linearsearch(int num[],int key){
    
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
              return i;
            }
        
        }
        return -1;
        

    }
    public static void main(String[] args) {
        int num[]={10,15,20,25,30,35,40,45};
        int key=30;
        
        
         if(linearsearch(num,key)==-1)
            System.out.println("not found");
         else{
            System.out.println(linearsearch(num,key));
         }
            

         
        
}
}