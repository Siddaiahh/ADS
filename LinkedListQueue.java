package sid;
import java.util.*;
class nodes
{
	int data;
	nodes next;
}

public class LinkedListQueue {
	nodes front;
	nodes rear;
	int count;
	
	LinkedListQueue(){
		front = null;
		rear = null;
		count = 0;
	}
	
	void Enqueue(int data1)
	{
		nodes newnode = new nodes();
		newnode.data = data1;
		newnode.next = null;
		
		if(front == null)
			front = rear = newnode;
		else
			rear.next=newnode;
		rear=newnode;
		count=count+1;
	}
	
	void print(){
		nodes temp;
		temp=front;
		int i = 0;
		if(temp!=null)
		{
			while(temp!=null)
			{
				System.out.println("\n Element "+ ++i +" is "+temp.data);
				temp=temp.next;
			}
		}
		else
		{
			System.out.println("\n\t Queue is Empty");
		}
	}
	void QueueFront()
	{
		if(front!=null)
		{
			System.out.println("Data at Top Position is "+ front.data);
			
			System.out.println("Total Element in Queue is "+ count);
		}
		else
		{
			System.out.println("\n\t Queue is Empty");
		}
	}
	void Dequeue() {
		nodes temp;
		temp = front;
		if(temp!=null)
		{
			front = temp.next;
			count = count - 1;
			
			System.out.println("\n\t The data "+ temp.data + " is Deleted fromt the Queue");
		}
		else
		{
			System.out.println("\n\t You cannot perfrom Dequeue on Empty Queue");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQueue Q = new LinkedListQueue();
		Q.Enqueue(10);
		Q.Enqueue(20);
		Q.Enqueue(30);
		Q.Enqueue(40);
		Q.Enqueue(50);
		Q.print();
		Q.Dequeue();
		Q.print();
		Q.QueueFront();

	}

}
