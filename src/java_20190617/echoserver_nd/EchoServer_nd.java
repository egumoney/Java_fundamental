package java_20190617.echoserver_nd;

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

public class EchoServer_nd {
	private int port;
	private ServerSocket serverSocket;
	private Socket socket;
	public EchoServer_nd(int port) {
		// TODO Auto-generated constructor stub

		this.port = port;

		try {
			serverSocket = new ServerSocket(port);

			System.out.println("클라이언트 접속을 기다리고 있습니다.");
			
			 socket=serverSocket.accept();
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();

			System.out.println(ip + "접속했습니다.");

			InputStream in = null;

			// 7-1
			InputStreamReader isr = null;
			BufferedReader br = null;
			String readLine = null;

			System.out.println(readLine);

			// 8.받은 메세지를 클라이언트에게 다시 보낸다.
			OutputStream out = null;

			// 8-1
			OutputStreamWriter osw = null;
			BufferedWriter bw = null;

			while (true) {
				in = socket.getInputStream();
				isr = new InputStreamReader(in);

				br = new BufferedReader(isr);
				readLine = br.readLine();

				out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new EchoServer_nd(3002);
	}
}
