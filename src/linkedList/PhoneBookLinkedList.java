package linkedList;

import java.util.*;

public class PhoneBookLinkedList {

    PhoneNode head;
    PhoneNode tail;
    int size;

    public PhoneBookLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertFront(PhoneNode phoneNode) {

        PhoneNode current = head;  //always assign head to current
        if (isEmpty()) {
            head = tail = phoneNode;
        } else {
            current.next = head;  //assign head node to address first
            head = phoneNode;       //assign new node to head
        }
        size++;
    }

    void insertEnd(PhoneNode phoneNode) {

        if (isEmpty()) {
            head = tail = phoneNode;
        } else {
            tail.next = phoneNode;
            tail = phoneNode;
        }
        size++;

    }

    int size() {
        return size;
    }

    void print() {

        PhoneNode current = head;

        while (current != null) {
            System.out.println(current.customer.name + " " + current.customer.lastName);
            current = current.next;
        }

    }

    public int indexOf(String email) {

        PhoneNode current = head;
        int count = 0;

        while (current != null) {

            if (current.customer.email.equalsIgnoreCase(email)) {
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    public int findByFirstName(String firstName) {

        PhoneNode current = head;
        int count = 0;

        while (current != null) {

            if (current.customer.name.equalsIgnoreCase(firstName)) {

                return count;
            }
            count++;
            current = current.next;
        }
        return -1;

    }

    public void sortByName() {

        PhoneNode current1 = head;

        if (current1 == tail) return;

        PhoneNode current2 = head.next;

        boolean swap = true;

        while (swap) {

            current1 = head;
            current2 = head.next;

            while (current1 != null && current2 != null) {

                if (current1.customer.name.compareToIgnoreCase(current2.customer.name) > 0) {
                    swap = true;
                    swapData(current1, current2);
                }
            }
        }
    }

    public void sortByName2(){

        List<PhoneNode> sortedList= new ArrayList<PhoneNode>();
        PhoneNode current = head;

        while (current != null){
            sortedList.add(current);
            current=current.next;
        }
        sortedList.sort(Comparator.comparing(p -> p.customer.name));
        sortedList.forEach(phoneNode -> System.out.println(phoneNode.customer.name));

    }

    void swapData(PhoneNode current1, PhoneNode current2) {

        PhoneNode temp = new PhoneNode(current2.customer);

       current2.customer.name=current1.customer.name;
       current2.customer.lastName=current1.customer.lastName;
       current2.customer.email=current1.customer.email;
       current2.customer.phoneNumber=current1.customer.phoneNumber;

       current1.customer.name=temp.customer.name;
       current1.customer.lastName=temp.customer.lastName;
       current1.customer.email=temp.customer.email;
       current1.customer.phoneNumber=temp.customer.phoneNumber;


    }

    public void removeDuplicates() {

        Set<PhoneNode> noDuplicated = new HashSet<>();
        PhoneNode current = head;

        while (current != null){

            if (!noDuplicated.add(current));
            deleteByEmail(current.customer.email);
            current=current.next;
        }
    }

    public void deleteByEmail(String email){

        PhoneNode prev=head;
        PhoneNode current = head;

        while (current!=null){

            if (current.customer.email.equalsIgnoreCase(email)) {

              if (size==1){
                  head=tail=null;
              }else {
                  head=current.next;
              }
            } else if (current==tail) {
                tail=prev;
                tail.next=null;

            }else {

                prev.next=current.next;
            }
            size--;
        }
        prev= null;
        current=current.next;
    }

    public void removeDuplicateEmail() {  //O(n)

        PhoneNode current = head;
        while (current != null) {

            PhoneNode distinct = head;

            while (distinct != null && distinct.customer.email.equals(current.customer.email)) { //to make jumps need this
                distinct = distinct.next;

            }
            current.next = distinct;
            current = distinct;
        }

    }

}
