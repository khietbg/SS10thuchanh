package thuchanh2;

import javax.xml.soap.Node;
import java.util.StringJoiner;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                    .add("next=" + next)
                    .add("data=" + data)
                    .toString();
        }
    }
    public void add(Object data) {
        Node temp = head;
        Node holder;
        int index = 0;
        for(int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
            holder = temp.next;
            temp.next= new Node(data);
            temp.next.next = holder;
            numNodes++;

        }
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index) {
        Node temp= head;
        for (int i = 0; i < index; i++) {
           temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            System.out.println(temp.data);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyLinkedList.class.getSimpleName() + "[", "]")
                .add("head=" + head)
                .add("numNodes=" + numNodes)
                .toString();
    }
}

