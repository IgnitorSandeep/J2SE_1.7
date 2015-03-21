package org.gyt.datastructures.tree;

import java.util.ArrayList;

public class Tree {

	public Node root;
	
}

class Node {
	ArrayList<Node> children;
	String value;
	public Node parent;
}