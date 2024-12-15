package sid;

public class MinHeap {
    int[] heap;
    int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Method to maintain heap property after insertion
    private void reheapUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && heap[index] < heap[parent]) {
            // Swap the elements
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    // Method to maintain heap property after deletion
    private void reheapDown(int[] heap, int index, int last) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        if (leftChild <= last && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }

        if (rightChild <= last && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        if (smallest != index) {
            // Swap the elements
            int temp = heap[index];
            heap[index] = heap[smallest];
            heap[smallest] = temp;
            reheapDown(heap, smallest, last);
        }
    }

    // Method to delete the root element
    public boolean deleteRoot() {
        if (isEmpty()) {
            return false;
        }
        int dataOut = heap[0];
        heap[0] = heap[size - 1];
        size--;

        reheapDown(heap, 0, size - 1);
        System.out.println("Deleted root: " + dataOut);
        return true;
    }

    // Method to insert a new element
    public void insert(int value) {
        if (size >= heap.length) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = value;
        size++;
        reheapUp(size - 1);
    }

    // Method to print the heap elements
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        heap.insert(9);
        heap.insert(6);
        heap.insert(3);
        heap.insert(4);
        heap.insert(7);
        heap.insert(8);

        System.out.println("Heap before deletion:");
        heap.printHeap();

        heap.deleteRoot();

        System.out.println("Heap after deletion:");
        heap.printHeap();
    }
}
