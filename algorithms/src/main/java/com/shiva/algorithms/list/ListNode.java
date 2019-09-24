package com.shiva.algorithms.list;

public class ListNode {

	private ListNode next;

	private Object data;

	public ListNode(Object _data) {
		this.next = null;
		this.data = _data;
	}

	public ListNode(ListNode _next, Object _data) {
		this.next = _next;
		this.data = _data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
