package java_20190617;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Socket s = null;
		for (int i = 20; i < 200; i++) {
			try {
			
				// ��Ʈ�� ���������� ������ ����� �ִ�. �Ϲ�Sockket
				
				
				
				s = new Socket("183.111.174.34", i);// �ش���Ʈ��
				System.out.println(i + "��ȣ�� ������Դϴ�.");
			} catch (UnknownHostException e) { // �ϳ��� ����ó���ص� �������.
				System.out.println("�ش� ȣ��Ʈ�� �߸��Ǿ����ϴ�. ");
			//	e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(i + "��ȣ�� ������� �ʰ� �ֽ��ϴ�.");
				//e.printStackTrace();
		
			}
			
		}
	}

	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();

	}
}
