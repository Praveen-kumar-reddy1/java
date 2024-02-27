class combopattern{
    void  pyramid(){
        int n=5;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            
    
    System.out.println();
    }
    }
     void reversepyramid(){
        int z=5;
        
        for(int i=1;i<=z;i++){
            for(int j=1;j<=z-i;j++){
            System.out.print("*");
            }
            
    
    System.out.println();
    }
    }
 public static void main(String args[]){
    combopattern obj=new combopattern();
    obj.pyramid();
    obj.reversepyramid();
 }
     
     }
