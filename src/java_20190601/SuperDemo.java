package java_20190601;
import java.lang.*;
/*
 * // 이 코드를 입력하면 에러 난다 . 숨겨진 슈퍼를 집어넣으면 결과가 보인다 A 클래스에서의  디폴트 생성자가 없기 때문에

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
		//super(); // 가 숨어있다.
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