package com.commons;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * @Auther:田增印
 * @Date: 2019/5/1
 * @Description: com.commons 列出子孙级
 * @VERSION:1.0
 */
public class CIOTest02 {

    public static void main(String[] args) {
        Collection<File> files = FileUtils.listFiles(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file"),
                EmptyFileFilter.NOT_EMPTY, null);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
