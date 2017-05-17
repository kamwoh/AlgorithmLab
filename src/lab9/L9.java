package lab9;

import java.util.Random;

public class L9 {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(1);
        bst.root.left = new Node(2);
        bst.root.right = new Node(3);
        bst.root.left.left = new Node(4);
        bst.root.left.right = new Node(5);
        bst.root.right.left = new Node(6);
        bst.root.right.right = new Node(7);
        bst.root.left.left.left = new Node(8);
        bst.root.left.left.right = new Node(9);
        bst.root.left.right.left = new Node(10);
        bst.root.left.right.right = new Node(11);

        System.out.println("Inorder tree walk");
        bst.InorderTreeWalk(bst.root);
        System.out.println("\nPreorder tree walk");
        bst.PreorderTreeWalk(bst.root);
        System.out.println("\nPostorder tree walk");
        bst.PostorderTreeWalk(bst.root);
        System.out.println("\nRoot to leaf path");
        bst.rootToLeafPath(bst.root, "");

        System.out.println("Symmetric tree");
        BST sym = new BST();
        sym.root = new Node(1);
        sym.root.left = new Node(2);
        sym.root.right = new Node(2);
        sym.root.left.left = new Node(3);
        sym.root.left.right = new Node(4);
        sym.root.right.left = new Node(4);
        sym.root.right.right = new Node(3);

        System.out.println("Tree path");
        sym.rootToLeafPath(sym.root, "");

        if (sym.isSymmetric(sym.root, sym.root)) {
            System.out.println("The tree is symmetric");
        } else {
            System.out.println("The tree is not symmetric");
        }

        BST newBST = new BST();
        for (int i = 0; i < 20; i++) {
            newBST.add(new Random().nextInt(100));
        }
    }
}

class Node {

    public int key;
    public Node parent;
    public Node left, right;

    public Node(int key) {
        this.key = key;
        parent = left = right = null;
    }
}

class BST {

    public Node root;

    public BST() {
        root = null;
    }

    public void add(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            add(key, root);
        }
    }

    private void add(int key, Node current) {
        if (current.key > key) { //go left
            if (current.left == null) {
                current.left = new Node(key);
                current.left.parent = current;
            } else {
                add(key, current.left);
            }
        } else { //go right
            if (current.right == null) {
                current.right = new Node(key);
                current.right.parent = current;
            } else {
                add(key, current.right);
            }
        }
    }

    public void InorderTreeWalk(Node node) {
        if (node == null)
            return;
        InorderTreeWalk(node.left);
        System.out.print(node.key + " ");
        InorderTreeWalk(node.right);
    }

    public void PreorderTreeWalk(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        PreorderTreeWalk(node.left);
        PreorderTreeWalk(node.right);
    }

    public void PostorderTreeWalk(Node node) {
        if (node == null)
            return;
        PostorderTreeWalk(node.left);
        PostorderTreeWalk(node.right);
        System.out.print(node.key + " ");
    }

    public void rootToLeafPath(Node node, String print) {
        if (node == null) {
            return;
        }

        print += node.key + " ";
        if (node.left == null && node.right == null) {
            System.out.println(print);
        } else {
            rootToLeafPath(node.left, print);
            rootToLeafPath(node.right, print);
        }
    }

    public boolean isSymmetric(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        } else {
            if (left != null && right != null && left.key == right.key) {
                return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
            } else {
                return false;
            }
        }
    }
    
    public Node search(int key) {
        Node current = root;
        
        while (current != null) {
            if (current.key > key) {
                current = current.left;
            } else if (current.key < key) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }
    
    public Node min(Node current) {
        while(true) {
            if(current.left == null)
                return current;
            current = current.left;
        }
    }

    public void transplant(Node oldNode, Node newNode) {
        if (oldNode.parent == null) {
            root = newNode;
        } else if (oldNode == oldNode.parent.left) {
            oldNode.parent.left = newNode;
        } else {
            oldNode.parent.right = newNode;
        }
        if (newNode != null) {
            newNode.parent = oldNode.parent;
        }
    }
    
    public void delete(int key) {
        Node deleteNode = search(key);
        if (deleteNode.left == null) {
            transplant(deleteNode, deleteNode.right);
        } else if (deleteNode.right == null) {
            transplant(deleteNode, deleteNode.left);
        } else {
            Node replaceNode = min(deleteNode.right);
            if (replaceNode.parent != deleteNode) {
                transplant(replaceNode, replaceNode.right);
                replaceNode.right = deleteNode.right;
                replaceNode.right.parent = replaceNode;
            }
            transplant(deleteNode, replaceNode);
            replaceNode.left = deleteNode.left;
            replaceNode.left.parent = replaceNode;
        }
    }

}
