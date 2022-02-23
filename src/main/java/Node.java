/**
 * @author alisatodorova
 */
public class Node {
    //Data for the node
    public int data;
    //Head (i.e. first node) of the list
    public Node head = null;
    //Next node
    public Node nextNode;

    public Node() {
    }

    //Holds data and link/reference to the next node in the list
    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    //The new node is added after the head of the given list
    public void append(int data) {
        Node newNode = new Node(data);

        //If the list is empty, make the head and tail to point to the newNode
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.nextNode = null; //newNode points to NULL tail

        //Traverse until the last node
        Node lastNode = head;
        while (lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
        }

        lastNode.nextNode = newNode;
    }

    //Prints the list
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.nextNode;
            }
            System.out.println("NULL\n");
        }
    }

    //Returns the value of the Mth (user-entered) element from the end of the list
    public void getValueOfM(int m) {
        int length = 0;
        Node temp = head;

        //Finds the length of the list
        while (temp != null) {
            temp = temp.nextNode;
            length++;
        }

            //Checks if m is legal input
            if (m > length) {
                System.out.println("M is bigger than the length of the list entered!");
                return;
            }

            temp = head;

            //Gets the node at position M
            for (int i = 1; i < length - m; i++) {
                temp = temp.nextNode;
            }
            System.out.println(temp.data);
    }
}
