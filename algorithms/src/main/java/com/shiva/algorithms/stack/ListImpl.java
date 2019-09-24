package com.shiva.algorithms.stack;

import java.util.List;

public class ListImpl {

	private Node head;

	private static int counter;

	public ListImpl() {
		head = new Node(null);
		counter = 0;
	}

	public void add(Object o) {
		Node temp = new Node(o);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		counter++;
		System.out.println("add completed");
	}

	public void display() {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
			System.out.println(current.getData());
		}
	}

	public void reverse() {
		Node current = null, prev = null, next = null, temp = null;
		current = head;
		while (current.getNext() != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
			System.out.println(current.getData());
		}

	}

	public static void main(String[] args) {
		ListImpl list = new ListImpl();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(16);
		list.display();
		System.out.println("---");
		
		String s1 = "AMERICA";
		String s3 = "RICA";
		String s2 = "AME"+s3;
		System.out.println(s1.hashCode() +"-"+s2.hashCode());
		System.out.println(s1==s2);
		
		Parent parent = new Child();
		System.out.println(parent.x);
		parent.display();
	}
}
