package linkedList;

public class PhoneBookLinkedList {

    PhoneNode head;
    PhoneNode tail;
    int size;

    boolean isEmpty(){
       return head==null;
    }
    void insert(Customer customer){
        PhoneNode newNode= new PhoneNode(customer);
        PhoneNode current=head;
        if (isEmpty()){
            head=tail=newNode;
        }else {
            current.next=head;
            head=newNode;
        }
        size++;
    }
    int size(){
        return size;
    }

}
