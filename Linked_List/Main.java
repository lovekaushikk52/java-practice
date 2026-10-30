package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list=new LL(); 
        //here linked list pf size 0 will be initialized with head and tail
        list.insertFirst(13);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(18);
        list.insertLast(89);
        list.insert(99, 4);

        list.display();
        // System.out.println(list.deleteFirst());

        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
