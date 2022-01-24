import Sorting.HeapSort;
import Structure.Graph.Graph;
import Structure.Graph.Vertex;

import java.util.Arrays;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex v1 = new Vertex(1, "mh");
        Vertex v2 = new Vertex(2, "goa");
        Vertex v3 = new Vertex(3, "mp");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);

        graph.addEdgeByID(v1.getState_id(), v2.getState_id(), 100);

        graph.printGraph();
    }
}
