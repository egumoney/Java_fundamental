package java_20190604;

public class ImplementClass implements InterB,InterC{
	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementsClass - mB()");
	}

	@Override //어노테이션 제외 하면 자체 메소드가 된다 . 
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass -mC()");
		
	}
 
	public static void main(String[] args) {
		InterB b =new ImplementClass();
		//InterB b=new InterB() ;	// 이 소스는 안된다. 실제 구현한 클래스의 도움이 필요 하다
		b.mB();
		
		InterC c= new ImplementClass();
		c.mC();		
	}
	
	
	
}
