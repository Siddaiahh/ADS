package sid;

public class AdjancencyMatrix {
	private boolean[][]adjacencyMatrix;
	private int numVertices;
	public AdjancencyMatrix(int numVertices)
	{
	this.numVertices=numVertices;
	adjacencyMatrix=new boolean[numVertices][numVertices];
	}
	public void addEgde(int i, int j)
	{
	adjacencyMatrix[i][j]=true;
	adjacencyMatrix[j][i]=true;
	}
	public void removeEgde(int i, int j)
	{
	adjacencyMatrix[i][j]=false;
	adjacencyMatrix[j][i]=false;
	}
	public void printGraph()
	{
	for(int i=0; i<numVertices; i++)
	{
	for(int j=0; j<numVertices; j++)
	{
	System.out.print(adjacencyMatrix[i][j] ? "1" : "0");
	}
	System.out.println();
	}
	}
	public static void main(String[] args) {
		AdjancencyMatrix graph=new AdjancencyMatrix(4);
	graph.addEgde(0,1);
	graph.addEgde(1,2);
	graph.addEgde(2,0);
	graph.addEgde(1,3);
	System.out.println("Graph Representation(Adjacency Matrix):");
	graph.printGraph();
	System.out.println("after removing vertices 1 and 2:");
	graph.printGraph();
	}
	}