package com.aston.intensive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LinkedListImplTest {

	@Test
	void testAddObject() {

		Integer[] testArray = { 1, 2, 3, 4, 5, 6 };
		LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();

		for (Integer s : testArray) {

			linkList.add(s);
		}
		Integer[] resArray = new Integer[6];
		for (int i = 0; i < 6; i++) {

			resArray[i] = linkList.get(i);
		}

		assertTrue(Arrays.equals(testArray, resArray));
	}

	@Test
	void testAddObjectIndex() {

		Integer[] testArray = { 1, 2, 3, 4, 5, 6 };
		Integer[] addedArray = { 1, 2, 3, 4, 9, 5, 6 };
		LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();

		for (Integer s : testArray) {

			linkList.add(s);
		}

		linkList.add(9, 4);

		Integer[] resArray = new Integer[7];
		for (int i = 0; i < 7; i++) {

			resArray[i] = linkList.get(i);
		}

		assertTrue(Arrays.equals(addedArray, resArray));
	}

	@Test
	void testGet() {

		Integer[] testArray = { 1, 2, 3, 4, 5, 6 };
		LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();

		for (Integer s : testArray) {

			linkList.add(s);
		}

		assertEquals(3, linkList.get(2));
	}

	@Test
	void testSize() {

		Integer[] testArray = { 1, 2, 3, 4, 5, 6 };
		LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();

		for (Integer s : testArray) {

			linkList.add(s);
		}

		assertEquals(6, linkList.size());
	}

	@Test
	void testSort() {

		Integer[] testArray = { 9, 3, 2, 5, 4, 1 };
		LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();

		for (Integer s : testArray) {

			linkList.add(s);
		}

		Integer[] sortedTestArray = { 1, 2, 3, 4, 5, 9 };
		Integer[] sortedLinkListArray = new Integer[6];
		linkList.sort((o1, o2) -> o1 - o2);

		for (int i = 0; i < 6; i++) {

			sortedLinkListArray[i] = linkList.get(i);
		}
		
		assertTrue(Arrays.equals(sortedLinkListArray, sortedTestArray));
	}

}
