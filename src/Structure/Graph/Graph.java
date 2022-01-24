package Structure.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Graph {


    private Vector<Vertex> vertices;

    public Graph(){
        vertices = new Vector<>();
    }

    public void addVertex(Vertex vertex){
        boolean check = checkIfExistByID(vertex.getState_id());
        if (check == true){
            throw new RuntimeException("Vertex already exist");
        }else {
            vertices.add(vertex);
        }
    }

    public void addEdgeByID(int fromVertex, int toVertex, int weight){
        boolean check1 = checkIfExistByID(fromVertex);
        boolean check2 = checkIfExistByID(toVertex);

        if (check1 == true && check2 == true){
            boolean check3 = isEdgeExistByID(fromVertex, toVertex);
            if (check3 == true){
                throw new RuntimeException("Edge already exist");
            }else {
                for (int i = 0; i < vertices.size() ; i++) {
                    if (vertices.get(i).getState_id() == fromVertex){
                        Edge e = new Edge(toVertex, weight);
                        vertices.get(i).getEdgeList().add(e);
                    }else if (vertices.get(i).getState_id() == toVertex){
                        Edge e = new Edge(fromVertex, weight);
                        vertices.get(i).getEdgeList().add(e);
                    }
                }
            }
        }else {
            throw new RuntimeException("Invalid vertex id");
        }
    }

    public void printGraph(){
        for (int i = 0; i < vertices.size() ; i++) {
            Vertex temp = vertices.get(i);
            System.out.print(temp.getState_name() + "(" + temp.getState_id() + ")");
            temp.printEdgeList();

        }
    }


    private boolean isEdgeExistByID(int id1, int id2){
        Vertex v = vertices.get(id1);
        List<Edge> list = v.getEdgeList();
        for (Edge e : list){
            if (e.getDestinationVertexID() == id2){
              return true;
            }
        }
        return false;
    }

    private boolean checkIfExistByID(int state_id) {
        for (Vertex v: vertices){
            if (v.getState_id() == state_id){
                return true;
            }
        }
        return false;
    }


}
