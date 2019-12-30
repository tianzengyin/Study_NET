package com.zengyin.practiceString01;

/**
 * 常见的操作方法:
 *   	1.获取
 *        1.1字符串中包含的字符数,也就是字符串的长度.
 *        	  int lengt():获取长度
 *        1.2根据位置获取某个字符
 *            char charAt(int index)
 *        1.3根据字符获取该字符在字符串的位置
 *            int indexOf(int ch):返回的是ch在字符串中第一次出现的位置
 *            int indexOf(int ch, int fromIndex) :从fromIndex指定开始位置获取ch在字符串中第一次出现的位置
 *            int indexOf(String str) : 返回的是str在字符串中第一次出现的位置
 *            int indexOf(String str, int fromIndex) :从fromIndex指定开始位置获取str在字符串中第一次出现的位置
 *   	2.判断
 *        2.1字符串是否包含某一个子串.
 *           boolean contains(str):判断此字符串是否包含
 *           特殊之处:indexOf(str):可以索引str第一次出现的位置,如果返回-1,表示该str不在字符串中存在
 *                    所以,也可以用于对指定判断是否包含.
 *                       if(str.indexOf("aa")!=-1)
 *                       
 *                       而且该方法即可以判断,又可以获取出现的位置.
 *                       
 *        2.2字符串是否有内容.
 *          boolean isEmpty() :返回 true如果，且仅当 length()为 0 。 
 *        2.3字符串是否是以指定内容开头.
 *          boolean startsWith(String prefix) :测试此字符串是否以指定的前缀开头。
 *          
 *        2.4字符串是以什么东西结尾.
 *          boolean endsWith(String prefix) :测试此字符串是否以指定的后缀结尾。
 *        2.5判断字符串内容是否相同
 *          boolean equals(str):  复写了Object类中的equals方法
 *        2.6判断内容是否相同,并忽略大小写.
 *           boolean equalsIgnoreCase();
 *       3.转换.
 *        3.1将字符数组转成字符串.
 *            构造函数: String(char[])
 *                    String(char[],offset,count):将字符数组中的一部分转成字符串
 *            静态方法: static String valueOf(char[] data) ;
 *                    static String valueOf(char[] data, int offset, int count) ;        
 *        3.2将字符串转成字符数组.
 *           char[] toCharArray() ;
 *        3.3将字节数组转成字符串.
 *           构造方法:String(byte[] bytes) 
 *                  String(byte[] bytes, Charset charset) :构造一个新的String由指定用指定的字节的数组解码charset 。 
 *                  String(byte[] bytes, int offset, int length) 
 *        3.4将字符串转成字节数组.
 *           byte[] getBytes(String charsetName) 
 *        3.5将基本数据类型转成字符串.
 *           static String valueOf(int)
 *           Static String valueOf(duble) 
 *           
 *             3 + "";//String.valueOf(3);
 *             
 *             特殊:字符串和字节数组在转换过程中,可以指定编码表.
 *       4 替换
 *          String replace(char oldChar, char newChar)       
 *       5 切割
 *          String[] split(String regex)
 *       6 子串
 *          获取字符串中的一部分
 *          String substring(int beginIndex)   
 *          String subSequence(int beginIndex, int endIndex)  
 *        7 转换  去除空格  比较 
 *          7.1 将字符串转成大写或小写
 *               String toUpperCase();
 *               String toLowerCase();
 *          7.2 将字符串两端的空格去除
 *               String trim();
 *          7.3 对两个字符串进行自然顺序的比较 
 *               int compareTo(String)
 * */
public class StringTest01 {
	public static void method_7(){
		String s = "   Hello JaVa   ";
		sop(s.toUpperCase());
		sop(s.toLowerCase());
		sop(s.trim());
	}
	public static void method_sub(){
		
		String s = "abcdefg";
		//sop(s.substring('c'));
		sop(s.subSequence(1, 5));//包含头,不包含尾
		sop(s.substring(3));//从指定位置到结尾
	}
	public static void method_split(){
		String s = "张三,李四,王五,赵四";
		String[] arr = s.split(",");
		//sop(arr.toString());
		for(int i = 0 ;i<arr.length;i++){
			sop(arr[i]);
			
		}
		//String[] str  = {"张三丰,杨过,小龙女"};
	}
	public static void method_replace(){
		String s  = "adasdssdsfgfsfdg";
		
		String str = "天津省河西区";
		
		sop(str.replace("天津", "河北"));
		sop(str);
		sop(s.replace('a', 'b'));
		sop(s);
	}
	public static void method_trans(){
		
		char[] arr = {'a','b','c','d','e','f'};
		String Sarr = new String(arr,1,3);
		sop(Sarr);
	}
	public static void method_is(){
		String str = "ArrayDome.java";
		//判断文件名名称是否是Array单词开头
		sop(str.startsWith("Array"));
		//判断文件名名称是否是.java的文件 
		sop(str.endsWith(".java"));
		//判断文件名中是否包含Demo
		sop(str.contains("Demo"));
	}
	public static void method_get(){
		
		String str = "abcfrcdea";
		sop(str.length());
		sop(str.charAt(3));
		sop(str.indexOf('a',3));
		sop(str.lastIndexOf('c',4));
		sop(str.lastIndexOf(97));
		
	}
	public static void main(String[] args) {
		/*String s1 = "abc";//内存中有一个对象,存在常量池
		String s2 = new String("abc");//内存中有两个对象
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));//String类复写了Object类中的equals方法,
		                                  //该方法用于判断字符串是否相同
*/		
		//method_get();
		//method_is();
		//method_trans();
		//method_replace();
		//method_split();
		//method_sub();
		method_7();
	}
	public static void sop(Object obj){
		System.out.println(obj);
		
	}

}
