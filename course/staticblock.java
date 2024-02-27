class staticblock{
	int x=10;
	int y=15;
	static{
	
		staticblock obj=new staticblock();
		obj.y=obj.y+10;
		System.out.println(obj.y);
        staticblock obj2=new staticblock();
		obj2.m1();
		
	}
	public static void main(String args[]){
		

	}
	public  void m1(){
		x=x+10;
		System.out.println(x);

	}
}