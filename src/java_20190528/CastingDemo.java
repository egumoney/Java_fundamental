package java_20190528;

public class CastingDemo {
	public static void main(String[] args){
		
		//byte ������ �Ѿ�� ���� �߻�
		//Circuit �߻��Ѵ� -��ȯ�� �߻��Ѵ� Ư���� ������ �߻��Ͽ� �ľ��ϱ� ����� 
		byte a= (byte)128;
		
		System.out.println(a);
		
		//float,double �� ĳ�����ϴ� ���� �Ҽ��� ���� �߻�
		//cut �߻� 
		int b=(int)42.5;
		System.out.println(b);
		
		int totalCount =42;
		int memberCount =4;
		
		//first_case

		double d=(double)totalCount/(double)memberCount;
		
		System.out.println("totalCount+MemberCount="+d );

		//second case
		double c= 42/4f ;	
		System.out.println("42/4="+c);	
		
		
		
		
	}
}
