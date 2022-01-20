package Structure.Trees;

public class BinarySearchTree {

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            left = null;
            right = null;
            this.data = data;
        }

        public TreeNode() {
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insertNode(int element){
        TreeNode node = new TreeNode(element);
        if (root == null){
            root = node;
        }else {
            TreeNode temp = root;
            while (temp != null){
                if (node.data == temp.data){
                    throw new RuntimeException("Node already exists");
                }else if ((node.data < temp.data) && temp.left == null){
                    temp.left = node;
                    break;
                }else if (node.data < temp.data){
                    temp = temp.left;
                }else if ((node.data > temp.data) && temp.right == null){
                    temp.right = node;
                    break;
                }else {
                    temp = temp.right;
                }
            }
        }
    }

    //
//    public void printPreorder(TreeNode node){
//
//    }
//
//    public void printInorder(TreeNode node){
//
//    }
//
//    public void printPostOrder(TreeNode node){
//
//    }
//
//    public void print2D(TreeNode r, int space){
//
//    }
//
//    public void printLevelOrder(TreeNode r){
//
//    }
//
//    public TreeNode search(TreeNode r, int v){
//
//    }
//
//    public TreeNode minValueNode(TreeNode node){
//
//    }
//
//    public TreeNode deleteNode(TreeNode r, int v){
//
//    }

}
