import java.util.Arrays;
public class anagram {
    public static void checking(String s,String t){
        char sachin[]=s.toCharArray();
        char tendulkar[]=t.toCharArray();
        Arrays.sort(sachin);
        for(int i=0;i<sachin.length;i++){
            System.out.print(sachin[i]);
        }
        System.out.println();
        Arrays.sort(tendulkar);
        for(int j=0;j<tendulkar.length;j++){
            System.out.print(tendulkar[j]);
        }
        System.out.println();
        if(Arrays.equals(sachin,tendulkar)){
            System.out.println("yes its anagram");
        }
        else{
            System.out.println("no its not a anagram");
        }

    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        checking(s,t);
    }
}
