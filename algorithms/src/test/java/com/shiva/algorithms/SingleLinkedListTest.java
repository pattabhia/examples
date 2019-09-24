package com.shiva.algorithms;

import java.util.Stack;

import com.shiva.algorithms.list.SingleLinkedList;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		Stack<String> s = new Stack<String>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(30,2);
		list.display();
	}

}
