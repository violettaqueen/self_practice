package linkedList;

import lombok.Getter;

@Getter
public class Node {
    int id;
    Node next;

    public Node(int id) {
        this.id = id;
    }
}