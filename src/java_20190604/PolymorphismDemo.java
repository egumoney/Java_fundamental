package java_20190604;

public class PolymorphismDemo {
	public static void execute(Shape s){// Shape s ���߻� Ŭ���� 
		s.draw();//���� �༮�� ���� �޶�����. ���� ������ -n����- �� ���� �ش� ��ο찡 �۵��ȴ�. �߻�Ŭ������ ����������  ��ü�� ���� �پ��ϰ� ȣ��ȴ�.   
	}
	
	
	/*
	// �Ʒ��� �����ε� ������� ����������  ������ �����ѰŴ�. �Ű������� ���� �θ��� Shape�� ����ϸ� ���� �ش� ������ ��ο찡 ȣ��ȴ�. 
	public static void execute(Rectangle s){// Shape s ���߻� Ŭ���� 
		s.draw();//���� �༮�� ���� �޶�����. 
	}
	
	
	
	public static void execute(Triangle s){// Shape s ���߻� Ŭ���� 
		s.draw();//���� �༮�� ���� �޶�����. 
	}
	*/
	
	
	
	public static void main(String[] args) {
		Triangle t= new Triangle();
		execute(t);
		
		Rectangle r= new Rectangle();
		execute(r);
				
	}
	
	
	
}
