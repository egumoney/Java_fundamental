package java_20190604;

public interface InterA extends InterB, InterC {
	//인터페이스의 변수 public static final 이 생략되어 있음
	double PI =3.14;// public static final 
	
	//인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//abstract 생략가능
	
	public void mA();// abstract 메소드에서 앱스트렉트가 디톨트 public은 디폴트가 아니다 빼면 에러가 난다.
	// mB mC를 가지고 있는 녀석이다.
	
	
	
		
}
