public class polindromeofstring {
    public static void main(String[] args) {
        String str="racecar";
        String rstr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rstr=ch+rstr;
        }
        if(str.equals(rstr)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a polindrome");
        }
    }
    
}
