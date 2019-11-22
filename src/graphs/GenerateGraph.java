package graphs;

import java.util.Arrays;

public class GenerateGraph {
	
	public static void main(String[] args) {
		//you have to generate this 
		// ((0))----------((1))
		//     \__           |
		//        \_______   |
		//                \  | 
		// ((3))-----------((2))
		generateGraph();
	}

	private static void generateGraph() {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(0, 2);
		System.out.println(Arrays.stream(GraphBFS.bfs(graph, 0, 4)));
	}

}
