package sid;

public class CircularQueue {
		private int[] queue;
		 private int front, rear, size, capacity;
		 
		 public CircularQueue(int capacity) {
		 this.capacity = capacity;
		 queue = new int[capacity];
		 front = 0;
		 rear = -1;
		 size = 0;
		 }
		 
		 public boolean isFull() {
		 return size == capacity;
		 }
		 
		 public boolean isEmpty() {
		 return size == 0;
		 }
		 
		 public void enqueue(int element) {
		 if (isFull()) {
		 System.out.println("Queue is full! Cannot enqueue " + element);
		 return;
		 }
		 rear = (rear + 1) % capacity; 
		 queue[rear] = element;
		 size++;
		 System.out.println(element + " added to the queue");
		 }
		 
		 public int dequeue() {
		 if (isEmpty()) {
		 System.out.println("Queue is empty! Cannot dequeue");
		 return -1;
		 }
		 int element = queue[front];
		 front = (front + 1) % capacity; 
		 size--;
		 return element;
		 }
		 
		 public int front() {
		 if (isEmpty()) {
		 System.out.println("Queue is empty! No front element");
		 return -1;
		 }
		 return queue[front];
		 }
		 
		 public int getSize() {
		 return size;
		 }
		 public void display() {
		 if (isEmpty()) {
		 System.out.println("Queue is empty!");
		 return;
		 }
		 System.out.print("Queue elements: ");
		 for (int i = 0; i < size; i++) {
		 System.out.print(queue[(front + i) % capacity] + " ");
		 }
		 System.out.println();
		 }
		public static void main(String[] args) {
		 CircularQueue cq = new CircularQueue(5);
		 cq.enqueue(10);
		 cq.enqueue(20);
		 cq.enqueue(30);
		 cq.enqueue(40);
		 cq.enqueue(50);
		 
		 cq.enqueue(60);
		 cq.display();
		 System.out.println("Dequeued element: " + cq.dequeue());
		 System.out.println("Dequeued element: " + cq.dequeue());
		 cq.display();
		 cq.enqueue(60);
		 cq.enqueue(70);
		 cq.display();
		 System.out.println("Front element: " + cq.front());
		 System.out.println("Final size of the queue: " + cq.getSize());
		}		
	}


