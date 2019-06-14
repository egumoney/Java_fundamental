package java_20190603;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){
		name="국민은행";
		age =10;
		m2();
		m4();	
	}
	
	public void m2(){
		System.out.println("instance method m2()");
	}
	
	public static void m3(){
		name="국민은행";//static 메소드에서는 static변수 접근가능
		//age=10; static 메소드에서는 instance 변수 접근 불가 
		//m2();//static 메소드에서는  instance메소드 호출 불가 
		m4(); //static 메소드에서는 stati 메소드 호출 불가
	}
	
	public static void m4(){
		System.out.println("static method m4()");		
	}
	
	public static void main(String[] args) {
		//m4(); 이렇게 써도되나 정확히 클래스 명칭을 붙여야한다 .
		StaticMethod.m4();//30번 라인 처럼 사용가능한 이유는 같은 클래스에 있어서 그렇다.
		name="신한은행";// 인스턴스 를 생성하려면 new 를 통해 객체 생성을 하는거다 . 인스턴스는 메모리가 선언안되었기 때문.. 		
	
	
		//인스턴스를 생성하려면
		StaticMethod sm=new StaticMethod();
		sm.age=10;
		sm.m1();
		sm.m2();
		
		//자세히보면 m3 m4는 초록동그라미에 s가 붙어있다 스태틱이라는 뜻이고 클래스를 통해 접근하는게 좋다 .	
		//인테져.팔스 인트 이것 또한 스태틱 변수 이다. 인테져가 클래스  Integer.parseInt(스트링): 스태틱 을 사용하면 기울엊
		
 	}
	
	
	  
	
}
