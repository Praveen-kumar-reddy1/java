import java.util.Arrays;
public class reversewordsinstring {
    public static void reverse(String str){
      String words[]= str.split(" ");
        for(int i=words.length-1;i>=0;i--){
           System.out.print(words[i]+" ");
        }
        }
    
    
    public static void main(String[] args) {
        String str="the sky is blue";
        reverse(str);
        
        
        
      
        
    }
    
}
