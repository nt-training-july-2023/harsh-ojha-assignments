package com.lambda_io.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InvertLineOrder {

	public static void main(String[] args)  throws IOException {
		
		File sourceFile = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\lambda_io\\io\\sourceFile.txt");
		File destFile = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\lambda_io\\io\\destFile.txt");

		
		FileReader fileReader = new FileReader(sourceFile);
		FileWriter fileWriter = new FileWriter(destFile);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);

	
		ArrayList<String> list = new ArrayList<>();
		
		String line;
		while((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		
		for (int i=list.size()-1;i>=0;i--) {
			fileWriter.write(list.get(i));
			fileWriter.write("\n");
		}
		bufferedReader.close();
		fileWriter.close();
	}
}
