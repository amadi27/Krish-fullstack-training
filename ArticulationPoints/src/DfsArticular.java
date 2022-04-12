import java.util.*;
public class DfsArticular {

        int timeduration=0;
        int countChildNodes = 0;

        LinkedList<Integer> articulationPointsList = new LinkedList<>();
        HashMap<Integer, Integer> reachedTime = new HashMap<>();
        HashMap<Integer, Integer> timeLow = new HashMap<>();
        HashMap<Integer, Integer> currentparent = new HashMap<>();



        public void DFS( HashMap<Integer, Integer>reachedTime, HashMap<Integer, Integer> timeLow, HashMap<Integer, Integer> parent,boolean[] visited,Graph_Nodes graph, int currentNode){

            LinkedList<Integer> adjList [] = graph.neighbourList;

            boolean ArticulationPoint = false;
            visited[currentNode] = true;
            reachedTime.put(currentNode, timeduration);
            timeLow.put(currentNode, timeduration);
            timeduration++;

            for(int naighbour: adjList[currentNode]){

                int childVertex = naighbour;

                if(visited[childVertex]){


                    int currLowTime = timeLow.get(currentNode);
                    int childReachedTime = reachedTime.get(childVertex);
                    timeLow.put(currentNode, Math.min(currLowTime, childReachedTime));


                }else{

                    countChildNodes++;

                    parent.put(childVertex, currentNode);


                    DFS(reachedTime, timeLow,parent,visited,graph,childVertex);


                    int parentDis = reachedTime.get(currentNode);
                    int childLaw = timeLow.get(childVertex);

                    if(childLaw >= parentDis){
                        ArticulationPoint = true;

                    } else{

                        int parentLowTime = timeLow.get(currentNode);
                        int childLowTime = timeLow.get(childVertex);
                        int minimumLowTime = Math.min(parentLowTime,childLowTime);
                        timeLow.put(currentNode,minimumLowTime);
                    }


                }
            }

            if((parent.get(currentNode)==null && countChildNodes>1)||(parent.get(currentNode)!=null && ArticulationPoint)){

                articulationPointsList.add(currentNode);
            }
        }
        public void ArticulationPointsAlgo(Graph_Nodes nodes){

            int vertices = nodes.num_nodes;
            boolean[] visited = new boolean[vertices];

            for (int i = 0; i <vertices ; i++) {
                if(!visited[i])
                    DFS( reachedTime, timeLow, currentparent, visited,nodes, i);
            }



            for(int articulationPoints :articulationPointsList){
                System.out.print(articulationPoints + " ");

            }



        }


        public static void main(String[] args) {
            Graph_Nodes graph = new Graph_Nodes();

            graph.nodes(5);

            graph.connectedEdges(0, 3);
            graph.connectedEdges(0, 4);
            graph.connectedEdges(3, 1);
            graph.connectedEdges(2, 3);
            graph.connectedEdges(1, 3);
            graph.connectedEdges(4, 3);
            graph.connectedEdges(3, 2);

            DfsArticular dfsArticular = new DfsArticular();
            dfsArticular.ArticulationPointsAlgo(graph);
        }
    }




