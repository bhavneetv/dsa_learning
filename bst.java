public class bst {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;

        }

    }

    static Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return r oot;

        }

        if (root.data > data) {

            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);

        }

        return root;

    }

    static boolean search(Node i, int val) {
        if (i == null) {

            return false;
        }

        if (i.data > val) {
            return search(i.left, val);
        } else if (i.data < val) {
            return search(i.right, val);

        } else {
            return true;

        }

    }

    static void inorder(Node i) {
        if (i == null) {
            return;
        }
        inorder(i.left);
        System.out.print(i.data + " ");
        inorder(i.right);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7, 32, 43 };

        Node root = null;

        for (int i = 0; i < arr.length; i++) {

            root = insert(root, arr[i]);

        }

        inorder(root);

        System.out.println(search(root, 33-1));

    }

}
