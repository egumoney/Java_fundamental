package java_20190601;

public class ExtendsDemo {
	public static void main(String[] args) {
		Customer c =new Customer();
		c.name="박유찬";
		c.cphone="010-7777-8777";
		System.out.println("이름:" +c.name);
		System.out.println("핸드폰:" +c.cphone);
 	
		
		
		
		Manager m=new Manager();
		m.name="매니저";
		m.cphone="010-2323-2323";
		m.address="경기도";
		m.id="alai";
		m.password="123123132";
		System.out.println("이름:" +m.name);
		System.out.println("핸드폰:" +m.cphone);
		System.out.println("주소:" +m.address);
		System.out.println("아이디:" +m.id);
		System.out.println("비번:" +m.password);
		m.actionCustomer();
		m.actionManager();

		//Super 타입으로 (alba)으로 Sub 객체(Manager)를 생성할 수 있다. 
		//멤버변수[인스턴스]는 Super(Alba) 타입의 포함한 상위 클래스 (Customer)접근 가능.
		Alba alba =new Manager();
		alba.name="매니저";
		alba.cphone="010-2323-2323";
		alba.address="경기도";
		//alba.id="alai";
		//alba.password="123123132";
		System.out.println("이름:" +alba.name);
		System.out.println("핸드폰:" +alba.cphone);
		System.out.println("주소:" +alba.address);

		Alba a= new Alba();
		a.name="알바생";
		a.cphone="010-2222-2222";
		a.address="서울";
		System.out.println("이름:" +a.name);
		System.out.println("핸드폰:" +a.cphone);
		System.out.println("주소:" +a.address);
		//alba Object   Manager Object  차이점 파악해둘것 
		
		
		
	}
}
