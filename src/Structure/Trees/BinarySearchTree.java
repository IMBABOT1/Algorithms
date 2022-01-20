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

    private int GLOBAL_SPACE = 5;

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
    private void printPreorder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.println(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void displayPreorder(){
        printPreorder(root);
    }

    public void displayInorder(){
        printInorder(root);
    }

    public void displayPostorder(){
        printPostOrder(root);
    }

    private void printInorder(TreeNode node){
        if (node == null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }

    private void printPostOrder(TreeNode node){
        if (node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data);
    }

    public void displayTree(){
        print2D(root, GLOBAL_SPACE);
    }

    private void print2D(TreeNode r, int space){
        if (r == null){
            return;
        }
        space += GLOBAL_SPACE;
        print2D(r.right, space);
        System.out.println();
        for (int i = GLOBAL_SPACE; i < space; i++){
            System.out.print(" ");
        }
        System.out.print(r.data);
        print2D(r.left, space);
    }
//
//    public void printLevelOrder(TreeNode r){
//
//    }
//
    public TreeNode search(int v){
        TreeNode temp = root;
        if (root == null){
            throw new RuntimeException("Tree is empty");
        }
        while (temp != null){
            if (temp.data == v){
                return temp;
            }else if (v > temp.data){
                temp = temp.right;
            }else {
                temp = temp.left;
            }
        }
        return null;
    }
//
//    public TreeNode minValueNode(TreeNode node){
//
//    }
//
//    public TreeNode deleteNode(TreeNode r, int v){
//
//    }

}
