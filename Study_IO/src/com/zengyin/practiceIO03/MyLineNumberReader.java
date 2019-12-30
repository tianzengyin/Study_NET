package com.zengyin.practiceIO03;

/*import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.zengyin.practiceIO02.MyBufferedReader;
*/
/*public class MyLineNumberReader {
	private Reader r;
	private int lineNumber = 0;
	
	MyLineNumberReader(Reader r){
		this.r = r;
	}
	
	public String myReadLine() throws IOException{
		
		StringBuilder sb = new StringBuilder();
		int  len =0;
		while((len= r.read())!=-1){
			if((char)len=='\r'){
				continue;
			}
			if((char)len == '\n'){
				if(sb!=null)
					lineNumber++;
				return sb.toString();
			}
			sb.append((char)len);
		}
		
		if(sb.length()!=0){
			lineNumber++;
			return sb.toString();
		}
		return null;
		
	}
	
	public void myclose() throws IOException{
		r.close();
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
	public static void main(String[] args) throws IOException {
       FileReader fr = new FileReader("TestIO02_copy.txt");
       
       MyLineNumberReader mylnr = new MyLineNumberReader(fr);
       
       String str = null;
       
       while((str=mylnr.myReadLine())!=null){
    	   System.out.print(mylnr.getLineNumber());
    	   System.out.println(str);
       }
       mylnr.myclose();
       
	}

}*/


/*public class MyLineNumberReader extends MyBufferedReader{

 
 	
	
	public MyLineNumberReader(FileReader fr) {
		super(fr);
		
	}
	private int lineNumber = 0;
	
	MyLineNumberReader(FileReader r){
		super(r);
	}
	
	public String myReadLine() throws IOException{
		
		lineNumber++;
		return super.myReadLine();
		
	}
	
	
	
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
 
 
 
 
   }

*/