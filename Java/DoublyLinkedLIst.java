class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

public class DoublyLinkedLIst {
   private DNode head;
   DoublyLinkedLIst(){
    this.head=null;
   }

   public void insertBegin(int data){
    DNode newNode=new DNode(data);
    if(head==null){
        head=newNode;
    }else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
   }
   public void insEnd(int data){
        DNode newNode=new DNode(data);
        if(head==null){
            head=newNode;
        }else{
            DNode temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
   } 
   void delete(int data){
    if (head==null) {
        return ;
    }
    if(head.data==data){
        head=head.next;
        head.prev=null;
        return ;
    }
    DNode temp=head;
    while (temp!=null) {
        if(temp.data==data){
            temp.prev.next=temp.next;
        }
    return;
    }
    temp=temp.next;
   }
   void display(){
    DNode temp=head;
    while (temp!=null) {
        System.out.println(temp.data +" ");
        temp=temp.next;
    }
    System.out.println();
   }

   public static void main(String[] args) {
    DoublyLinkedLIst list=new DoublyLinkedLIst();
        list.insEnd(5);
        list.insEnd(10);
        list.insEnd(15);
        //list.delete(15);
        list.insEnd(5);
        list.insEnd(34);
        list.insEnd(5);
        list.display();

   }
   
    
}
