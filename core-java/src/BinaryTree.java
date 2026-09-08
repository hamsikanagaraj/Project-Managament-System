public class BinaryTree {
    private class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void add(int data) {
        Node node = new Node(data);

        if (root == null) {
            root = node;
        } else {
            Node curr = root;

            while (true) {
                if (data > curr.data) {
                    if (curr.right == null) {
                        curr.right = node;
                        break;
                    }
                    curr = curr.right;
                } else if (data < curr.data) {
                    if (curr.left == null) {
                        curr.left = node;
                        break;
                    }
                    curr = curr.left;
                }
            }
        }
    }

    public void print() {
    }

    public void printInOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void printPreOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void printPostOrder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(20);
        tree.add(27);
        tree.add(12);
        tree.add(24);
        tree.add(16);
        tree.add(22);

        tree.printInOrder();
        System.out.println("--------");

        tree.printPreOrder();
        System.out.println("--------");

        tree.printPostOrder();
        System.out.println("--------");
    }
}
