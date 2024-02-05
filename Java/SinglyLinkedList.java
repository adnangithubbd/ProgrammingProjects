

public class SinglyLinkedList {

    private class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    
    private Node head;
    SinglyLinkedList(){
        this.head=null;
    }  
    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    } 

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.err.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
   void delete(int data){
    if(head==null){
        return ;
    }
    if(head.data==data){
        head=head.next;
        return;
    }
    Node temp=head;
    while (temp.next!=null) {
        if(temp.next.data ==data){
            temp.next=temp.next.next;
        }
        temp=temp.next;
    }
   }
    public static void main(String[] args) {
      SinglyLinkedList list=new SinglyLinkedList();
      list.insert(12);
      list.insert(13);
      list.insert(42);
     
   
      list.display();

    }
}
