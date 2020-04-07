package com.abhiram.algo.tree;

public class Node {

    private String data;
    private Node left, right;

    public Node(String value) {
        this.data = value;
        this.left = this.right = null;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
