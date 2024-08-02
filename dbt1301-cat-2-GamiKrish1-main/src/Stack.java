public class Stack {
    public class NodeStack {
        Node top;
        class Node {
            int data;
            Node next;
    
            Node(int d) {
                data = d;
                next = null;
            }
        }
    
        // Insertion (Push)
        public void push(int newData) {
            Node newNode = new Node(newData);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }
    
        // Deletion (Pop)
        public int pop() {
            if (top == null) return -1;
            int data = top.data;
            top = top.next;
            return data;
        }
    
        // Search
        public boolean search(int key) {
            Node temp = top;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next;
            }
            return false;
        }
    
        // Traversal
        public void printStack() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}