package sid;
public class Queue {
    private int[] queue;
    private int capacity;
    private int front, rear, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
        front = size = 0;
    }


    public void Enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println(element + " added to the queue");
    }

 
    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
    	return size==capacity;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.printQueue();
        System.out.println("Dequeued element: " + q.Dequeue());
        q.printQueue();
        q.Enqueue(5);
        q.printQueue();
        q.Enqueue(6); 
        q.printQueue();
    }
}
