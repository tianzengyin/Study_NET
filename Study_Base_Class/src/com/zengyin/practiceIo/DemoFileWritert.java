package com.zengyin.practiceIo;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWritert {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("甲方将安排房间跑进");
		fw.write(5320);
		fw.write(97);
		fw.close();
	}

}
