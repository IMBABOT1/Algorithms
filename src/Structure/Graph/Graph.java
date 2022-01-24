package Structure.Graph;

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

    private boolean checkIfExistByID(int state_id) {
        for (Vertex v: vertices){
            if (v.getState_id() == state_id){
                return true;
            }
        }
        return false;
    }
}
