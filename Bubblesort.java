package sid;

public class Bubblesort {

	public static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
		public static void main(String[] args) {
		int arr[] = { 50, 20, 30, 11, 43 };
	
		for (int i = 0; i < arr.length - 1; i++) {
		for (int j = 0; j < arr.length - i - 1; j++) {
		if (arr[j] > arr[j + 1]) {
		// swap
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
		}
		}
		}
		printarr(arr);
		}
		}
