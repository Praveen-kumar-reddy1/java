class students{
    int id;
    String name;
    static String college="jain";


    public static void main(String args[]){
        students s1=new students();
        s1.id=1;
        s1.name="praveen";
        System.out.println(s1.id+s1.name+s1.college);
        students s2=new students();
        s2.id=2;
        s2.name="bindhu";
        s2.college="ju";
        System.out.println(s2.id+s2.name+s2.college);
        students s3=new students();
        s3.id=2;
        s3.name="bindhu";
        s3.college="ju";
        System.out.println(s3.id+s3.name+s3.college);



    }
}
