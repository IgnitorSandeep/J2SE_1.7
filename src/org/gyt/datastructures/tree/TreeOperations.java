package org.gyt.datastructures.tree;

public class TreeOperations {

	public static void inorder(BinaryTreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	public static void preorder(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void postorder(BinaryTreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	int size(BinaryTreeNode root) {

		if (root == null)
			return 0;
		int left = size(root.left);
		int right = size(root.right);
		return left + right + 1;

	}

	int height(BinaryTreeNode root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
	}
}