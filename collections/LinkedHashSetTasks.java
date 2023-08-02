package com.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTasks {

	public static void main(String[] args) throws IOException {
		
		Set<String> set = new LinkedHashSet<>();
		
		FileReader fileReader = new FileReader("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\collections\\File.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String string = bufferedReader.readLine();
		while(string!=null) {
			set.add(string);
			string = bufferedReader.readLine();
		}
		bufferedReader.close();
		System.out.println("All duplicate words have been removed and the word order is preserved:");
		System.out.println(set);
	
		System.out.println(set.contains("Hello,"));
		System.out.println(set.contains("Harsh"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.remove("seeking"));
		System.out.println(set);
		
		
	}
}
