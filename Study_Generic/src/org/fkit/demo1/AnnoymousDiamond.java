package org.fkit.demo1;

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
interface Foo<T>
{
	void test(T t);
}
public class AnnoymousDiamond
{
	public static void main(String[] args)
	{
		// 指定Foo类中泛型为String
		Foo<String> f = new Foo<String>()
		{
			// test()方法的参数类型为String
			@Override
			public void test(String t)
			{
				System.out.println("test方法的t参数为：" + t);
			}
		};
		// 使用泛型通配符，此时相当于通配符的上限为Object
		Foo<?> fo = new Foo<Object>()
		{
			// test()方法的参数类型为Object
			@Override
			public void test(Object t)
			{
				System.out.println("test方法的Object参数为：" + t);
			}
		};
		// 使用泛型通配符，通配符的上限为Number
		Foo<? extends Number> fn = new Foo<Number>()
		{
			// 此时test()方法的参数类型为Number
			@Override
			public void test(Number t)
			{
				System.out.println("test方法的Number参数为：" + t);
			}
		};
	}
}
