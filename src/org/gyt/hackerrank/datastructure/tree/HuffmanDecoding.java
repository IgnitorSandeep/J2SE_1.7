package org.gyt.hackerrank.datastructure.tree;

public class HuffmanDecoding {

	void decode(String S, Node root) {
		int strlen = S.length();
		Node temp = root;
		int strptr = 0;
		while (strptr < strlen) {
			if (S.charAt(strptr) == '1') {
				root = root.right;

				if (root.left == null && root.right == null) {
					System.out.print(root.data);
					root = temp;
				}

			} else if (S.charAt(strptr) == '0') {
				root = root.left;

				if (root.left == null && root.right == null) {
					System.out.print(root.data);
					root = temp;
				}
			}
			strptr++;
		}
	}

}
