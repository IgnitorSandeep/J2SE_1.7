package org.gyt.datastructures.tree;

public class BinarSearchTreeOps {

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

		System.out.println();

	}

}
