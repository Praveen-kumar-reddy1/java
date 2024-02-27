public class stringcompression1 {
    public static String compress(String str){
        String s=str.charAt(0)+"";//ikkada +"" endhuku add chesam antte akkada string s ni initialize chesthhunnam.. kaani right side lo char print avuthundhi andhuke +""chesthe empty string add avuthundhi appudu totaol ga adhi kooda string avuthundhi
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                s=s+str.charAt(i);
            }
        }
        return s;

    }
    public static void main(String[] args) {
        String str="aaabbbccdde";
        System.out.println(compress(str));
    }
}