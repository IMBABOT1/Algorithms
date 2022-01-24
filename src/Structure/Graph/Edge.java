package Structure.Graph;

public class Edge {

    private int destinationVertexID;
    private int weight;

    public Edge(int destVID, int w){
        destinationVertexID = destVID;
        weight = w;
    }

    public int getDestinationVertexID(){
        return destinationVertexID;
    }
    public void setDestinationVertexID(int destinationVertexID) {
        this.destinationVertexID = destinationVertexID;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Dest: " + destinationVertexID + " " + weight);
    }
}
