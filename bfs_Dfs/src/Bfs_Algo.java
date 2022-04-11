import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs_Algo {

    public static Graphs bfs(Graphs start){

        //create a linkedlist to store the visited nodes
        LinkedList<Integer> visit = new LinkedList<>();
        //create a queue
        Queue<Graphs> queue = new LinkedList<>();
        queue.add(start);

        //check the every value in queue until queue is empty
        while(!queue.isEmpty()){
            int i;
            //remove the first elemt of the queue
            Graphs current = queue.remove();
            for( i =0;i <current.getChildren().size();i++){
                //take the neighbours of the current node
                int neighbours = current.getChildren().get(i).getValue();

                if(!visit.contains(neighbours)){
                    //if neighbours of the current node are not visited yet,it is added to the queue
                    queue.add(current.getChildren().get(i));
                }
            }
            //currnt node is added to the list which is save the visited nodes
            visit.add(current.getValue());

        }
        Iterator itr = visit.iterator();
        while(itr.hasNext()){
            //print the elements in the visit list(BFS order)
            System.out.print(itr.next()+ " ");
        }
        return null;


    }






    public static void main(String[]args){
        Graphs root = new Graphs(25);
        Graphs child1 = root.addingNodes(10);
        Graphs child2= root.addingNodes(8);
        Graphs child5 = child2.addingNodes(4);
        Graphs child6 = child5.addingNodes(9);
        Graphs child3 = child1.addingNodes(3);
        Graphs child4 = child3.addingNodes(20);
        Graphs child7 = child5.addingNodes(6);


        //calling the bfs method
        Graphs foundnode =bfs(root);

    }
}
