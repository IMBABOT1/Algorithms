import Sorting.HeapSort;
import Structure.Graph.Graph;
import Structure.Graph.Vertex;

import java.util.Arrays;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex v1 = new Vertex(1, "mh");
        Vertex v2 = new Vertex(2, "ga");
        Vertex v3 = new Vertex(3, "mp");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);



        graph.printGraph();


    }
}
