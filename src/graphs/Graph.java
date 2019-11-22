package graphs;

import java.util.LinkedList;

public class Graph {
	
	int noOfVertices;
	LinkedList<Integer>[] adj;
	
	//constructor
	public Graph(int v) {
		v = noOfVertices;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	//function to add an edge to the graph
	public void addEdge(int vertex,int w) {
		System.out.println("vertex = "+vertex+" vertex2 = "+w);
		adj[vertex].add(w);
	}

}
