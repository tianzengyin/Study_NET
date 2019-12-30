package com.zengyin.practiceIO03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class DemoNumberReader {

	public static void main(String[] args) {
		FileReader fr = null;
		LineNumberReader lnr = null;
		try {
			fr = new FileReader("TestIO02_copy.txt");
			lnr = new LineNumberReader(fr);
			String line = null;
			try {
				lnr.setLineNumber(100);
				while((line = lnr.readLine())!=null){
					//lnr.getLineNumber();
					System.out.print(lnr.getLineNumber());
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			if(lnr!=null)
				try {
					lnr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
	}

}
