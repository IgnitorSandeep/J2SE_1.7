package org.gyt.hackerrank.datastructure.tree;

import java.util.Stack;

public class TopView {
	void top_view(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node temp = root;
		if (root == null)
			return;
		else {
			stack.push(root);
			while (temp.left != null) {
				temp = temp.left;
				stack.push(temp);
			}

			while (!stack.empty()) {
				temp = stack.pop();
				System.out.print(temp.data + " ");
			}

			while (temp.right != null) {
				temp = temp.right;
				System.out.print(temp.data + " ");
			}
		}
	}
}
