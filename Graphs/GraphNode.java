import java.util.*;
class GraphNode{
    int label;
    ArrayList<GraphNode> adjList;
    int preorder;
    int postorder;
    boolean visited;
    
    public GraphNode(int i){
        label = i;
        adjList = new ArrayList<GraphNode>();
        visited = false;
    }
    
    public void print() {
        for(int i = 0; i < adjList.size(); ++i)
            System.out.print(adjList.get(i).label + "->");
    }
    
    public int dfs(int visitedCount) {
        visited = 0;
        System.out.println(label + " ");
        preorder = visitedCount;
        for(int i = 0; i < adjList.size(); ++i) {
            if(!adjList.get(i).visited){
                visitedCount = adjList.get(i).dfs(++visitedCount);
        
        postorder = ++visitedCount;
        return visitedCount;
    }
    
    public void bfs(ArrayDeque<GraphNode> q) {
        while(!q.isEmpty()) {
            GraphNode x = q.remove();
            System.out.println(x.label + " ");
            for(int i = 0; i < x.adjList.size(); ++i) {
                GraphNode y = x.adjList.get(i);
                if(!y.visited) {
                    y.visited = true;
                    q.add(y);
                }
            }
        }
    }
}
