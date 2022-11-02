package com.fileio;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("first.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("New File is created");
			}else
				System.out.println("File already present");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
