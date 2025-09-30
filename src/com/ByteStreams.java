package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreams {


	public static void main(String[] args) throws IOException {
		extracted();
		ByteStreams bytes=new ByteStreams();
		bytes.writeIntoFile();
		

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
	public void writeIntoFile() throws IOException {
		File file=new File("C:\\work\\file.txt");
		File file2=new File("C:\\work\\out.txt");
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream(file);
			fos=new FileOutputStream(file2);
			int temp;
			while((temp=fis.read())!=-1) {
				fos.write(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
