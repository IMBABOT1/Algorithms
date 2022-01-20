import Structure.Queue.LinkedQueue.LinkedQueue;
import Structure.Trees.BinarySearchTree;


public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertNode(1);
        bst.insertNode(2);
        bst.insertNode(10);
        bst.insertNode(3);
        bst.insertNode(32);

        bst.displayTree();
    }
}
