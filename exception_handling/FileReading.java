package com.exception_handling;

import java.io.*;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter File Name:");
    	String fileName = scanner.nextLine();
    	
        File file = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\exception_handling\\"+fileName);
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Unable to read the file");
        } finally {
                if (fileReader != null) {
                    fileReader.close();
                }
        }
    }
}
