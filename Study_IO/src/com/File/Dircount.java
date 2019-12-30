package com.File;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/4/23
 * @Description: com.File
 * @VERSION:1.0
 */
public class Dircount {
    private  long length ;
    private int fileSize;
    private  int dirSize;

    private String path;

    public Dircount() {
    }
    private File src;
    public Dircount(String path) {
        this.path = path;
        this.src = new File(path);
        getLengthFiles(this.src);
    }

    public static void main(String[] args){
        Dircount dircount = new Dircount("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com");
        System.out.println("dircount = " + dircount.getLength()+"fileSize ="+dircount.getFileSize()+"dirSize ="+dircount.getDirSize());
    }

    public long getLength() {
        return length;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }

    public void setDirSize(int dirSize) {
        this.dirSize = dirSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setLength(long length) {
        this.length = length;
    }

    private void getLengthFiles(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                dirSize++;
                getLengthFiles(file1);
            }else{
                length +=file1.length();
                fileSize++;
            }
        }
    }
}
