package study_Generic;
/**
 * 
 * ���ͷ���
 * 	��ʽ:
 * 		���η� <����> ����ֵ���� ������(�����б�(ʹ�÷���)){
 * 			������;
 *     }
 * 
 * */
public class GenericMethod {
	//���ͷ���
	public <M> void method01(M m){
		System.out.println(m);
	}
	//���з��͵ľ�̬����
	public static <M> void method02(M m){
		System.out.println(m);
	}
}
