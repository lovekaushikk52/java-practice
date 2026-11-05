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
        size--;

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
        size--;

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

    //questions

    public void duplicates(){
        Node node=head;
        
        while (node.next!=null){

            if(node.val==node.next.val){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    //merge
    public static LL merge(LL first,LL second){
        Node f=first.head;
        Node s=second.head;

        LL ans=new LL();

        while(f!=null && s!=null ){

            if(s.val<f.val){
                ans.insertLast(s.val);
                s=s.next;
            }
            else{
                ans.insertLast(f.val);
                f=f.next;
            }
        }

        while(s!=null){
            ans.insertLast(s.val);
            s=s.next;
        }
        while(f!=null){
            ans.insertLast(f.val);
            f=f.next;
        }
        return ans;
    }

    //fast pointer will move two place ahead whereas slow pointer will move one step ahead
    public boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int lenCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                // calculate the length of slow

                Node temp=slow;
                int length=0;

                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

    // is happy

    public boolean isHappy(int n){

        int slow=n;
        int fast=n;

        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }
        while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }

    private int findSquare(int n){

        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+rem*rem;
            n=n/10;
        }
        return ans;
    }


    public static void main(String[] args) {
        LL first=new LL();
        LL second =new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(9);

        LL ans=LL.merge(first,second);
        ans.display();
    }
    
}
