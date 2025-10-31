
public class stacks {
    // Node h ead;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    static class stackss {
        Node head;

        void pushEle(int data) {
            Node t = new Node(data);
            if (head == null) {
                head = t;
                return;

            }

            t.next = head;
            head = t;

        }

        void pop() {
            if (head == null) {
                System.out.println("Under flow");
            }

            head = head.next;

        }

        void peek() {
            System.out.println("This is first data :" + head.data);
        }

        void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        stackss d = new stackss();
        d.pushEle(5);
        d.pushEle(6);
        d.pushEle(7);
        d.pushEle(8);
        d.display();

        d.peek();

        d.pop();
        d.display();
    }

}
