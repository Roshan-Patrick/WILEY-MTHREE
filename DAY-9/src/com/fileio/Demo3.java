package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("first.txt");
		try {
			FileInputStream fin = new FileInputStream(f);
			int i=0;
			try {
				while((i=fin.read())!= -1)	
					System.out.print((char)i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


//
