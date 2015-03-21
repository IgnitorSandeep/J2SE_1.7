package org.gyt.nio;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Metadata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Path p1= Paths.get("C:\\Users\\sandeep\\javadir\\Sample.txt");
		try {
			System.out.println("Size of Sample file is : "+Files.size(p1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}