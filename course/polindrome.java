import java.util.Scanner;
public class polindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the num");
        int num=sc.nextInt();
        int originalnum=num;
        int rev_value=0;
        while(num!=0){
            rev_value=rev_value*10+num%10;
            num=num/10;
        }
        System.out.println(rev_value);
        if(originalnum==rev_value)
           System.out.print( "yes it is a palindrome number");
        
        else
            System.out.print( "no it is not  a palindrome number");
    }    
}        

        
    

    

