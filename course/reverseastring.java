import java.util.Scanner; 
 public class reverseastring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("what is the string?");
        String name=sc.nextLine();
        String reverse=" ";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
             reverse=ch+reverse;
             
            }
             System.out.println(reverse);

        

    }

    
}
