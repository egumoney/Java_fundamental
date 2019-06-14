package Java_20160604_re;

public class Car2 {
	String modelNumber;
	String color;
	int year;
	
	//생성자
	//메소드 명이 클래스이름과 동일하고 반환값이  void가 아니라 아예 없다면 생성자 
	//인스턴스 변수 초기화 할때 사용한다.
 
	public Car2(String modelNumber,String color,int year){  
		this.modelNumber=modelNumber;
		this.color=color;
		this.year=year;
	}
	
	
	/* 
	 * 
	 // 이해하는 방식은 이래도 상관없다 하지만 차후 가독성이 떨어져 보기가 힘들어진다 
	public Car2(String m,String c,int y){  
		this.modelNumber=m;
		this.color=c;
		this.year=y;
	}
	
	*/
	public static void main(String[] args) {
		Car2 c1 = new Car2("0100101000","white",2018);//
		Car2 c2 = new Car2("0100105000","black",2017);//
		Car2 c3 = new Car2("0100107000","red",2019);//		
		System.out.println(c1.modelNumber+"\t"); //인스턴트 멤버변수를  직접 부르는건 좋지 않다. 세터 게터를 통해서 가져온다 
		
		
		/*
		c1.modelNumber = "010 0000 1000";
		c1.color*/
	}
	
	
	
}
