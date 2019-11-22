package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class GraphBFS {
	
	public static Integer[] bfs(Graph graph, int source, int noOfVertices) {
		//bfs algo:
		//Initialize a queue
		//Mark the source node as visited and put it into the queue
		//While queue is not empty:
		//pop the first element from the queue
		//check all the adjecent vertices of the popped vertex
		//mark them as visited and add them into queue
		// 
		//Pop the first node from the queue
		//Check if the node has already been visited, if so skip it
		//If that node is the one we're searching for, then the search is over
		//Otherwise, add it to the visited nodes
		//Add this node's children to the queue and repeat these steps
		
		//List for result
		List<Integer> out = new ArrayList<Integer>();
		out.add(source);
		
		//initialize a queue
		Queue<Integer> queu = new PriorityQueue<Integer>();
		queu.add(source);
		
		//create a Set of already visited node
		boolean[] visited = new boolean[noOfVertices];
		
		//mark the start node as visited
		visited[source] = true;
		
		//loop to check if the queue is not empty
		while(!queu.isEmpty()) {
			//remove an element from the queue
			int node = queu.remove();
			out.add(node);
			//mark it as visited
			visited[node] = true;
			//check for its adjacent neighbors
			Iterator<Integer> iter = graph.adj[node].listIterator();
			while(iter.hasNext()) {
				//get the neighbor n
				int n = iter.next();
				//check if it is visited, if not then add to queue
				if(!visited[n]==true) {
					visited[n]=true;
					queu.add(n);
				}
			}
			
		}
		return out.stream().toArray(Integer[]::new);
		
	}

}
