
    import java.util.LinkedList;

    public  class Graph_Nodes {

        public int num_nodes;
        public LinkedList<Integer> neighbourList [];


        public void nodes(int nodesCount){
            num_nodes = nodesCount;
            neighbourList = new LinkedList[num_nodes ];
            for (int i = 0; i <num_nodes  ; i++) {
                neighbourList[i] = new LinkedList<>();
            }

        }

        public void connectedEdges(int parent, int child){

            neighbourList[parent].add(child);

            neighbourList[child].add(parent);
        }
    }


