package sid;
import java.util.*;
import java.util.Scanner;
//Implementation of linked list using Stack 
class Node
{
	int data;
	Node link;
}
class LinkedListStack {
	Node top;
	int count;
	
	LinkedListStack()
	{
		top = null;
		count = 0;
	}
	
	public void push()
	{
		int data1;
		System.out.println("Enter Value: ");
		Scanner sc = new Scanner(System.in);
		data1 = sc.nextInt();
		Node newnode=new Node();
		newnode.data=data1;
		newnode.link=top;
		top=newnode;
		count=count+1;
	}
	
	void print() {
		Node temp;
		temp=top;
		int i = 0;
		if(temp!=null)
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
		else
		{
			System.out.println("\n\t Stack is Empty");
		}
	}
	
	void stacktop()
	{
		if(top!=null)
		{
			System.out.println("Data ata Tope Position is "+ top.data);
			
			System.out.println("Total Element in stack is"+ count);
		}
		else
		{
			System.out.println("\n\t Stack is Empty");
		}
	}
	void pop()
	{
		Node temp;
		temp=top;
		if(temp!=null)
		{
			top=temp.link;
			count=count-1;
			System.out.println("\n\t the data " + temp.data + " is deleted from Stack");
		}
		else {
			System.out.println("\n\t You can not perform pop Operation when stack is Empty");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack S = new LinkedListStack();
		for(int i = 0; i<5;i++) {
			S.push();
		}
		S.print();
		S.pop();
		S.print();
	}

}
