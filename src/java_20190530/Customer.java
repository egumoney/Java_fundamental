package java_20190530;

public class Customer{
	//instance variable
	String name;
	String cphone;
	
	//static variable
	static double interestRate_itemA;
	
	//예시를 들기위해 넣음  변수 선언시 고정이 됨  이 변수에 새값이 들어오더라도 변하지 않는다.
	static final String BANKNAME="신한은행";
	
	
	public void regstiser(){//DBinsrt
		System.out.println("고객이 들록 되었습니다");
		System.out.println("이름: " + name + ", 핸드폰번호: "+cphone+", 이자율"+ interestRate_itemA+", 은행명"+BANKNAME );
	}
	
	
	
	
	
	
}
