package com.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsEx {
	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		obj.FileCheck();
	}

}

class ThrowsDemo {

	public void FileOperation() throws IOException {
		FileWriter fwr = new FileWriter("F:\\");
	}

	public void FileCheck() {
		try {
			FileOperation();
		} catch (IOException e) {
			System.out.println("Please give the proper path of the file");

//			e.printStackTrace();
		}
	}
}
