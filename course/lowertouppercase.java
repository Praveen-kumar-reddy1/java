public class lowertouppercase {
    public static void main(String[] args) {
        String s="praveen";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            arr[i]=(char)(arr[i]-32);
            System.out.print(arr[i]);
        }
         //if we want to convert upper to lower then simply do +32;
}
}
