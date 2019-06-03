package java_20190601;

public class CallByRefereceDemo {
	public static void change(int i,int[] a,String str){
		i = 20;
		a[2]+=3000;	
		str+=  "def";
	}
	
	
	public static void main(String[] args) {
		int i = 10;
		int[] a = {10,20,30,40};
		String tt="abc";
		System.out.println("i: "+i);
		System.out.println(a[2]);
		System.out.println(tt);
		//i는 call by value, a는 call by reference  		
		change(i,a,tt);
		//이 메소드에서 대입한 i는  Value 값을 리턴하지 않는다. 값을 리턴하는게 아니기 때문.  a가 바뀌는 이유는 배열을 넣었기 때문에 레퍼런스(주소)가 넘어가서 값이 변환이 된것. 
		
		System.out.println("i:"+i);	
		System.out.println(a[2]);
		System.out.println(tt); // abc가 나온다. String 클래스는 콜바이 레퍼런스 와 상관없다.   
		
	}
	
	
	
}
