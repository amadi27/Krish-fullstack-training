package Code_Assigmnets;

/**
 *
 * @author Amadi Senarath
 */
public class LinkedList {
        
    static Node listHead;
    static Node midPoint;
    static Node reversedHead;

    // Single node in linked list
    static class Node {

        int data;
	    Node nextNode;

        // Constructor of a node in linked list
        Node(int d) {
            data = d;
            nextNode = null;
        }

        // Print node
        void print() {
            if (this == null) {
                System.out.println("NULL");
            } else {
                System.out.print(this.data + "  ");
            }
        }

    }

    // Print linked list
    void print(Node node) {
        if (node == null) {
            System.out.println("NULL");
        } else {
            System.out.print(node.data + "  ");
            if (node.nextNode != null) {
                print(node.nextNode);
            } else {
                System.out.println();
            }
        }
    }
    
    // Add new data to linked list
    void addData(int data) {
        if (this.listHead == null) {
            this.listHead = new Node(data);
            return;
        }
        Node tempNode = this.listHead;
        while (tempNode.nextNode != null) {
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = new Node(data);
    }
    
    // Reverse the linked list
    Node reverseList(){
        // this.listHead == null condition is required to avoid runtime error if the linked list is empty
        if (this.listHead == null || this.listHead.nextNode == null) {
            return this.listHead;
        }
        Node head = reverseList(this.listHead, this.listHead.nextNode);
        this.listHead.nextNode = null;
        return head;
    }
    static Node reverseList(Node node){
        // this.listHead == null condition is required to avoid runtime error if the linked list is empty
        if (node == null || node.nextNode == null) {
            return node;
        }
        Node head = reverseList(node, node.nextNode);
        node.nextNode = null;
        return head;
    }
    static Node reverseList(Node nodePrevious, Node node){
        if (node.nextNode == null) {
            node.nextNode = nodePrevious;
            return node;
        }
        Node head = reverseList(node, node.nextNode);
        node.nextNode = nodePrevious;
        return head;
    }
    
    // Find the mid point of the linked list and break it from there
    Node breakFromMidPoint(){
        // this.listHead == null condition is required to avoid runtime error if the linked list is empty
        if (this.listHead == null || this.listHead.nextNode == null) {
            return this.listHead;
        }
        Node slow = this.listHead;
        Node fast = this.listHead;
        while (fast.nextNode != null && fast.nextNode.nextNode != null && fast.nextNode.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        Node middleNode = slow.nextNode;
        slow.nextNode = null;
        return middleNode;
    }
    
    // Compare current linked list starting with linkHead with the linked list starting with reversedHead
    boolean compare(){
        // this.listHead == null condition is required to avoid runtime error if the linked list is empty
        if (this.listHead == null || this.reversedHead == null) {
            if (this.listHead != null) {
                // System.out.println(this.listHead.data + " | ");
                return (this.listHead.nextNode == null);
            }
            if (this.reversedHead != null) {
                // System.out.println(" | " + this.reversedHead.data);
                return (this.reversedHead.nextNode == null);
            }
            return true;
        }
        Node forward = this.listHead;
        Node reversed = this.reversedHead;
        while (forward.nextNode != null && reversed.nextNode != null) {
            if (forward.data != reversed.data) {
                return false;
            }
            // System.out.println(forward.data + " | " + reversed.data);
            forward = forward.nextNode;
            reversed = reversed.nextNode;
        }
        // System.out.println(forward.data + " | " + reversed.data);
        return (forward.data == reversed.data);
    }
        
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addData(1);
        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.addData(6);
        myList.addData(7);
        myList.addData(8);
        myList.addData(9);

        System.out.println("Original list:");
        myList.print(myList.listHead);
       
        System.out.println("\nReversed list:");
        myList.listHead = myList.reverseList();
        myList.print(myList.listHead);

    }
}
