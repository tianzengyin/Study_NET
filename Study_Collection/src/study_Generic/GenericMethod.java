package study_Generic;
/**
 * 
 * 泛型方法
 * 	格式:
 * 		修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
 * 			方法体;
 *     }
 * 
 * */
public class GenericMethod {
	//泛型方法
	public <M> void method01(M m){
		System.out.println(m);
	}
	//含有泛型的静态方法
	public static <M> void method02(M m){
		System.out.println(m);
	}
}
