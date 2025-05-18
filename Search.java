import java.util.*;

public class Search {
    protected final Set<Vertex> marked = new HashSet<>();
    protected final Map<Vertex, Vertex> edgeTo = new HashMap<>();
    protected final Vertex source;

    public Search(Vertex source) {
        this.source = source;
    }

    public boolean hasPathTo(Vertex v) {
        return marked.contains(v);
    }

    public List<Vertex> pathTo(Vertex v) {
        if (!hasPathTo(v)) return null;

        LinkedList<Vertex> path = new LinkedList<>();
        for (Vertex x = v; !x.equals(source); x = edgeTo.get(x)) {
            path.push(x);
        }
        path.push(source);
        return path;
    }
}
