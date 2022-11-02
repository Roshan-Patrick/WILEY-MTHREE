package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileOutputStream fos = new FileOutputStream("first.txt", true);) {
			// Opening the file into write mode

			byte[] data = "Welcome to java,We are learning IO".getBytes(); // Convert into bytes
			fos.write(data);
			System.out.println("Data added into the File");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
