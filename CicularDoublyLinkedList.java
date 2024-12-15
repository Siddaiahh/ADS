package sid;

public class CicularDoublyLinkedList {

	static class Node {
		 int data;
		 Node next, prev;
		 Node(int data) {
		 this.data = data;
		 this.next = this.prev = null;
		 }
		 }
		 Node head;
		 public void append(int data) {
		 Node newNode = new Node(data);
		 if (head == null) {
		 head = newNode;
		 newNode.next = newNode.prev = head;
		 return;
		 }
		 Node last = head;
		 while (last.next != head) {
		 last = last.next;
		 }
		 last.next = newNode;
		 newNode.prev = last;
		 newNode.next = head;
		 head.prev = newNode;
		 }
		 
		 public void insertAtFront(int data) {
		 Node newNode = new Node(data);
		 if (head == null) {
		 head = newNode;
		 newNode.next = newNode.prev = head; 
		 return;
		 }
		 Node last = head.prev; 
		 newNode.next = head;
		 newNode.prev = last;
		 last.next = newNode;
		 head.prev = newNode;
		 head = newNode; 
		 }
		 
		 public void delete(int key) {
		 if (head == null) return; 
		 Node temp = head;
		 if (temp.data == key) { 
		 if (temp.next == head) { 
		 head = null;
		 } else {
		 Node last = head.prev;
		 head = temp.next;
		 last.next = head;
		 head.prev = last;
		 }
		 return;
		 }

		 while (temp != head && temp.data != key) {
		 temp = temp.next;
		 }
		 if (temp == head) return; 
		 // Node found, remove it from the list
		 temp.prev.next = temp.next;
		 temp.next.prev = temp.prev;
		 }
	
		 public void printListForward() {
		 if (head == null) {
		 System.out.println("List is empty.");
		 return;
		 }
		 Node temp = head;
		 do {
		 System.out.print(temp.data + " <-> ");
		 temp = temp.next;
		 } while (temp != head);
		 System.out.println("Back to head");
		 }
		 public void printListBackward() {
		 if (head == null) {
		 System.out.println("List is empty.");
		 return;
		 }
		 Node temp = head.prev;
		 do {
		 System.out.print(temp.data + " <-> ");
		 temp = temp.prev;
		 } while (temp != head.prev);
		 System.out.println("Back to tail");
		 }
		 public static void main(String[] args) {
			 CicularDoublyLinkedList list = new CicularDoublyLinkedList();
		 list.append(10);
		 list.append(20);
		 list.append(30);
		 list.printListForward(); 
		 list.printListBackward(); 
	
		 list.insertAtFront(5);
		 list.printListForward(); 
		 list.printListBackward(); 
		
		 list.delete(20);
		 list.printListForward(); 
		 list.printListBackward(); 
	
		 list.delete(5);
		 list.printListForward(); 
		 list.printListBackward(); 
		 }
		}
