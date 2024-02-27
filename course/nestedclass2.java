 class nestedclass2 {
    class x{
        class y{
            void m1(){
                System.out.println("praveen");
            }
        }
    }
public static void main(String args[]){
    //nestedclass2 obj=new nestedclass2();
    //nestedclass2.x obj2=obj.new x();
    //x.y obj3=obj2.new y();
    //obj3.m1();
    new nestedclass2().new x().new y().m1();
    
}
 }
