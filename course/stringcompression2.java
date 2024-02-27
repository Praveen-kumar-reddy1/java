public class stringcompression2 {
    public static String compress(String str){
        String s=str.charAt(0)+""; 
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                s=s+count;
                s=s+str.charAt(i);
                count=1;
                }
                else{
                    s=s+str.charAt(i);
                }
            }
        }
        return s;

    }
    public static void main(String[] args) {
        String str="aaabbbcdde";
        System.out.println(compress(str));
    }
}
    

