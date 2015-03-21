package org.gyt.io;

import java.io.File;
import java.util.ArrayList;

public class DirectoryUtils {

	public DirectoryUtils() {

	}

	public static ArrayList<File> listFilesAndDirectory(String dir) {
		ArrayList<File> filesList = new ArrayList<File>();
		File folder = new File(dir);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile() || listOfFiles[i].isDirectory()) {

				filesList.add(new File(listOfFiles[i].getAbsolutePath()));
			}
		}
		return filesList;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("*******************************************");
		System.out.println("Absolute path of all files in E:\\Binaries\n");
		System.out.println("*******************************************");
		ArrayList<File> filesPathList = listFilesAndDirectory("E:\\Binaries");
		for (File file : filesPathList) {

			System.out.println(file.getAbsolutePath() + "\n");

		}
		System.out.println("*********************************");
		System.out.println("Name of all files in E:\\Binaries\n");
		System.out.println("*********************************");
		ArrayList<File> filesAbsolutePathList = listFilesAndDirectory("E:\\Binaries");
		for (File file : filesAbsolutePathList) {

			System.out.println(file.getName() + "\n");

		}

	}

}
