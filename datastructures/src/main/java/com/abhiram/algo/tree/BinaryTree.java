package com.abhiram.algo.tree;

public class BinaryTree {

    private Node root;

    public BinaryTree() {

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrder(Node root) {
        if(root==null) {
            return;
        }
        System.out.printf("%s ",root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
}
