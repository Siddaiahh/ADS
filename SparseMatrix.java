package sid;

public class SparseMatrix {
	static class Node {
		 int row, col, value;
		 Node next;
		 Node(int row, int col, int value) {
		 this.row = row;
		 this.col = col;
		 this.value = value;
		 this.next = null;
		 }
		 }
		 Node head;

		 public void insert(int row, int col, int value) {
		 Node newNode = new Node(row, col, value);
		 if (head == null) {
		 head = newNode;
		 return;
		 }
		 Node temp = head;
		 while (temp.next != null) {
		 temp = temp.next;
		 }
		 temp.next = newNode;
		 }

		 public void printMatrix(int rows, int cols) {
		 Node temp = head;
		 System.out.println("Sparse Matrix:");
		 for (int i = 0; i < rows; i++) {
		 for (int j = 0; j < cols; j++) {
		 boolean printed = false;
		 Node n = temp;
		 while (n != null) {
		 if (n.row == i && n.col == j) {
		 System.out.print(n.value + " ");
		 temp = temp.next;
		 printed = true;
		 break;
		 }
		 n = n.next;
		 }
		 if (!printed) {
		 System.out.print("0 ");
		 }
		 }
		 System.out.println();
		 }
		 }
		 public static void main(String[] args) {
		 SparseMatrix matrix = new SparseMatrix();
		 matrix.insert(0, 1, 5);
		 matrix.insert(2, 3, 10);
		 matrix.insert(1, 2, 3);
		 matrix.printMatrix(3, 4);
		 }
		}