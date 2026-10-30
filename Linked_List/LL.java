package Linked_List;
public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    //insert at first
    public void insertFirst(int val){
        Node newNode=new Node(val);

        newNode.next=head;
        head=newNode;

        if(tail==null){ //added at first element
            tail=head;
        }
        size+=1;
    }

    // ** insert at the last**
    //when tail is null that means nothing is in linked list and we will call insertfirst

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return ;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
        tail=newNode;

        size++;
    }

    //insert at a particulaar position

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return ;
        }
        if(index==size){
            insertLast(val);
            return ;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newNode=new Node(val,temp.next);
        temp.next=newNode;
        size++;

    }

    //deleting the first node
    public int deleteFirst(){
        int val=head.val;
        head=head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //delete the lasst node
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int val=tail.val;
        tail=secondLast;
        tail.next=null;

        return val;
    }

    //delete the particular index

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int val=prev.next.val;

        prev.next=prev.next.next;

        return val;
    }

    //give pointer to that node or we can say find the node via index
    public Node get(int index){
        Node node=head;

        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //find the node via value
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //display
    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    
}
