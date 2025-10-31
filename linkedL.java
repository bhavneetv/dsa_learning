
public class linkedL {
    Node head = null;

    class Node {
        String data;
        Node next;

        public Node(String data) {

            this.data = data;
            this.next = null;

        }

    }

    void setFirst(String a) {
        Node Newnode = new Node(a);
        if (head == null) {
            head = Newnode;
            return;

        }

        Newnode.next = head;
        head = Newnode;

    }

    void addLast(String a) {
        Node Newn = new Node(a);
        if (head == null) {
            head = Newn;
            return;
        }

        // this.next = Newn;

    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;

        }

        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node co = head;
        Node coL = head.next;

        while (coL != null) {
            co = co.next;
            coL = coL.next;
        }
        coL.next = null;

    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedL ll = new linkedL();
        ll.setFirst("a");
        ll.setFirst("a is");
        ll.setFirst("tsting");

        ll.display();

        ll.deleteFirst();
        ll.display();
        
    }

}
