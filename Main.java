package com.example.prgms;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		
		intTree.traverseInOrder();
		*/
		
		Heap heap = new Heap(10);
		heap.insert(80);
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		
		heap.printHeap();
		
		//heap.delete(0);
		//heap.delete(2);
		
		
		
		System.out.print(heap.peek());
		
		heap.sort();
		
		heap.printHeap();
		

	}

}
