package java_20190530;

public class Customer{
	//instance variable
	String name;
	String cphone;
	
	//static variable
	static double interestRate_itemA;
	
	//���ø� ������� ����  ���� ����� ������ ��  �� ������ ������ �������� ������ �ʴ´�.
	static final String BANKNAME="��������";
	
	
	public void regstiser(){//DBinsrt
		System.out.println("���� ��� �Ǿ����ϴ�");
		System.out.println("�̸�: " + name + ", �ڵ�����ȣ: "+cphone+", ������"+ interestRate_itemA+", �����"+BANKNAME );
	}
	
	
	
	
	
	
}
