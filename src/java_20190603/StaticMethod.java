package java_20190603;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){
		name="��������";
		age =10;
		m2();
		m4();	
	}
	
	public void m2(){
		System.out.println("instance method m2()");
	}
	
	public static void m3(){
		name="��������";//static �޼ҵ忡���� static���� ���ٰ���
		//age=10; static �޼ҵ忡���� instance ���� ���� �Ұ� 
		//m2();//static �޼ҵ忡����  instance�޼ҵ� ȣ�� �Ұ� 
		m4(); //static �޼ҵ忡���� stati �޼ҵ� ȣ�� �Ұ�
	}
	
	public static void m4(){
		System.out.println("static method m4()");		
	}
	
	public static void main(String[] args) {
		//m4(); �̷��� �ᵵ�ǳ� ��Ȯ�� Ŭ���� ��Ī�� �ٿ����Ѵ� .
		StaticMethod.m4();//30�� ���� ó�� ��밡���� ������ ���� Ŭ������ �־ �׷���.
		name="��������";// �ν��Ͻ� �� �����Ϸ��� new �� ���� ��ü ������ �ϴ°Ŵ� . �ν��Ͻ��� �޸𸮰� ����ȵǾ��� ����.. 		
	
	
		//�ν��Ͻ��� �����Ϸ���
		StaticMethod sm=new StaticMethod();
		sm.age=10;
		sm.m1();
		sm.m2();
		
		//�ڼ������� m3 m4�� �ʷϵ��׶�̿� s�� �پ��ִ� ����ƽ�̶�� ���̰� Ŭ������ ���� �����ϴ°� ���� .	
		//������.�Ƚ� ��Ʈ �̰� ���� ����ƽ ���� �̴�. �������� Ŭ����  Integer.parseInt(��Ʈ��): ����ƽ �� ����ϸ� ����
		
 	}
	
	
	  
	
}
