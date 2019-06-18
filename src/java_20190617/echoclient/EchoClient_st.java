package java_20190617.echoclient;
 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
 

public class EchoClient_st {
	private String ip;

	private int port;
	private Socket socket;
	
	public EchoClient_st(String ip,int port) {
		// TODO Auto-generated constructor stub
		this.ip=ip;
		this.port=port;
		
		
		try{
			//3.4Ŭ���̾�Ʈ Socket ��ü�� �����Ѵ�.
			socket = new Socket(ip,port);
			
			//4.5������ TCPĿ�ؼ��� ��������鼭 ����\�� ����Ҽ� �ִ� 
			//socket ��ü�� �����ȴ�
			
			//6.�������� �޼����� ������ 
			OutputStream out= socket.getOutputStream();
			
			//6-1
			OutputStreamWriter osw= new OutputStreamWriter(out);
			BufferedWriter bw =new BufferedWriter(osw);
			bw.write("��ҷ���");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient_st("127.0.0.1",3001);
		
	}
}
