package java_20190604;

public class ImplementClass implements InterB,InterC{
	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementsClass - mB()");
	}

	@Override //������̼� ���� �ϸ� ��ü �޼ҵ尡 �ȴ� . 
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass -mC()");
		
	}
 
	public static void main(String[] args) {
		InterB b =new ImplementClass();
		//InterB b=new InterB() ;	// �� �ҽ��� �ȵȴ�. ���� ������ Ŭ������ ������ �ʿ� �ϴ�
		b.mB();
		
		InterC c= new ImplementClass();
		c.mC();		
	}
	
	
	
}
