package Structure.Graph;

import java.util.ArrayList;
import java.util.List;


public class Vertex {

    private int state_id;
    private String state_name;
    private List<Edge> edgeList;

    public Vertex(){
        state_id = 0;
        state_name = "";
        edgeList = new ArrayList<>();
    }

    public Vertex(int id, String name){
        this.state_id = id;
        this.state_name = name;
        edgeList = new ArrayList<>();
    }

    public int getState_id(){
        return state_id;
    }

    public void setState_id(int state_id){
        this.state_id = state_id;
    }

    public String getState_name(){
        return state_name;
    }

    public void setState_name(String state_name){
        this.state_name = state_name;
    }

    public List<Edge> getEdgeList(){
        return edgeList;
    }


    public void printEdgeList() {
        System.out.print("[");
        for (int i = 0; i < edgeList.size()  ; i++) {
            System.out.println(edgeList.get(i).getDestinationVertexID() + "(" + edgeList.get(i).getWeight() + "]");
        }
    }
}
