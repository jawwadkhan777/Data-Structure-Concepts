package Projects;

class SetNode {
    int data;
    SetNode left;
    SetNode right;

    public SetNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeTraversal {
    SetNode root;

    public BinaryTreeTraversal() {
        root = null;
    }

    public void preOrderTraversal(SetNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal(SetNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(SetNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new SetNode(1);
        tree.root.left = new SetNode(2);
        tree.root.right = new SetNode(3);
        tree.root.left.left = new SetNode(4);
        tree.root.left.right = new SetNode(5);
        tree.root.right.left = new SetNode(6);
        tree.root.right.right = new SetNode(7);

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
        System.out.println();
    }
}
