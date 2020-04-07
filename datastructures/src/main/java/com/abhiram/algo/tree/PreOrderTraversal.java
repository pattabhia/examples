package com.abhiram.algo.tree;

public class PreOrderTraversal {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node("A");
        binaryTree.setRoot(root);

        System.out.println(binaryTree.getRoot().getData());
    }
}
