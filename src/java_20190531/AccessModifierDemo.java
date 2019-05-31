package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
//		c.modelNumber="68오4472";// 모델넘버가 안보인다 프라이빗 선언했구나 알수있다. 
				
		//defualt는 같은 패키지(디렉토리 폴더)에서 접근가능 
		c.color ="red";
		
		//서로 다른 패키지에서 상속받은 경우접근 가능 
		c.doorCount=5;
		
		//서로 다른 패키지에서 접근가능 
		c.price= 10_000_000;
		
		
		//같은 페이지 내에 캣 클래스를 못찾는다 지정해줘야 한다,
		Cat cat= new Cat();
		cat.nickName="tomcat";
		
		System.out.println(cat.nickName);
		//부모가 만든 속성은 상속 받은 자식 이 다 쓸수 있다 단 private default는 제외 절대 안줄건 프라이빗 . protetected는 상속을 받으면 쓸수 있다. 
		AccessModifierDemo a = new AccessModifierDemo();
		//Cat 클래스를 상속 받으면 protected로 접근할수 있다.
		a.age=10;
		a.nickName="민지";	
	}
	
	
}	
