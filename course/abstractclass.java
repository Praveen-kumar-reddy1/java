abstract class Bike{  
   Bike(){
    System.out.println("bike is created");
    }  
   abstract void run();  
   void changeGear(){
    System.out.println("gear changed");
    }  
 }  

 class Honda extends Bike{  
  void run(){
    System.out.println("running safely");
  }
 }
 
//Creating a Test class which calls abstract and non-abstract methods  
 class abstractclass{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
    
