 class nestedclass1 {
    int a;
    int b;
    class ey{
        void add(){
        
        int result=a+b;
        System.out.println("answer is"+result);
        
        }
        
        }
        public static void main(String args[]){
            nestedclass1 outerobj=new nestedclass1();
            outerobj.a=20;
            outerobj.b=35;
            nestedclass1.ey innerobj=outerobj.new ey();
            innerobj.add();
            
        
        
    }
}
    
    

