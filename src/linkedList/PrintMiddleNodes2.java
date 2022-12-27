package linkedList;

public class PrintMiddleNodes2 {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i <= 6; i++) {
            list.add(i);
        }
        printMiddleNodes(list);
    }

    public static void printMiddleNodes(MySinglyLinkedList node){

        Node p1 = node.head;
        Node p2 = node.head;

        while (p2 != node.tail && p2.next != node.tail){
            p1 = p1.next;
            p2 = p2.next;
        }

        if (p2 == node.tail) System.out.println(p1.id);
        else System.out.println(p1.id + ", "+ p2.id);
    }
}

