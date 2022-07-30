package nonlineardatastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void addLeft(Node node) {
        this.left = node;
    }

    public void addRight( Node node) {
        this.right = node;
    }

    public void removeLeft() {
        if (this.left == null) {
            System.out.println("left is already null!");
        } else {
            this.left = null;
        }
    }

    public void removeRight() {
        if (this.right == null) {
            System.out.println("Right is already null!");
        } else {
            this.right = null;
        }
    }
}

class Tree {
    Node root; // 루트 설정

    Tree() {};
    Tree(Node node) {
        this.root = node;
    }

    public Node settingNode(int data, Node left, Node right) {
        Node node = new Node(data, left, right);

        if (this.root == null) {
            this.root = node;
        }

        return node;
    }



    public Node searchNode(int data) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur.data == data) {
                return cur;
            }

            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        return null;
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.print(cur.data + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(new Node(1, null, null));

    }
}
