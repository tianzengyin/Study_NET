package Study_Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoginService {
	/*private String[] userBox1 = new String[]{"����ӡ","���ְҵ����ʦ����ѧ","����ʵѵ����"};
	private int[] passwordBox = new int[]{123,666,888};
	public String loginForArray(String name,String password){
		
		for(int i = 0;i<userBox.length;i++){
			if(userBox[i].equals(name)){
				if(passwordBox[i]==Integer.parseInt(password)){
					return "��½�ɹ�";
				}
			}
		}
		return "�û������������";
	}*/
	//���һ������,������½��֤----ArrayList
/*	private List<String> userBox2 = new ArrayList<String>();
	{
		//��ʼ����������,ÿ����һ������ͻ�ִ��һ��,�����ڹ��캯��ִ��
		userBox2.add("����ӡ-123");
		userBox2.add("���ְҵ����ʦ����ѧ-666");
		userBox2.add("����ʵѵ����-888");
	}
	public  String loginForList(String name,String password){
		for(int i =0;i<userBox2.size();i++){
			String[] value = userBox2.get(i).split("-");//һ���˵���Ϣ,V[0]����,v[1]����
			if(value[0].equals(name)){
				if(value[1].equals(password)){
					return "��½�ɹ�";
				}
			}
			
		}
		return "�û������������";
	}*/
	
	//���һ������,������½��֤----Set
	/*private Set<String> userBox3 = new HashSet<>();
	{
		//��ʼ����������,ÿ����һ������ͻ�ִ��һ��,�����ڹ��캯��ִ��
		userBox3.add("����ӡ-123");
		userBox3.add("���ְҵ����ʦ����ѧ-666");
		userBox3.add("����ʵѵ����-888");
	}
	public String loginForSet(String name,String password){
		Iterator<String> it = userBox3.iterator();
		while(it.hasNext()){
			//String s = it.next();
			String[] value = it.next().split("-");//һ���˵���Ϣ,V[0]����,v[1]����
			if(value[0].equals(name)&&value[1].equals(password)){
				return "��½�ɹ�";
			}
		}
		return "�û������������";
	}*/
	//���һ������,������½��֤----Map
	private Map<String , Integer> userBox4 = new HashMap<>();
	{
		//��ʼ����������,ÿ����һ������ͻ�ִ��һ��,�����ڹ��캯��ִ��
				userBox4.put("����ӡ",123);
				userBox4.put("���ְҵ����ʦ����ѧ",666);
				userBox4.put("����ʵѵ����",888);
	}
	public String loginForMap(String name,String password){
		
		
		Integer realPassword = userBox4.get(name);
		if(realPassword!=null &&  realPassword.equals(Integer.parseInt(password))){//��������
			return "��½�ɹ�";
		}
		
		
		/*Set<String> keys = userBox4.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String s = it.next();
			Integer value = userBox4.get(s);
			if(s.equals(name)&&value.toString().equals(password)){
				return "��½�ɹ�";
			}
		}*/
		return "�û������������";
	}
	public static void main(String[] args) {
		LoginService lg  = new LoginService();
	    //sop(lg.loginForList("����ӡ","1231"));
		//sop(lg.loginForSet("����ӡ","123"));
		sop(lg.loginForMap("����ӡ","123"));

	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
