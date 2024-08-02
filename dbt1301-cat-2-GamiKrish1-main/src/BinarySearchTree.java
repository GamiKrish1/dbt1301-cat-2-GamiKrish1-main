public class BinarySearchTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
}

//Insertion
    public void insert(int newData) {
        root = insertRec(root, newData);
    }

    Node insertRec(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        if (newData < root.data) {
            root.left = insertRec(root.left, newData);
        } else if (newData > root.data) {
            root.right = insertRec(root.right, newData);
        }
        return root;
}

 // Deletion
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;
        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteRec(root.right, temp.data);
        }
        return root;
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

 // Search
    public boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (key < root.data) {
            return searchRec(root.left, key);
        } else if (key > root.data) {
            return searchRec(root.right, key);
        } else {
            return true;
        }
 }

// Traversal
    public void printTree() {
        printTreeRec(root);
    }

    void printTreeRec(Node root) {
        if (root != null) {
            printTreeRec(root.left);
            System.out.print(root.data + " ");
            printTreeRec(root.right);
        }
    }
}