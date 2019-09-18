import java.util.ArrayList;
import java.util.Queue;
public class GraphNode {
	int label;
	ArrayList<GraphNode> adjList;
	boolean visited;
	
	GraphNode(int l) {
		label = l;
		adjList = new ArrayList<GraphNode>();
	}
	
	public void print() {
		for(int j = 0; j < adjList.size(); ++j) {
			System.out.print(adjList.get(j).label + "->");
		}
	}
	
	public void dfs() {
		System.out.print(label + " ");
		visited = true;
		for (int j=0; j<adjList.size(); j++) {
		if ( !adjList.get(j).visited )
		adjList.get(j).dfs();
		}
	}
	
	public void bfs(Queue<GraphNode> q) {
		System.out.println(label + " ");
		visited = true;
		for(int j = 0; j < adjList.size(); ++j) {
			q.add(adjList.get(j));
		}
		GraphNode t = q.poll();
		if(t!=null && !t.visited) {
			t.bfs(q);
		}
	}
}
