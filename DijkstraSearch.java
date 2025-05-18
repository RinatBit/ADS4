import java.util.*;

public class DijkstraSearch extends Search {
    private final Map<Vertex, Double> distTo = new HashMap<>();
    private final WeightedGraph graph;

    public DijkstraSearch(WeightedGraph graph, Vertex source) {
        super(source);
        this.graph = graph;
        dijkstra();
    }

    private void dijkstra() {
        PriorityQueue<Vertex> pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
        distTo.put(source, 0.0);
        pq.add(source);

        while (!pq.isEmpty()) {
            Vertex v = pq.poll();
            marked.add(v);

            for (Edge e : graph.getEdges(v)) {
                Vertex w = e.getDest();
                double weight = e.getWeight();
                double distThroughV = distTo.get(v) + weight;
                if (distTo.getOrDefault(w, Double.POSITIVE_INFINITY) > distThroughV) {
                    distTo.put(w, distThroughV);
                    edgeTo.put(w, v);
                    pq.add(w);
                }
            }
        }
    }
}
