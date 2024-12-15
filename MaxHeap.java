package sid;

public class MaxHeap {
		int[] heap;
		 int size;
		 public MaxHeap(int capacity)
		 {
		 heap = new int[capacity];
		 size = 0;
		 }
		 
		 public boolean isEmpty()
		 {
		 return size==0;
		 }
		 
		 private void reheapDown(int[] heap, int index, int last)
		 {
		 int leftChild = 2 * index + 1;
		 int rightChild = 2 * index + 2;
		 int largest = index;
		 if (leftChild <= last && heap[leftChild] > heap[largest])
		 {
			 largest = leftChild;
			 }
			 
			 if(rightChild <= last && heap[rightChild] > heap[largest])
			 {
			 largest=rightChild;
			 }
			 
			 if(largest !=index)
			 {
			 int temp=heap[index];
			 heap[index]=heap[largest];
			 heap[largest]=temp;
			 reheapDown(heap, largest, last);
			 }
			 }
			 public boolean deleteRoot()
			 {
			 if (isEmpty())
			 {
			 return false;
			 }
			 int dataOut = heap[0];
			 heap[0] = heap[size - 1];
			 size--;
			 
			 reheapDown(heap, 0, size - 1);
			 System.out.println("Deleted root: " + dataOut);
			 return true;
			 }
			 public void insert(int value)
			 {
			 if (size >= heap.length)
			 {
			 System.out.println("Heap is full");
			 return;
			 }
			 heap[size] = value;
			 size++;
			 }
			 public void printHeap()
			 {
				 for (int i = 0; i < size; i++)
				 {
				 System.out.print(heap[i] + " ");
				 }
				 System.out.println();
				 }
				 public static void main(String[] args) {
					 MaxHeap heap = new MaxHeap(10);
				 
				 heap.insert(9);
				 heap.insert(6);
				 heap.insert(3);
				 heap.insert(4);
				 heap.insert(7);
				 
				 System.out.println("Heap before deletion:");
				 heap.printHeap();
				 
				 heap.deleteRoot();
				 
				 System.out.println("Heap after deletion:");
				 heap.printHeap();
				 }
				}
