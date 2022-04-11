import java.util.LinkedList;
import java.util.Stack;

public class Dfs_Algo {
    public static Graphs dfs(Graphs startNode) {


        //create a linkedlist to store the visited nodes
        LinkedList<Integer> visited = new LinkedList<>();
        //crete a stack
        Stack<Graphs> nodeStack = new Stack<>();
        //add the start node in to the stack
        nodeStack.push(startNode);
        //add the start node in to the visited list
        visited.add(startNode.getValue());


        while ( nodeStack.size() != 0) {
            //remove the top element from the stack
            Graphs currentNode = nodeStack.pop();
            System.out.print(currentNode.getValue() + " ");

            for (int i = 0; i < currentNode.getChildren().size(); i++) {
                //take the conncted nodes of the current node
                int connct = currentNode.getChildren().get(i).getValue();
                if (!visited.contains(connct)) {
                    //if neighbours of the current node are not visited yet,it is added to the queue
                    nodeStack.push(currentNode.getChildren().get(i));

                }
                //currnt node is added to the list which is save the visited nodes
                visited.add(currentNode.getValue());

            }

        }


        return null;
    }
    public static void main(String[]args){
        Graphs child1 = new Graphs(100);
        child1.addingNodes(70);
        Graphs child3= child1.addingNodes(2);
        Graphs child4 = child3.addingNodes(20);
        Graphs child5 = child4.addingNodes(8);

        //call the method
        Graphs foundnode =dfs(child1);

    }
}
