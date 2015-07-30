package org.gyt.datastructures.tree;

public class BinarSearchTreeOps {

	static boolean isSame(BinaryTreeNode root1, BinaryTreeNode root2) {
		
		if (root1 == null && root2 == null)
			return true;
		
		if (root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data) && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
	}

	static BinaryTreeNode search(BinaryTreeNode root, int item) {
		if (root == null)
			return null;
		else {
			if (root.data == item)
				return root;
			else if (root.data < item)
				return search(root.right, item);
			else
				return search(root.left, item);
		}
	}

	static BinaryTreeNode insertNode(BinaryTreeNode root, int data) {
		BinaryTreeNode node = new BinaryTreeNode(data);
		if (root == null) {
			return node;
		}

		BinaryTreeNode current = root, parent = null;
		while (current != null) {
			parent = current;
			if (current.data <= data)
				current = current.right;
			else
				current = current.left;
		}

		if (parent.data <= data) {
			parent.right = node;
		} else {
			parent.left = node;
		}
		return root;
	}

	public static void main(String... args) {

		BinaryTreeNode root = null;
		root = insertNode(root, 7);
		root = insertNode(root, 5);
		root = insertNode(root, 6);
		root = insertNode(root, 10);
		root = insertNode(root, 1);
		root = insertNode(root, 9);
		root = insertNode(root, 3);
		root = insertNode(root, 2);
		root = insertNode(root, 4);
		root = insertNode(root, 8);

		TreeOperations.inorder(root);

		BinaryTreeNode node = search(root, 7);
		System.out.println("\nSearched Node is  : " + node.data);

		
		BinaryTreeNode root2 = root;
		System.out.println("Check is Equal or not : "+isSame(root, root2));
		System.out.println();

	}

}
