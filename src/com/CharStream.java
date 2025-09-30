package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharStream {
	
	public static void main(String[] args) throws IOException {
		extracted();
		ByteStreams bytes=new ByteStreams();
		

	}

	private static void extracted() throws IOException {
		File file=new File("C:\\work\\file.txt");
		try {
			FileInputStream fis=new FileInputStream(file);
			int temp;
			while((temp=fis.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
