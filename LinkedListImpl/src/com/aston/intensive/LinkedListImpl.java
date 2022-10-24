package com.aston.intensive;

import java.util.Comparator;

public class LinkedListImpl<T> implements MyLinkedList<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size = 0;

	@Override
	public void add(Object o) {

		Node<T> nod;
		if (size == 0) {
			nod = new Node((T) o, null, null);
			firstNode = nod;
			lastNode = nod;
			size++;
		} else {
			nod = new Node((T) o, null, lastNode);
			lastNode.next = nod;
			lastNode = nod;
			size++;
		}
	}

	@Override
	public void add(Object o, int index) {

		if (index > size - 1) {
			throw new IndexOutOfBoundsException();
		}

		if (index == size - 1) {
			this.add(o);
		}

		if (index < size - 1) {

			System.out.println("вставляем перед " + index);
			Node<T> replaceElement = firstNode;
			for (int i = 0; i < index; i++) {
				replaceElement = replaceElement.next;
			}

			Node<T> newElement = new Node<>((T) o, replaceElement, replaceElement.prev);
			replaceElement.prev.next = newElement;
			replaceElement.prev = newElement;
			size++;

		}
	}

	Node<T> findListElementByIndex(int index) {
		if (index < (size / 2)) {
			Node<T> node = firstNode;
			for (int i = 0; i < index; i++)
				node = node.next;
			return node;
		} else {
			Node<T> node = lastNode;
			for (int i = size - 1; i > index; i--)
				node = node.prev;
			return node;
		}
	}

	@Override
	public T get(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return findListElementByIndex(index).value;
	}

	@Override
	public int size() {
		return size;
	}

	public void  sort(Comparator<T> comp) {

		boolean unsorted = true;
		T temp = null;
		while (unsorted) {

			unsorted = false;
			for (int i = 0; i < (size - 1); i++) {

				if ((comp.compare(this.findListElementByIndex(i).value,
						this.findListElementByIndex(i + 1).value)) > 0) {
					
					temp = findListElementByIndex(i).value;
					findListElementByIndex(i).value = findListElementByIndex(i + 1).value;
					findListElementByIndex(i + 1).value = temp;
					unsorted = true;

				}
			}
		}
	}
	
	

	private static class Node<T> {
		T value;
		Node<T> next;
		Node<T> prev;

		public Node(T value, Node<T> next, Node<T> prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

}
