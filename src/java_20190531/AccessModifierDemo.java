package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
//		c.modelNumber="68��4472";// �𵨳ѹ��� �Ⱥ��δ� �����̺� �����߱��� �˼��ִ�. 
				
		//defualt�� ���� ��Ű��(���丮 ����)���� ���ٰ��� 
		c.color ="red";
		
		//���� �ٸ� ��Ű������ ��ӹ��� ������� ���� 
		c.doorCount=5;
		
		//���� �ٸ� ��Ű������ ���ٰ��� 
		c.price= 10_000_000;
		
		
		//���� ������ ���� Ĺ Ŭ������ ��ã�´� ��������� �Ѵ�,
		Cat cat= new Cat();
		cat.nickName="tomcat";
		
		System.out.println(cat.nickName);
		//�θ� ���� �Ӽ��� ��� ���� �ڽ� �� �� ���� �ִ� �� private default�� ���� ���� ���ٰ� �����̺� . protetected�� ����� ������ ���� �ִ�. 
		AccessModifierDemo a = new AccessModifierDemo();
		//Cat Ŭ������ ��� ������ protected�� �����Ҽ� �ִ�.
		a.age=10;
		a.nickName="����";	
	}
	
	
}	
