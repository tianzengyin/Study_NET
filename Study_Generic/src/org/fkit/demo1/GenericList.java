package org.fkit.demo1;

import java.util.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class GenericList
{
	public static void main(String[] args)
	{
		// ����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();  // ��
		strList.add("���Java����");
		strList.add("���Android����");
		// ������뽫����������
//		strList.add(5);    // ��
		strList.forEach(str -> System.out.println(str.length())); // ��
	}
}

