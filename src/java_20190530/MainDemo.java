package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1.Customer c ���� Customer �� Reference type, c�� reference
		// 2.new Customer()�� Objecet 		 
		//c1 == c2 ���۷��� Ÿ�Կ�����  �񱳿����ڷ� ������ ���� ���۷����ΰ��� �� �Ǵ��Ѵ�. 
		//�޼ҵ带 �ҋ� �ݹ��� ���۷��� 
		
		
		/*
		Customer c = new Customer();
		c.name="������";
		c.cphone="010-2376-8226";
		Customer.interestRate_itemA= 4.3;
		
		c.regstiser();		
		Customer c2 = new Customer();
		c2.name="Steve Jobs";
		c2.cphone="010-1111-2222";
		Customer.interestRate_itemA= 4.5;
		c2.regstiser();

		//c3 reference�� c2 reference�� ����Ű�� object�� �����϶�� �ǹ� 
		Customer c3=c2; //�ּҸ� ���� ����� ������ ���� �̷��� ���� ���� ���� ���� ���� ������ ���� �ؾ��ϴ� �����̴�.  
		c3.name="������";
		c3.cphone="010-0000-1111"; 
		c3.regstiser();
		c2.regstiser();
		*/
		
		Member m= new Member();
		m.setName("park");
		m.setCphone("010-2376-8226");
		m.setAddress("seoul");
		m.setZipcode("77777");
		
		System.out.println(m.getName());
		System.out.println(m.getCphone());
		System.out.println(m.getAddress());
		System.out.println(m.getZipcode());
		 
		 
	}
	
	 
	 
}
