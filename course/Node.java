 class Node {
        int data;
        Node next;
    
    Node(int data){
        this.data=data;
        this.next=next;
    }
    
}
class linkedlist{
    Node head;
     void printlinkedlist(){
          Node curr=head;
          while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
          }
    } 
}
    class basic{
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
     //creating  nodes and passing the data to the node class 
        Node p1=new Node(10);
        Node p2=new Node(20);
        Node p3=new Node(30);
        Node p4=new Node(40);

    // for connecting purpose    
       p1.next=p2;
       p2.next=p3;
       p3.next=p4;
       p4.next=null;


       obj.head =p1;

       obj.printlinkedlist();
    }

}


