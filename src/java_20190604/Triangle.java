package java_20190604;

public class Triangle extends Shape{

	String dot;
	double angleDegree;
	
	// Shape ũ���� draw �޼ҵ� �������̵�(overriding)
	//�������̵� �ۼ���Ģ
	
	//1. �޼ҵ� �̸� ���ƾ���
	//2. �Ű����� ������ �ڷ����� ��ġ�ؾ���.
	//3. ��ȯ���� ���ƾ���. 
	//4. ���� �����ڴ� �θ𺸴� ũ�ų� ���ƾ���.
	
	
	
	@Override	
	public void draw() { 	
		System.out.println("Triangle- draw()"); //�������̵� �� 
	}
	
	public void drawCoordinaet(){
		System.out.println("Triangle- drawCoordinate()");// �������̵� �������� �༮ 
	}
	
	
	
}
