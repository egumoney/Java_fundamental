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
			
				// 포트가 열려있으면 소켓을 만들수 있다. 일반Sockket
				
				
				
				s = new Socket("183.111.174.34", i);// 해당포트로
				System.out.println(i + "번호를 사용중입니다.");
			} catch (UnknownHostException e) { // 하나만 예외처리해도 상관없다.
				System.out.println("해당 호스트가 잘못되었습니다. ");
			//	e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(i + "번호를 사용하지 않고 있습니다.");
				//e.printStackTrace();
		
			}
			
		}
	}

	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();

	}
}
