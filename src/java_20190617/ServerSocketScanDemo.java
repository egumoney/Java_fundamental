package java_20190617;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketScanDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ServerSocket s = null;
		
		for (int i = 0; i < 65535; i++) {
			try {
				//ServerSocket Ŭ������ �ش� ������ port ��ȣ�� ����Ҽ� ������ 
				//ServerSocket ��ü�� ������ �� �ְ�, ���ܸ� �߻��ϴ� ����
				// �ش� port�� ����ϴ� ����̴�.
				s=new ServerSocket(i);
			//	System.out.println("���� Num:"+ i+"�����Ϸ�");
				
				Socket socket= s.accept();//���� ���ϰ� ����Ҽ� �ֵ��� ����� 
				
				
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(i+"��ȣ�� ����� �� �����ϴ�.");
			}
		} 
	}

	public static void main(String[] args) {
		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();

	}
}
