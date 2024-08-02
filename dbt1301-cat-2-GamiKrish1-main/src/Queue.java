public class Queue {
     Node front, rear;
    static class Node {
            int data;
            Node next;
    
            Node(int d) {
                data = d;
                next = null;
            }
 }
    
 // Insertion (Enqueue)
        public void enqueue(int newData) {
            Node newNode = new Node(newData);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
}
    
// Deletion (Dequeue)
        public int dequeue() {
            if (front == null) return -1;
            int data = front.data;
            front = front.next;
            if (front == null) rear = null;
            return data;
        }
    
 // Search
        public boolean search(int key) {
            Node temp = front;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next;
            }
            return false;
}
    
 // Traversal
        public void printQueue() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
}