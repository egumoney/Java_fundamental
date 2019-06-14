package Java_20160604_re;

public class Car {
	// 클래스 안 메소드밖에 있는 멤버변수  메소드 안에 있다면  일반 변수로 의미가 없다 
	//디폴트  정수 는 0  나머지는 Null로 들어가있다. c3에서 확인하기 디폴트 값들이 출력된다.
	String modelNumber;
	String color;
	int year;
	
	public void whatIsColor(){
		System.out.println("내 차의 색깔은"+color+"입니다.");// 여기서 color는 멤버변수 이다. 
	}
	
	public String getColor(){		
		return "내차의 색깔은"+color+"야" ;
	}
	
	public static void main(String[] args) {
		Car c1= new Car(); //객체를 만들고 저장해서 출력 하
		//c1.whatIsColor();
		
		c1.modelNumber ="010101000";
		c1.color="white";
		c1.year=2018;
		
		c1.whatIsColor();
		String a = c1.getColor();
		
		System.out.println("c1의 자동차 색은"+a);
		
		Car c2= new Car();
		c2.modelNumber= "010101001";
		c2.color="black";
		c2.year=2019;
		c2.whatIsColor(); 
		System.out.println("c2의 자동차 색은"+c2.getColor());
		
		
		Car c3 =new Car();
		//c3.modelNumber="01001010002";
		//c3.color="red";
		//c3.year=2017;

		System.out.println("첫번쨰 객체부터 (인스턴스변수)출력하기 ");
		System.out.println(c1.modelNumber+"\t"+c1.color+"\t"+c1.year);
		
		System.out.println("두번쨰 객체부터 (인스턴스변수)출력하기 ");
		System.out.println(c2.modelNumber+"\t"+c2.color+"\t"+c2.year);
		
		System.out.println("세번쨰 객체부터 (인스턴스변수)출력하기 ");
		System.out.println(c3.modelNumber+"\t"+c3.color+"\t"+c3.year);
		
		
		
	}	
}
