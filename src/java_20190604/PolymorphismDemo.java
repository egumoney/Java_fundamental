package java_20190604;

public class PolymorphismDemo {
	public static void execute(Shape s){// Shape s 는추상 클래스 
		s.draw();//들어온 녀석에 따라 달라진다. 실제 쉐이프 -n각형- 에 따라서 해당 드로우가 작동된다. 추상클래스의 폴리모피즘  객체에 따라 다양하게 호출된다.   
	}
	
	
	/*
	// 아래는 오버로딩 방식으로 폴리모피즘  다형성 구현한거다. 매개변수를 공통 부모인 Shape를 사용하면 각자 해당 모형의 드로우가 호출된다. 
	public static void execute(Rectangle s){// Shape s 는추상 클래스 
		s.draw();//들어온 녀석에 따라 달라진다. 
	}
	
	
	
	public static void execute(Triangle s){// Shape s 는추상 클래스 
		s.draw();//들어온 녀석에 따라 달라진다. 
	}
	*/
	
	
	
	public static void main(String[] args) {
		Triangle t= new Triangle();
		execute(t);
		
		Rectangle r= new Rectangle();
		execute(r);
				
	}
	
	
	
}
