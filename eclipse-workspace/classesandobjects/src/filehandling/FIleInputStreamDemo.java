package filehandling;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;


import controlflow.ForLoopsEx;
public class FIleInputStreamDemo {

	public static void main(String[] args)throws IOException {
		
		FileInputStream inputstream = new FileInputStream("D:\\java\\abc.text");
		int i =0 ;
		while((i =inputstream.read()!=-1)) 
		{
			System.out.println((char)i);
		}
		
		inputstream.close();
	}

}