package java_20190603;

public class Constructor {
	private String name;
	private String email;
	private int age;
	
	//����Ʈ ������ : Ŭ�������� �����ڰ� ���� ���  compiler�� �ڵ����� �������ش�. 
	//Ŭ�������� �����ڰ� 1�� �� �ִ� ���� compiler ���������� �ʴ´�.
	//�����ڴ� Ŭ���� �̸��� ����, ��ȯ���� ���� ���¸� ������ �ִ�.	
	public Constructor(){
		
	}	
	public Constructor(String name,String �̸���){
		/*
		this.name=name;
		email=�̸���;
		*/
		//�Ű����� 3��¥�� ������ ȣ��
		this(name,�̸���,0);
		
	}	
	//�Ű����� 3���� ������
	//�żҵ��� overloading ó�� �����ڵ� overloading�� ������
	
	public Constructor(String name, String email,int age ){ //this�� ���ú����� instance������ �����ϱ� ���� �����
		this.name=name;
		this.email=email;
		this.age=age;
		/*  �������� �Ű������� �ٲ۴ٸ� 
		 this. ���� ���Ҽ� �ִ�.
		 * */
	}
	public static void main(String[] args) {
		Constructor c= new Constructor("������","yihwapark@naver.com",3);// �����ڰ� ȣ��Ǹ鼭 �޸𸮰� �ö���±��� 
		//�����ڸ� ���������ʾҴٸ� �ڵ����� �����ȴ�	//�Ű������� ���� �����ڰ� �ִٸ� ����Ʈ �����ڸ� �������ʴ´�. 		
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
	}

}

