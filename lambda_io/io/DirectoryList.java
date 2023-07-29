package com.lambda_io.io;

import java.io.File;

public class DirectoryList {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\harsh\\Downloads");
		
		String[] list = file.list();
		System.out.println("List of Files and Folders present:");
		int i=1;
		for (String string : list) {
			System.out.println(i+". "+string);
			i++;
		}
		
	}
}
