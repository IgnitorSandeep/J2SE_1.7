package org.gyt.hackerrank.datastructure.tree.swap_node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class Solution {

	static void inorder(Node root) {

		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}

	static void swapOperation(Node root, int k) {

		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);

		int level = 1;

		while (!queue.isEmpty()) {
			Node temp = queue.peek();
			queue.poll();
			if (temp == null) {

				if (!queue.isEmpty()) {
					queue.add(null);
				}

				level++;

			} else {

				if (level == k) {
					Node newNode = temp.left;
					temp.left = temp.right;
					temp.right = newNode;
				}

				if (temp.left != null)
					queue.add(temp.left);

				if (temp.right != null)
					queue.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		int N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		Queue<Node> queue = new LinkedList<Node>();
		int level = 1;
		
		Node root = null;
		if (N > 0) {
			root = new Node(1);
			queue.add(root);
			queue.add(null);
		}



		while ((N > 0) && (!queue.isEmpty())) {

			Node tmp = queue.peek();
			queue.poll();
			
			if (tmp == null) {
				
				if (!queue.isEmpty())
					queue.add(null);
				level++;
				
			} else {
				
				int left = scanner.nextInt();
				int right = scanner.nextInt();

				if (left != -1) {
					
					tmp.left = new Node(left);
					queue.add(tmp.left);
					
				}

				if (right != -1) {
					
					tmp.right = new Node(right);
					queue.add(tmp.right);
					
				}
				
				N--;
			}

		}

		int T;
		T = scanner.nextInt();
		
		while(T>0){
			int k = scanner.nextInt();
			
			int itr = 2;
			
			int currLevel = k;
			
			while (currLevel <= level) {
				swapOperation(root, currLevel);
				currLevel = itr*k;
				itr++;
			}
			inorder(root);
			System.out.println();
			T--;
		}

		scanner.close();
		
		return;

	}
}