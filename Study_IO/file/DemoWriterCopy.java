package com.ioTest;

/**
 * @Auther:田增印
 * @Date: 2019/4/27
 * @Description: 文件字符输出流
 * @VERSION:1.0
 */
public class DemoWriter {
    public static void main(String[] args){
        //1.创建源
        File dest = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
        //2.选择流
        Writer writer = null;
        try {
            writer = new FileWriter(dest);
            //3.操作
            //写法一
            /*String str = "abcdefhkgdfsasdf";
            char[] chars = str.toCharArray();
            writer.write(chars,0,chars.length);*/
            //写法二
            /*String str = "abcdefhkgdfsasdf";
            writer.write(str);
            writer.flush();*/
            //写法三
            writer.append("IO is so easy\r\n").append("天津职业技术师范大学");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null != writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
