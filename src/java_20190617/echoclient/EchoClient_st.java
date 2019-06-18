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
			//3.4클라이언트 Socket 객체를 생성한다.
			socket = new Socket(ip,port);
			
			//4.5서버와 TCP커넥션이 만들어지면서 서버\와 통신할수 있는 
			//socket 갹체가 생성된다
			
			//6.서버에게 메세지를 보낸다 
			OutputStream out= socket.getOutputStream();
			
			//6-1
			OutputStreamWriter osw= new OutputStreamWriter(out);
			BufferedWriter bw =new BufferedWriter(osw);
			bw.write("배불러요");
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
