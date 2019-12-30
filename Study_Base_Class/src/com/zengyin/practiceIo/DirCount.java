package com.zengyin.practiceIo;

import java.io.File;

/**
 * ʹ����Զ���ͳ���ļ��д�С
 * 
 * */
public class DirCount {
	//��С
	private long len;
	//�ļ���·��
	private String path;
	//Դ
	private File src;
	//�ļ��и���
	private int dirSize;
	//�ļ�����
	private int fileSize;
	public DirCount(String path) {
		super();
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}

	public long getLen() {
		return len;
	}


	public int getDirSize() {
		return dirSize;
	}


	public int getFileSize() {
		return fileSize;
	}


	public static void main(String[] args) {
		DirCount dir = new DirCount("D:/workspace/base_Class_Demo");
		
		System.out.println(dir.getLen()+"--->"+dir.getDirSize()+"--->"+dir.getFileSize());
		
		
		DirCount dir2 = new DirCount("D:/workspace/base_Class_Demo/src");
		
		System.out.println(dir2.getLen()+"--->"+dir2.getDirSize()+"--->"+dir2.getFileSize());
	}
	private void count(File src){
		
		//��ȡ��С
		if(src != null && src.exists()){//�ݹ�ͷ
			if(src.isFile()){//������ļ�
				len +=src.length();
				this.fileSize++;
			}else {  //���Ｖ,�����Ŀ¼
				this.dirSize++;
				for(File s : src.listFiles()){
					count(s);
				}
			}
		}
	}
}
