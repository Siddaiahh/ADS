package sid;

import java.util.Scanner;
import java.util.Stack;

public class DFS {
    int numVertices;
    int[][] adj;
    int[] state;
    Stack<Integer> stack;
    int initial = 1;
    int waiting = 2;
    int visited = 3;
    Scanner sc = new Scanner(System.in);

    public DFS(int numVertices) {
        this.numVertices = numVertices;
        adj = new int[numVertices][numVertices];
        state = new int[numVertices];
        stack = new Stack<>();
    }

    void DF_Traversal() {
        for (int v = 0; v < numVertices; v++) {
            state[v] = initial;
        }
        System.out.println("Enter start vertex for DFS (1 to " + numVertices + "): ");
        int v = sc.nextInt() - 1;
        if (v < 0 || v >= numVertices) {
            System.out.println("Invalid start vertex");
            return;
        }
        System.out.println("DFS Traversal starting from vertex " + (v + 1) + ":");
        DF(v);
    }

    public void DF(int v) {
        stack.push(v);
        while (!stack.isEmpty()) {
            v = stack.pop();
            if (state[v] == initial) {
                System.out.print((v + 1) + " ");
                state[v] = visited;
            }
            for (int i = numVertices - 1; i >= 0; i--) {
                if (adj[v][i] == 1 && state[i] == initial) {
                    stack.push(i);
                }
            }
        }
        System.out.println("\n");
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
        DFS d = new DFS(5);
        d.create_graph(0, 1);
        d.create_graph(1, 2);
        d.create_graph(2, 3);
        d.create_graph(3, 1);
        d.create_graph(3, 4);
        System.out.println("Graph adjacency matrix:");
        d.printGraph();
        d.DF_Traversal();
    }
}
