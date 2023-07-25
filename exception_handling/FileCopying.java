package com.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopying {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Source file name to copy");
		String sourceFileName = scanner.nextLine();

		System.out.println("Enter destination file name");
		String destFileName = scanner.nextLine();
		
		File sourceFile = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\exception_handling\\"+sourceFileName);
		File destFile = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\exception_handling\\"+destFileName);
	
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(destFile);
            int i;
            while ((i = fileReader.read()) != -1) {
                fileWriter.write(i);
            }
            System.out.println("Data copied Successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file Not Found.");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        } finally {
                if (fileReader != null) {
                    fileReader.close();
                    fileWriter.close();
                }
        }
		
	
	
	
	}
}
