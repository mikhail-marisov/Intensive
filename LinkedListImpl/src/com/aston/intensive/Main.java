package com.aston.intensive;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
LinkedListImpl<Integer> linkList = new LinkedListImpl<Integer>();
		
		
		Integer [] inArray = {0, 1, 2, 3};
		for (Integer i : inArray) {
			linkList.add(i);
		}
		
		Integer [] arrayFromList = new Integer [inArray.length]; 
		for (int i = 0; i < inArray.length; i++) {
			arrayFromList [i] = linkList.get(i);
		}
		
		for (int i = 0; i < inArray.length; i++) {
			System.out.println((inArray [i]) == linkList.get(i));
		}
		
		for (int i = 0; i < inArray.length; i++) {
			System.out.println(arrayFromList[i]);
		}
		
		System.out.println(inArray == arrayFromList);
		//System.out.println(linkList.listSize);
		
		//linkList.printOut();
		//System.out.println();
		
		linkList.add(5, 1);
		linkList.add(7, 1);
		linkList.add(9, 1);
		linkList.sort ((o1, o2) -> o1 - o2);
		
		for (int i = 0; i < linkList.size(); i++) {
			System.out.println(linkList.get(i));
		}
		System.out.println("----------------------------");
		System.out.println(linkList.get(1));
		//linkList.printOut();
		//System.out.println(linkList.listSize);
		//System.out.println(linkList.size());
		int sz = linkList.size();
		//System.out.println(linkList.getLastNode());
		System.out.println("----------------------------");

	}

}
