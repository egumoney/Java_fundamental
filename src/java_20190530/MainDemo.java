package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1.Customer c 에서 Customer 는 Reference type, c는 reference
		// 2.new Customer()는 Objecet 		 
		//c1 == c2 레퍼런스 타입에서의  비교연산자로 볼때는 같은 레퍼런스인가로 비교 판단한다. 
		//메소드를 할떈 콜바이 레퍼런스 
		
		
		/*
		Customer c = new Customer();
		c.name="박유찬";
		c.cphone="010-2376-8226";
		Customer.interestRate_itemA= 4.3;
		
		c.regstiser();		
		Customer c2 = new Customer();
		c2.name="Steve Jobs";
		c2.cphone="010-1111-2222";
		Customer.interestRate_itemA= 4.5;
		c2.regstiser();

		//c3 reference를 c2 reference가 가리키는 object를 참조하라는 의미 
		Customer c3=c2; //주소를 덮어 씌우기 때문에 보통 이렇게 쓰면 갚이 덮어 씌어 지기 때문에 주의 해야하는 사항이다.  
		c3.name="송정희";
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
