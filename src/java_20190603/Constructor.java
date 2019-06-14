package java_20190603;

public class Constructor {
	private String name;
	private String email;
	private int age;
	
	//디폴트 생성자 : 클래스내에 생성자가 없는 경우  compiler가 자동으로 생성해준다. 
	//클래스내에 생성자가 1개 라도 있는 경우는 compiler 생성해주지 않는다.
	//생성자는 클래스 이름과 같고, 반환값이 없는 형태를 가지고 있다.	
	public Constructor(){
		
	}	
	public Constructor(String name,String 이메일){
		/*
		this.name=name;
		email=이메일;
		*/
		//매개변수 3개짜리 생성자 호출
		this(name,이메일,0);
		
	}	
	//매개변수 3개인 생성자
	//매소드의 overloading 처럼 생성자도 overloading이 가능함
	
	public Constructor(String name, String email,int age ){ //this는 로컬변수와 instance변수를 구분하기 위해 사용함
		this.name=name;
		this.email=email;
		this.age=age;
		/*  생성자의 매개변수를 바꾼다면 
		 this. 없이 상ㅇ할수 있다.
		 * */
	}
	public static void main(String[] args) {
		Constructor c= new Constructor("박유찬","yihwapark@naver.com",3);// 생성자가 호출되면서 메모리가 올라오는구나 
		//생성자를 선언하지않았다면 자동으로 생성된다	//매개변수를 가진 생성자가 있다면 디폴트 생성자를 만들지않는다. 		
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);
	}

}

