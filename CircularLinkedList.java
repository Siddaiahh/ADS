package sid;

public class CircularLinkedList {
	static class Node {
		 int data;
		 Node next;
		 Node(int data) {
		 this.data = data;
		 this.next = null;
		 }
		 }
		 Node head;
		 public void append(int data) {
		 Node newNode = new Node(data);
		 if (head == null) {
		 head = newNode;
		 newNode.next = head; 
		 return;
		 }
		 Node last = head;
		 while (last.next != head) {
		 last = last.next;
		 }
		 last.next = newNode;
		 newNode.next = head; 
		 }
		 public void delete(int key) {
		 if (head == null) return;
		 Node temp = head;
		 if (temp.data == key) {
		 if (temp.next == head) {
		 head = null;
		 return;
		 }
		 while (temp.next != head) {
		 temp = temp.next;
		 }
		 temp.next = head.next;
		 head = head.next;
		 return;
		 }
		 Node prev = null;
		 while (temp != null && temp.data != key) {
		 prev = temp;
		 temp = temp.next;
		 if (temp == head) return;
		 }
		 if (temp == null) return;
		 prev.next = temp.next;
		 }
	
		 public void printList() {
		 if (head == null) return;
		 Node temp = head;
		 do {
		 System.out.print(temp.data + " -> ");
		 temp = temp.next;
		 } while (temp != head);
		 System.out.println("Back to head");
		 }
		 public static void main(String[] args) {
		 CircularLinkedList list = new CircularLinkedList();
		 list.append(10);
		 list.append(20);
		 list.append(30);
		 list.printList(); 
		 list.delete(20);
		 list.printList(); 
		 }
		}


