package java_20190601;
import java.lang.*;
/*
 * // �� �ڵ带 �Է��ϸ� ���� ���� . ������ ���۸� ��������� ����� ���δ� A Ŭ����������  ����Ʈ �����ڰ� ���� ������

class A{
	String name;
	A(String name){
		this.name=name;
	}
}
class B extends A{    

}
public class SuperDemo {
	
}
*/ 
import java.lang.*;
class A extends Object{
	String name;
	A(String name ){
		//super(); // �� �����ִ�.
		this.name =name;
	}	

	A(){
		super();
	}
	
	
	
}

class B extends A{
	B(){
		super();
	}
}

public class SuperDemo extends Object{
	public SuperDemo(){
		super();
	}
}
	

/*
 import java.lang.*;

class A extends Object{
	A(){
		super();
	}	
}

class B extends A{
	B(){
		super();
	}
}

public class SuperDemo extends Object{
	public SuperDemo(){
		super();
	}
}
 */ 