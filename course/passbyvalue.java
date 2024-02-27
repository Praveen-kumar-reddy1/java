class passbyvalue{
    int data=50;
    void add(int data){
        data=data+100;
        System.out.println(data);
    }
    public static void main(String[] args) {
        passbyvalue obj=new passbyvalue();
        System.out.println(obj.data);
        obj.add(500);
        System.out.println(obj.data);

    }
}





