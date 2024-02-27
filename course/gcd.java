import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int x=sc.nextInt();
        System.out.println("enter the second number");
        int y=sc.nextInt();
        System.out.println("enter the third number:");
        int z=sc.nextInt();
        int a=0;
        if(x<y&&x<z){
             a=x;

        }
        else if(y<z){
             a=y;
        }
        else{
            a=z;
        }
        for(int i=a;i>=1;i--){
            if(x%i==0&&y%i==0&&z%i==0){
            System.out.println(i);
            break;
            }

        }
        

        
    }
    
}
