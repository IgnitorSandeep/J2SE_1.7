package org.gyt.hackerrank.datastructure.tree;

public class LowestCommonAncestor {

	static Node lca(Node root, int v1, int v2) {
		Node left = null;
		Node right = null;

		if (root == null)
			return root;

		if (root.data == v1 || root.data == v2)
			return root;

		left = lca(root.left, v1, v2);
		right = lca(root.right, v1, v2);

		if (left != null && right != null)
			return root;

		return (left != null) ? left : right;
	}
}
