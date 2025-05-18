import java.util.*;

public class UnweightedGraph {
    private final boolean undirected;
    private final Map<Vertex, List<Vertex>> map = new HashMap<>();

    public UnweightedGraph() {
        this(true);
    }

    public UnweightedGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(Vertex v) {
        map.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex dest) {
        addVertex(source);
        addVertex(dest);

        map.get(source).add(dest);
        if (undirected) {
            map.get(dest).add(source);
        }
    }

    public List<Vertex> adjacencyList(Vertex v) {
        return map.getOrDefault(v, new ArrayList<>());
    }
}
