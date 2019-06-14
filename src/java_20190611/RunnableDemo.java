package java_20190611;

public class RunnableDemo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		String threadName = Thread.currentThread().getName();

		System.out.println(" --------------------"+threadName+ " start --------------------");
		for (int i = 0; i < 100; i++) {
			System.out.println(threadName + ": " + i);
		}
		System.out.println(" --------------------"+threadName+ " End --------------------");
	}

	public static void main(String[] args) {
		System.out.println();
		RunnableDemo r1 = new RunnableDemo();
		
		Thread t1 = new Thread(r1, "first Thread");
		System.out.println("첫번째 쓰레드 우선순위: " +t1.getPriority());
		
		
		RunnableDemo r2 = new RunnableDemo();
		
		Thread t2 = new Thread(r2, "second Thread");

		System.out.println("두번째 쓰레드 우선순위: " +t2.getPriority());

		t1.setPriority(Thread.MIN_PRIORITY);

		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("첫번째 쓰레드 우선순위: " +t1.getPriority());

		System.out.println("두번째 쓰레드 우선순위: " +t2.getPriority());
		t1.start();
		
		t2.start();

		
	}
}
