import java.util.*;

public class BreadthFirstSearch extends Search {
    public BreadthFirstSearch(UnweightedGraph graph, Vertex source) {
        super(source);
        bfs(graph, source);
    }

    private void bfs(UnweightedGraph graph, Vertex start) {
        Queue<Vertex> queue = new LinkedList<>();
        marked.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            for (Vertex w : graph.adjacencyList(v)) {
                if (!marked.contains(w)) {
                    marked.add(w);
                    edgeTo.put(w, v);
                    queue.add(w);
                }
            }
        }
    }
}
