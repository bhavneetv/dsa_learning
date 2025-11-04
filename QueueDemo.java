
public class QueueDemo {

    static class Queue {
        int size;
        int rear = -1;
        int arr[];

        public Queue(int n) {
            this.size = n;
            arr = new int[n];

        }

        void add(int n) {
            if (rear == size - 1) {
                System.out.println("Queue is full !");
                return;
            }
            arr[++rear] = n;

        }

        void del() {
            if (rear == -1) {
                System.out.println("UNder flow");
                return;

            }
            System.out.print(arr[0] + " ");
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

        }

        int peek() {

            if (rear == -1) {
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {

        Queue n = new Queue(6);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(8);

       
         while (n.peek() != -1) {
            // System.out.println(n.peek());
            n.del();
        }
        // n.del();
        // =
        // }=/

    }
}