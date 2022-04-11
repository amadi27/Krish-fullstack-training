import java.util.ArrayList;
import java.util.List;

public class Graphs {
    private int value;
    private List<Graphs> connect_nodes = new ArrayList<>();

    public Graphs(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public List<Graphs> getChildren() {
        return connect_nodes;
    }

    //add the new nodes
    public Graphs addingNodes(int value){
        Graphs newchild = new Graphs(value);
        connect_nodes.add(newchild);
        return newchild;
    }
}
