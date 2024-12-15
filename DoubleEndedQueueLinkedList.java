package sid;
import java.util.NoSuchElementException;

public class DoubleEndedQueueLinkedList {
	private Node front, rear;
	 class Node {
	 int data;
	 Node next, prev;
	 Node(int data) {
	 this.data = data;
	 this.next = this.prev = null;
	 }
	 }
	 public DoubleEndedQueueLinkedList() {
	 front = rear = null;
	 }
	 public void addFirst(int data) {
	 Node newNode = new Node(data);
	 if (front == null) {
	 front = rear = newNode; 
	 } else {
	 newNode.next = front; 
	 front.prev = newNode; 
	 front = newNode; 
	 }
	 }
	 public void addLast(int data) {
	 Node newNode = new Node(data);
	 if (rear == null) {
	 front = rear = newNode; 
	 } else {
	 newNode.prev = rear; 
	 rear.next = newNode; 
	 rear = newNode; 
	 }
	 }
	 public int removeFirst() {
	 if (front == null) throw new NoSuchElementException("Deque is empty");
	 int data = front.data;
	 front = front.next; 
	 if (front != null) {
	 front.prev = null; 
	 } else {
	 rear = null; 
	 }
	 return data;
	 }
	 public int removeLast() {
	 if (rear == null) throw new NoSuchElementException("Deque is empty");
	 int data = rear.data;
	 rear = rear.prev; 
	 if (rear != null) {
	 rear.next = null; 
	 } else {
	 front = null; 
	 }
	 return data;
	 }
	 public int peekFirst() {
	 if (front == null) throw new NoSuchElementException("Deque is empty");
	 return front.data;
	 }
	 public int peekLast() {
	 if (rear == null) throw new NoSuchElementException("Deque is empty");
	 return rear.data;
	 }
	 public boolean isEmpty() {
	 return front == null;
	 }
	 public void printDeque() {
	 if (front == null) {
	 System.out.println("Deque is empty");
	 return;
	 }
	 Node current = front;
	 while (current != null) {
	 System.out.print(current.data + " ");
	 current = current.next;
	 }
	 System.out.println();
	 }
	 public static void main(String[] args) {
		 DoubleEndedQueueLinkedList deque = new DoubleEndedQueueLinkedList();
	 deque.addFirst(10); 
	 deque.addLast(20); 
	 deque.addFirst(5); 
	 deque.addLast(25); 
	 
	 System.out.println("Deque after adding elements:");
	 deque.printDeque(); 
	 System.out.println("First element: " + deque.peekFirst()); 
	 System.out.println("Last element: " + deque.peekLast()); 
	 System.out.println("Removed from front: " + deque.removeFirst()); 
	 System.out.println("Removed from rear: " + deque.removeLast()); 
	 System.out.println("Deque after removing elements:");
	 deque.printDeque(); 
	 System.out.println("Is the deque empty? " + deque.isEmpty()); 
	 deque.removeFirst(); 
	 deque.removeFirst(); 
	 System.out.println("Is the deque empty now? " + deque.isEmpty()); 
	 }
	}

