package java_20190610;

public class ThreadDemo extends Thread{
	public ThreadDemo(String msg){
		super(msg);// ������ Ŭ������ �����ε��� Ȱ���� ���ڿ��� �Ű������� �޴� �����ڸ� Ȱ��(������ �̸��� ������)
		
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
		t1.start();//������ ��ü.start(); �Ͽ��� ���� �ϴ�.
		//t1.run2();
		
		ThreadDemo t2=new ThreadDemo("second Thread");
		t2.start();
		//t1.run2();
		
		System.out.println("-------------------------Main End-------------------------");
	}
	
	
}
