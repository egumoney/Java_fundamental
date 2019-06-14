package java_20190611;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;

	@Override
	public void run() { // TODO Auto-generated method stub for (

		synchronized (this) {
			for (int i = 0; i < 20; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x: %d , y: %d >> %s>>%d��°\t ", x, y, threadName, i);
				System.out.println();
			}	
		}	
		
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1, "first");
		Thread t2 = new Thread(s1, "second");
		t1.start();
		t2.start();

	}
	// synchronized void run()  �� ���� �̺κ��� ������������ �������� �Ѵ�.  �� ���� ��ü�� ����Ҷ���
	
	
	
/*
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			String threadName = Thread.currentThread().getName();
			// if(threadName.toString().equals("first")) x += 1;
			// if(threadName.toString().equals("second"))y += 1;
			x++;
			y++;

			System.out.print("x: " + x + " , y: " + y + " >> " + threadName + ">>" + i + "��°\t ");
			System.out.println();
		}
	}
	*/

}
