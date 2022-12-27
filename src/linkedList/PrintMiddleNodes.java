package linkedList;

public class PrintMiddleNodes {

    public static void main(String[] args) {

        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList node){

        Node a= node.head;
        Node b= node.head;

        while (b != node.tail && b.next!= node.tail){
            a = a.next;
            b = b.next.next;
        }
        if (b== node.tail ) System.out.println(a);
        else System.out.println(b);
    }
}
