package com.shiva.algorithms.list;

public class SingleLinkedList {

	private ListNode head;
	private static int counter;

	public SingleLinkedList() {
		head = new ListNode(null);
		counter = 0;
	}

	public void add(Object _data, int index) {
		try {
			ListNode temp = new ListNode(_data);
			ListNode current = head;
			int i = 1;
			while (current.getNext() != null && i <= index) {
				current = current.getNext();
				i++;
			}
			temp.setNext(current.getNext());
			current.setNext(temp);
			counter++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void add(Object _data) {
		ListNode temp = new ListNode(_data);
		ListNode current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		counter++;
	}

	public void display() {
		try {
			ListNode current = head.getNext();
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void reverse(ListNode current) {
		if (current != null) {
			reverse(current.getNext());
			System.out.printf("%d ", current.getData());
		}
	}

}
