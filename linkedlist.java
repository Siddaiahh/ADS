package sid;

import java.util.Scanner;

 class linkedlist {
	 class Node{
		int data;
		Node next;
		Node()
		{
			this.next = null;
		}
	}
	Node head = null;

	void addNode(int data1) {
		Node newNode = new Node();
		newNode.data=data1;
		newNode.next=null;
		Node temp;
		
		if(head == null || head.data>=newNode.data) {
			newNode.next=head;
			head=newNode;
		}
		else
		{
			temp=head;
			while(temp.next!=null && temp.next.data < newNode.data)
			{
			temp = temp.next;	
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	
	void Delete(int num)
	{
		Node tmp,pre=null;
		tmp=head;
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		while(tmp!=null) {
			if(tmp.data==num)
			{
				if(tmp==head)
				{
					head = tmp.next;
					return;
				}
				else
				{
					pre.next=tmp.next;
					return;
				}
			}
			else {
				pre=tmp;
				tmp=tmp.next;
			}
		}
	}
	
	void Search(int num)
	{
		boolean found = false;
		int position = 1;
		for(Node tmp=head; tmp!=null; tmp=tmp.next)
		{
			if(tmp.data == num) {
				System.out.println("Number found at " + position);
				found = true;
				break;
			}
			position ++;
		}
		if(!found) {
			System.out.println("No. not found");
		}
		
	}
	int Count()
	{
		Node tmp;
		int c = 0;
		for (tmp = head;tmp!=null;tmp=tmp.next)
			c++;
		return(c);
	}
	
	void reverse() 
	{
	Node ptr1,ptr2,ptr3;
	if(head == null) 
	{
	System.out.println("List is Empty");
	return;
	}
	ptr1 = head;
	ptr2 = ptr1.next;
	ptr3 = ptr2.next;
	ptr1.next = null;
	ptr2.next = ptr1;
	
	while(ptr3 !=null)
	{
		ptr1 = ptr2;
		ptr2 = ptr3;
		ptr3 = ptr3.next;
		ptr2.next = ptr1;
	}
	head = ptr2;
	
	}
	
	void display() {
		Node tmp = head;
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Node of Singly linked list: ");
		while(tmp != null) {
			System.out.print(tmp.data + " ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		linkedlist l = new linkedlist();
		Scanner sc = new Scanner(System.in);
		l.addNode(20);
		l.addNode(10);
		l.addNode(30);
		l.addNode(40);
		l.addNode(50);
		l.addNode(60);
		l.Search(20);
		l.Search(40);
		l.display();
		l.Delete(10);
		l.Delete(30);
		l.Delete(60);
		System.out.print("After Deletion ");
		l.display();
		l.reverse();
		System.out.print("After reverse ");
		l.display();
		
	}

}
