public class passbyref {
    int a=50;
    void add(passbyref obj){
      obj.a=obj.a+100;
      System.out.println(obj.a);
    }
    public static void main(String[] args) {
        passbyref obj=new passbyref();
        System.out.println(obj.a);
        obj.add(obj);
        System.out.println(obj.a);
        
    }
    
}
