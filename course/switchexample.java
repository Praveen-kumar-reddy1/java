import java.util.Scanner;
public class switchexample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number"+"=");
        int a=sc.nextInt();
        switch(a){
            case 1:
             System.out.println("monday");
             break;
            case 2:
             System.out.println("tuesday");
             break;
            case 3:
             System.out.println("wednesday");
             break;
            case 4:
             System.out.println("thursday");
             break;
            default:
            System.out.println("enter correct value");
        }
    }
    
}
