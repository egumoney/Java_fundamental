package java_20190528;

public class CastingDemo {
	public static void main(String[] args){
		
		//byte 범위를 넘어가면 에러 발생
		//Circuit 발생한다 -순환이 발생한다 특수한 사항이 발생하여 파악하기 힘들다 
		byte a= (byte)128;
		
		System.out.println(a);
		
		//float,double 로 캐스팅하는 경우는 소수점 이하 발생
		//cut 발생 
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
