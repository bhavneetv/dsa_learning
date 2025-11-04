public class treess {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class bitree {
        int idx = -1;

        Node createTree(int arr[]) {
            idx++;

            if (idx >= arr.length || arr[idx] == -1) {
                return null;
            }

            Node n = new Node(arr[idx]);
            n.left = createTree(arr);
            n.right = createTree(arr);
            return n;
        }

        void preOrder(Node i){
            if(i == null){
                return;
            }
            
            preOrder(i.left);
            System.out.print(i.data + " ");
            preOrder(i.right);
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6, 7, -1, -1, -1,55, -1, -1, -1};

        bitree t = new bitree();
        Node root = t.createTree(arr);
        t.preOrder(root);

    }
}
