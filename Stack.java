package sid;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

      public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
      public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

        public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
    public void display() {
    	 for(int i=0;i<=top;i++) {
         	System.out.println(arr[i]);
         }
    	 System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
       
        System.out.println("Popped element: " + s.pop());
        System.out.println("Current stack size: " + s.size());
        s.display();

       
        
    }
}
