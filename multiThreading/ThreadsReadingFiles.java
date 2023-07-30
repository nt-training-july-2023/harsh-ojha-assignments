package com.multiThreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThreadsReadingFiles extends Thread {
	
	private File file;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	public ThreadsReadingFiles(File file) throws FileNotFoundException {
	this.file = file;
	fileReader = new FileReader(file);
	bufferedReader = new BufferedReader(fileReader);
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		String line;
		try {
			line = bufferedReader.readLine();
			while(line!=null) {
				System.out.print(threadName + " is reading:");
				System.out.println(line);
				line=bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
	
		File file1 = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\multiThreading\\text1.txt");
		File file2 = new File("D:\\Nucleusteq Training\\AssignmentWorkSpace\\demo\\src\\main\\java\\com\\multiThreading\\text2.txt");

		ThreadsReadingFiles thread1 = new ThreadsReadingFiles(file1);
		ThreadsReadingFiles thread2 = new ThreadsReadingFiles(file2);
		
		thread1.start();
		thread2.start();
		
	}
}
