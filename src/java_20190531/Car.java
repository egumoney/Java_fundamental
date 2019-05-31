package java_20190531;

public class Car {
	private String modeNumber;
	String color;
	protected int doorCount; //
	public double price; //할인등 계산적용하다보면 소수점이 나오는 경우들이 종종있다.
	
	//alt + shift +s => c 
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	//alt +shift+s=>O
	
	public Car(String modeNumber, String color, int doorCount, double price) {
		super();
		this.modeNumber = modeNumber;
		this.color = color;
		this.doorCount = doorCount;
		this.price = price;
	}
		
	
	//초록색 퍼블릭 
	
	
	
	
	
	
}
