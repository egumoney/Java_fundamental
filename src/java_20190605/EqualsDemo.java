package java_20190605;

class Car{
	String modelNumber;
	String color;
	int year;
	//매개변수 있는 생성자alt+shift+s => o => ok
	//디폴트 생성자 쉬프트 alt+shift+s => c => ok
	
	//equals and hashCode :alt +shift +s => h=>ok  
	//에러가 난다면 car 클래스 안에서 단축키를 누를것 
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}	//setter, getter : alt+shift+s  => r => ok
	
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
		
	}//toString() : alt+shift+s=>s =>ok
	 

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}




	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

public class EqualsDemo {
	public static void main(String[] args) {
		Car c1= new Car("0101010000","black",2018);
		Car c2 =new Car("0101010000","black",2018);		
		
		Car c3 =new Car("0101010001","red",2019);
		Car c4 =new Car("0101010001","red",2019);
		System.out.println(c1);//패키지 명.클래스명 @ 해쉬코드를 16진수로 바꾼것.  이건 주소가 아니다. 
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println("c1 hashCode"+c1.hashCode());
		System.out.println("c2 hashCode"+c2.hashCode());
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		System.out.println("c3 hashCode"+c3.hashCode());
		System.out.println("c3 hashCode"+c4.hashCode());
		
		
	}
}
