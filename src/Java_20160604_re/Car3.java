package Java_20160604_re;

public class Car3 {
	String modelNumber;
	String color;
	int year;
	
	public Car3(String modelNumber , String color,int year ){
		this.modelNumber=modelNumber;
		this.color=color;
		this.year= year;
		
	}

	//modelNumber�� ������ �� �ִ� �Լ� ����� (modelNumber�� setter�Լ� )
	public void setMondelNumber(String modelNumber){
		this.modelNumber=modelNumber;		
	}
	
	//modelNumber�� ������ �� �ִ� �Լ�-�޼���- �����(modelNumber�� setter �޼ҵ�)
	public String getModelNumber(){
	//	return this.modelNumber; // �ͷ��� ��
		return modelNumber;		
	}

	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return year;
	}
	
	
	public static void main(String[] args) {
		Car3 c1=new Car3("010101000","black",1997);
		String mn1= c1.getModelNumber();
		String co1=c1.getColor();
		int y1= c1.getYear();
		System.out.println(mn1+"\t"+co1	+"\t"+y1);
		
		c1.setMondelNumber("01000101001");
		c1.setColor("whitegray");
		c1.setYear(20212);
	
		
		
		
	}
	
	//color ������ ���� �ü� �ִ� 
}

