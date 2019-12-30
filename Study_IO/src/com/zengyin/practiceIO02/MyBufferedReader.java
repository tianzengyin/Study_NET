package com.zengyin.practiceIO02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 自定义一个类中包含一个功能和readLine一致的方法.
 * 来模拟一下BufferedReader
 * 
 * */
 public class MyBufferedReader{
    private FileReader fr;
	public MyBufferedReader(FileReader fr){
		this.fr = fr;
	}
	
	//可以一次读一行数据的方法
    public String myReadLine() throws IOException{
		
		//定义一个临时容器 ,原BufferedReader封装的是字符数组
    	//定义有一个StringBuilder容器.因为最终还是要将数据变成字符串
    	StringBuilder sb = new StringBuilder();
    	int ch = 0;
    	while((ch = fr.read())!=-1){
    		if(ch=='\r')
    			continue;
    		if(ch=='\n')
    			return sb.toString();
    		sb.append((char)ch);
    	}
    	if(sb.length()!=0)
    		return sb.toString();
		return null;
		
	}
    
    public void myClose() throws IOException{
    	fr.close();
    }

}

 class MyBufferedReaderDemo{
	/*public static void main(String[] args){
		//demo0();
		for(int i =0 ;i<100;i++){
			if(i==74)break;
			if(i%9!=0)continue;
			System.out.println("i = "+i);
		}
		
		
	}*/

	public static void demo0() {
		FileReader fr = null;
		MyBufferedReader mybuf = null;
		try {
			fr = new FileReader("TestIO02_copy.txt");
			mybuf = new MyBufferedReader(fr);
			String line =null;
			try {
				while((line = mybuf.myReadLine())!=null){
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			if(mybuf!=null)
			try {
				mybuf.myClose();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
