package Java_20160604_re;

public class Car2 {
	String modelNumber;
	String color;
	int year;
	
	//������
	//�޼ҵ� ���� Ŭ�����̸��� �����ϰ� ��ȯ����  void�� �ƴ϶� �ƿ� ���ٸ� ������ 
	//�ν��Ͻ� ���� �ʱ�ȭ �Ҷ� ����Ѵ�.
 
	public Car2(String modelNumber,String color,int year){  
		this.modelNumber=modelNumber;
		this.color=color;
		this.year=year;
	}
	
	
	/* 
	 * 
	 // �����ϴ� ����� �̷��� ������� ������ ���� �������� ������ ���Ⱑ ��������� 
	public Car2(String m,String c,int y){  
		this.modelNumber=m;
		this.color=c;
		this.year=y;
	}
	
	*/
	public static void main(String[] args) {
		Car2 c1 = new Car2("0100101000","white",2018);//
		Car2 c2 = new Car2("0100105000","black",2017);//
		Car2 c3 = new Car2("0100107000","red",2019);//		
		System.out.println(c1.modelNumber+"\t"); //�ν���Ʈ ���������  ���� �θ��°� ���� �ʴ�. ���� ���͸� ���ؼ� �����´� 
		
		
		/*
		c1.modelNumber = "010 0000 1000";
		c1.color*/
	}
	
	
	
}
