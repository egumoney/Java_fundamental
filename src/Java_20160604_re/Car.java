package Java_20160604_re;

public class Car {
	// Ŭ���� �� �޼ҵ�ۿ� �ִ� �������  �޼ҵ� �ȿ� �ִٸ�  �Ϲ� ������ �ǹ̰� ���� 
	//����Ʈ  ���� �� 0  �������� Null�� ���ִ�. c3���� Ȯ���ϱ� ����Ʈ ������ ��µȴ�.
	String modelNumber;
	String color;
	int year;
	
	public void whatIsColor(){
		System.out.println("�� ���� ������"+color+"�Դϴ�.");// ���⼭ color�� ������� �̴�. 
	}
	
	public String getColor(){		
		return "������ ������"+color+"��" ;
	}
	
	public static void main(String[] args) {
		Car c1= new Car(); //��ü�� ����� �����ؼ� ��� ��
		//c1.whatIsColor();
		
		c1.modelNumber ="010101000";
		c1.color="white";
		c1.year=2018;
		
		c1.whatIsColor();
		String a = c1.getColor();
		
		System.out.println("c1�� �ڵ��� ����"+a);
		
		Car c2= new Car();
		c2.modelNumber= "010101001";
		c2.color="black";
		c2.year=2019;
		c2.whatIsColor(); 
		System.out.println("c2�� �ڵ��� ����"+c2.getColor());
		
		
		Car c3 =new Car();
		//c3.modelNumber="01001010002";
		//c3.color="red";
		//c3.year=2017;

		System.out.println("ù���� ��ü���� (�ν��Ͻ�����)����ϱ� ");
		System.out.println(c1.modelNumber+"\t"+c1.color+"\t"+c1.year);
		
		System.out.println("�ι��� ��ü���� (�ν��Ͻ�����)����ϱ� ");
		System.out.println(c2.modelNumber+"\t"+c2.color+"\t"+c2.year);
		
		System.out.println("������ ��ü���� (�ν��Ͻ�����)����ϱ� ");
		System.out.println(c3.modelNumber+"\t"+c3.color+"\t"+c3.year);
		
		
		
	}	
}
