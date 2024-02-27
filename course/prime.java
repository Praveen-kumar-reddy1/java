//pime number antte 2 conditions 
        //1)number should be greater than 1
        //2)number should have only 2 factors (1 and itself)
import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number =");
        int a=sc.nextInt();
        int count=0;
        
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==2)
                System.out.println("it is a prime number");
            else
                System.out.println("it is not a prime number");
            
        
            
        
    }
}
        


                
                
            
    
    

        

    



    

