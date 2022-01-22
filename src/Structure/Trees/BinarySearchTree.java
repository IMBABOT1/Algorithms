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

        @Override
        public String toString() {
            return String.valueOf(data);
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



    private int heightOfTree(TreeNode r){ ;
        if (r == null){
            return  -1;
        }else {
            int leftHeight = heightOfTree(r.left);
            int rightHeight = heightOfTree(r.right);

            if (leftHeight > rightHeight){
                return (leftHeight + 1);
            }else {
                return (rightHeight + 1);
            }
        }
    }

    public int height(){
         return  heightOfTree(root);
    }


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

    public void printBFC(){
        printLevelOrderBFS(root);
    }

    private void printGivenLevel(TreeNode r, int level){
        if (r == null){
            return;
        }else if (level == 0){
            System.out.println(r.data);
        }else {
            printGivenLevel(r.left, level - 1);
            printGivenLevel(r.right, level - 1);
        }
    }

    private void printLevelOrderBFS(TreeNode r){
        int h = height();
        for (int i = 0; i <= h ; i++) {
            printGivenLevel(r, i);
        }
    }

    public TreeNode minValueNode(TreeNode node){
        TreeNode current = node;
        while (current.left != null){
            current = current.left;
        }
        return current;
    }

    private TreeNode deleteNode(TreeNode r, int v){
        if (r == null){
            return null;
        }else if (v < r.data){
            r.left = deleteNode(r.left, v);
        }else if (v > r.data){
            r.right = deleteNode(r.right, v);
        }else {
            if (r.left == null){
                TreeNode temp = r.right;
                r = null;
                return temp;
            }else if (r.right ==  null){
                TreeNode temp = r.left;
                r = null;
                return temp;
            }else {
                TreeNode temp = minValueNode(r.right);
                r.data = temp.data;
                r.right = deleteNode(r.right, temp.data);
            }
        }
        return r;
    }

    public void delete(int value){
        deleteNode(root, value);
    }

    public void insertNodeR(int key) {
        root = insertNodeRecursive(root, new TreeNode(key));
    }

// private recursive call

    private TreeNode insertNodeRecursive(TreeNode currentParent, TreeNode newNode) {

        if (currentParent == null) {
            return newNode;
        } else if (newNode.data > currentParent.data) {
            currentParent.right = insertNodeRecursive(currentParent.right, newNode);
        } else if (newNode.data < currentParent.data) {
            currentParent.left = insertNodeRecursive(currentParent.left, newNode);
        }

        return currentParent;
    }
}
