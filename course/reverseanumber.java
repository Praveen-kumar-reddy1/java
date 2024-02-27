import java.util.Scanner;
public class reverseanumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the number?");
        int number=sc.nextInt();
        int rev=0;
        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
         System.out.println(rev);

    }
}