package sid;

import java.util.Scanner;

public class BFS {
    int numVertices;
    int[][] adj;
    int[] state;
    int[] queue;
    int initial = 1;
    int waiting = 2;
    int visited = 3;
    Scanner sc = new Scanner(System.in);
    int front = -1, rear = -1;

    public BFS(int numVertices) {
        this.numVertices = numVertices;
        adj = new int[numVertices][numVertices];
        state = new int[numVertices];
        queue = new int[numVertices];
    }

    void BF_Traversal() {
        for (int v = 0; v < numVertices; v++) {
            state[v] = initial;
        }
        System.out.println("Enter start vertex for BFS: ");
        int v = sc.nextInt() - 1;
        BF(v);
    }

    public void BF(int v) {
        insert_queue(v);
        state[v] = waiting;
        while (!isEmpty_queue()) {
            v = delete_queue();
            System.out.println((v + 1) + " ");
            state[v] = visited;
            for (int i = 0; i < numVertices; i++) {
                if (adj[v][i] == 1 && state[i] == initial) {
                    insert_queue(i);
                    state[i] = waiting;
                }
            }
        }
        System.out.println("\n");
    }

    public void insert_queue(int vertex) {
        if (rear == numVertices - 1)
            System.out.println("Queue overflow \n");
        else {
            if (front == -1)
                front = 0;
            rear = rear + 1;
            queue[rear] = vertex;
        }
    }

    public boolean isEmpty_queue() {
        return front == -1 || front > rear;
    }

    public int delete_queue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow\n");
            return -1;
        }
        int delete_item = queue[front];
        front = front + 1;
        return delete_item;
    }

    public void create_graph(int i, int j) {
        adj[i][j] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS b = new BFS(5);
        b.create_graph(0, 1);
        b.create_graph(1, 2);
        b.create_graph(2, 3);
        b.create_graph(3, 1);
        b.create_graph(3, 4);
        System.out.println("Graph adjacency matrix:");
        b.printGraph();
        b.BF_Traversal();
    }
}
