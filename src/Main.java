import Structure.Queue.LinkedQueue.LinkedQueue;
import Structure.Trees.BinarySearchTree;


public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertNode(30);
        bst.insertNode(18);
        bst.insertNode(45);
        bst.insertNode(10);
        bst.insertNode(25);


          bst.printBFC();
    }
}
