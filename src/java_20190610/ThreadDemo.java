package java_20190610;

public class ThreadDemo extends Thread{
	public ThreadDemo(String msg){
		super(msg);// 쓰레드 클래스의 오버로딩을 활용한 문자열을 매개변수로 받는 생성자를 활용(쓰레드 이름을 정해줌)
		
	}
	
	@Override
	public void run() {

		String threadName= Thread.currentThread().getName();
		System.out.println("******************"+threadName+" : start ******************");
		for (int i = 0; i < 10; i++) {// TODO Auto-generated method stub	
			System.out.println(threadName+" : "+i);
		}		
		System.out.println("******************"+threadName+" : end ******************");
	}

	/*
	   public void run2() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			String threadName= Thread.currentThread().getName();
			
			System.out.println(threadName+" : "+i);
		}
	}
	*/
	public static void main(String[] args) {
		System.out.println("-------------------------Main Start-------------------------");
		ThreadDemo t1=new ThreadDemo("first Thread");
		t1.start();//쓰레드 객체.start(); 하여야 가능 하다.
		//t1.run2();
		
		ThreadDemo t2=new ThreadDemo("second Thread");
		t2.start();
		//t1.run2();
		
		System.out.println("-------------------------Main End-------------------------");
	}
	
	
}
