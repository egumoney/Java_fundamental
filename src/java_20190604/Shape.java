package java_20190604;

public abstract class Shape {
	String name;
	double degree;
	
	public abstract void draw(); // 추상 메소드는 바디가 생긴다면 에러난다 .
	
	public void drawLine(){
		System.out.println("Shape- drawLine()");
	}
	
}
