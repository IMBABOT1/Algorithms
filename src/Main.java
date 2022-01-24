import Sorting.HeapSort;
import Structure.Graph.Graph;
import Structure.Graph.Vertex;

import java.util.Arrays;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(new Vertex(1, "name"));

        System.out.println(graph);
    }
}
