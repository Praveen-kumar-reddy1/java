import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the 1st number:");
        int x=sc.nextInt();
        System.out.println("what is the second number:");
        int y=sc.nextInt();
        System.out.println("what is the third number:");
        int z=sc.nextInt();
      
        for(int i=1;i<=x*y*z;i++){
          if(i%x==0&&i%y==0&&i%z==0){
          
            System.out.println(i);
            break;
          }
        }
        
      }
    }