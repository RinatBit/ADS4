import java.util.*;

public class WeightedGraph {
    private final boolean undirected;
    private final Map<Vertex, List<Edge>> map = new HashMap<>();

    public WeightedGraph() {
        this(true);
    }

    public WeightedGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(Vertex v) {
        map.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(Vertex source, Vertex dest, double weight) {
        addVertex(source);
        addVertex(dest);

        map.get(source).add(new Edge(source, dest, weight));
        if (undirected) {
            map.get(dest).add(new Edge(dest, source, weight));
        }
    }

    public List<Vertex> adjacencyList(Vertex v) {
        List<Vertex> neighbors = new ArrayList<>();
        for (Edge e : map.getOrDefault(v, new ArrayList<>())) {
            neighbors.add(e.getDest());
        }
        return neighbors;
    }

    public List<Edge> getEdges(Vertex v) {
        return map.getOrDefault(v, new ArrayList<>());
    }
}
