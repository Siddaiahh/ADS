package sid;

public class Heap {

	public static void reheapUp(int[] heap, int walker) {
		 int parent = (walker - 1) / 2;
		 while (walker > 0 && heap[walker] > heap[parent]) {
		 int temp = heap[walker];
		 heap[walker] = heap[parent];
		 heap[parent] = temp;
		 walker = parent;
		 parent = (walker - 1) / 2;
		 }
		 }
		 public static void buildHeap(int[] heap) {
		 int size = heap.length;
		 int walker = 1;
		 while (walker < size) {
		 reheapUp(heap, walker);
		 walker++;
		 }
		 }
		 public static void printHeap(int[] heap) {
		 for (int i : heap) {
		 System.out.print(i + " ");
		 }
		 System.out.println();
		 }
		 public static void main(String[] args) {
		 int[] heap = {0, 1, 2, 3, 4, 5, 6};
		 System.out.println("Original heap:");
		 printHeap(heap);
		 buildHeap(heap);
		 System.out.println("Heap after reheapup:");
		 printHeap(heap);
		 }
		}