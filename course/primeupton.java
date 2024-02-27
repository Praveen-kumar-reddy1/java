import java.util.Scanner;
public class primeupton {
    public static void main(String args[]){
        Scanner praveen=new Scanner(System.in);
        System.out.println("print how many prime numbers u want");
        int x=praveen.nextInt();
        int count=0;
        for(int y=2;y<=x;y++){
            count=0;
          for(int i=1;i<=y;i++){
            if(y%i==0)
                count++;

            
          }
          if(count++==2)
              System.out.println(y);
        }
    }
}

        
              
              
                
            
        
        
        


        
        
    
    

