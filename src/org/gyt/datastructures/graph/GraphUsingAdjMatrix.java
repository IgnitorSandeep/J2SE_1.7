package org.gyt.datastructures.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUsingAdjMatrix {
	
	int n;
	boolean a[][];
	
	GraphUsingAdjMatrix(int node)
	{
		n = node;
		a = new boolean[n][n];
	}
	
	void addEdges(int i,int j)
	{
		a[i][j]=true;
	}
	
	void removeEdges(int i,int j)
	{
		a[i][j] = false;
	}
	
	boolean hasEdges(int i,int j)
	{
		return a[i][j];
	}

	List<Integer> inEdges(int i)
	{
		List<Integer> edges = new ArrayList<Integer>();
		for(int j = 0;j<n;j++)
		{
			if(a[j][i])
				edges.add(j);
		}
		return edges;
	}
	
	List<Integer> outEdges(int i)
	{
		List<Integer> edges = new ArrayList<Integer>();
		for(int j = 0;j<n;j++)
		{
			if(a[i][j])
				edges.add(j);
		}
		return edges;
	}
	
}
