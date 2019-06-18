package java_20190617.echoServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress; 
import java.net.ServerSocket;
import java.net.Socket;
 

public class EchoServer_st {
	private int port;
	private ServerSocket serverSocket;
	
	
	public EchoServer_st(int port) {
		// TODO Auto-generated constructor stub
		this.port=port;
		
		try {
			//1 ServerSocket ��ü�� �����Ѵ�.
			serverSocket=new ServerSocket(port);
			
			
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.");
			//2 ServerSocket�� Accept() �޼ҵ�� Ŭ���̾�Ʈ ������ ��� �Ѵ�
			
			Socket socket=serverSocket.accept();
			InetAddress ia= socket.getInetAddress();
			String ip=ia.getHostAddress();
			System.out.println(ip+"�����߽��ϴ�.");
			
			//4.5 Ŭ���̾�Ʈ�� TCP Ŀ�ؼ��� ��������鼭 Ŭ���̾�Ʈ�� ����Ҽ� �ִ� 
			//Socket��ü�� �����ȴ�.
			
			
			//7Ŭ���̾�Ʈ�� ���� �޽����� �޴´�.
			InputStream in= socket.getInputStream();
			
			
			//7-1
			InputStreamReader isr= new InputStreamReader(in);
			BufferedReader br= new BufferedReader(isr);
			String readLine=br.readLine();
			System.out.println(readLine);
			
			//8.���� �޼����� Ŭ���̾�Ʈ���� �ٽ� ������.
			OutputStream out= socket.getOutputStream();
			
			//8-1
			OutputStreamWriter osw= new OutputStreamWriter(out);
			BufferedWriter bw= new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public static void main(String[] args) {
		new EchoServer_st(3001);
	}
}
