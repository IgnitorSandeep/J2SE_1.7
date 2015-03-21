package org.gyt.nio;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PatternMather {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "*ample.*";
		PathMatcher matcher =
		    FileSystems.getDefault().getPathMatcher("glob:" + pattern);
		Path filename = Paths.get(URI.create("C:\\Workspace" ));
		if(matcher.matches(filename))
		{
			System.out.println(filename);
		}
		System.out.println("End Now");
	}

}
