package com.abhiram.algo.tree;

public class PreOrderTraversal {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node("A");
        binaryTree.setRoot(root);

        binaryTree.getRoot().setLeft(new Node("B"));
        binaryTree.getRoot().getLeft().setLeft(new Node("C"));
        binaryTree.getRoot().getLeft().setRight(new Node("D"));
        binaryTree.getRoot().setRight(new Node("E"));
        binaryTree.getRoot().getRight().setRight(new Node("F"));

        System.out.println("Print Binary Tree");
        binaryTree.preOrder(binaryTree.getRoot());

    }
}
