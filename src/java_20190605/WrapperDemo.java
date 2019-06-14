package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		String s1="42.5";
		String s2="90.5";

		//primitive data type을 Wrapper클래스로 변환 int=> Integer
		//int => Integer
		
		Integer a1= new Integer(a);
		Integer a2= new Integer(b);
		
		//int a3= a1+a2; //원래 안된다  왜 될까?? 
		//1.4 ver 에서 어노테이션이 적용안됨 
		//1.5 ver에서 언박싱 오토박싱이 나오면서 16번 라인 과 같은 코드 진행이 가능해졌다. 
		
		//wrapper class=> primitive data type 변환
		int a3= a1.intValue()+a2.intValue();
		
		
		//String = > primitive data type 
		double d1 =Double.parseDouble(s1);
		double d2= Double.parseDouble(s2);
		
		double d3 = d1 +d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		
		//(auto)boxing : primitive date type=> Wrapper Class 자동 변환
		Integer a4= 10;
		Integer a5= 20;
		
		//(auto)unboxing: Wrapper class => primitive data type 자동변환 
		int a6=a4+a5;
		
			
		
	}
}
