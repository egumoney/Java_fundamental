package java_20190601;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c =new Customer();
		c.name="������";
		c.cphone="010-7777-8777";
		System.out.println("�̸�:" +c.name);
		System.out.println("�ڵ���:" +c.cphone);
 	
		
		
		
		Manager m=new Manager();
		m.name="�Ŵ���";
		m.cphone="010-2323-2323";
		m.address="��⵵";
		m.id="alai";
		m.password="123123132";
		System.out.println("�̸�:" +m.name);
		System.out.println("�ڵ���:" +m.cphone);
		System.out.println("�ּ�:" +m.address);
		System.out.println("���̵�:" +m.id);
		System.out.println("���:" +m.password);
		m.actionCustomer();
		m.actionManager();

		//Super Ÿ������ (alba)���� Sub ��ü(Manager)�� ������ �� �ִ�. 
		//�������[�ν��Ͻ�]�� Super(Alba) Ÿ���� ������ ���� Ŭ���� (Customer)���� ����.
		Alba alba =new Manager();
		alba.name="�Ŵ���";
		alba.cphone="010-2323-2323";
		alba.address="��⵵";
		//alba.id="alai";
		//alba.password="123123132";
		System.out.println("�̸�:" +alba.name);
		System.out.println("�ڵ���:" +alba.cphone);
		System.out.println("�ּ�:" +alba.address);

		Alba a= new Alba();
		a.name="�˹ٻ�";
		a.cphone="010-2222-2222";
		a.address="����";
		System.out.println("�̸�:" +a.name);
		System.out.println("�ڵ���:" +a.cphone);
		System.out.println("�ּ�:" +a.address);
		//alba Object   Manager Object  ������ �ľ��صѰ� 
		
		
		
	}
}
