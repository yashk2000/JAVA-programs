import java.util.*;
class Graph {
    GraphNode[]node ;
    int size;
    
    public Graph(int n) {
        size = n;
        node = new GraphNode[n];
        for(int i = 0; i < n; ++i){
            node[i] = new GraphNode(i);
        }
    }
    
    public void addEdge(int from, int to) {
        node[from].adjList.add(node[to]);
    }
    
    public void print() {
        for(int i = 0; i < size; ++i){
            System.out.print(i + ": ");
            node[i].print();
            System.out.println();
        }
    }
    
    public void dfs() {
        reset();
        int visitedCount = 0;
        for(int i = 0; i < size; ++i) {
            if(!node[i].visited) {
                visitedCount = node[i].dfs(++visitedCount);
            }
        System.out.println();
        }
    }
    
    public void printOrder() {
        for(int i = 0; i < size; ++i) {
            System.out.print(i + "(" + node[i].preorder + ", " + node[i].postorder + ") ");
        }
        System.out.println();
    }
    
    public void reset(){
        for(int i = 0; i < size; ++i){
            node[i].postorder = 0;
            node[i].preorder = 0;
            node[i].visited = false;
        }
    }
    
    public void bfs() {
        ArrayDeque<GraphNode> q = new ArrayDeque<GraphNode>();
        for(int i = 0; i < size; ++i){
            if(!node[i].visited) {
                q.add(node[i);
                node[i].visited = true;
                node[i].bfs(q);
            }
        }
    }
}
    
    
    
    
