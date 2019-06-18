package java_20190617.echoclient_nd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient_nd {
	private String ip;
	private int port;
	private Socket socket;

	public EchoClient_nd(String ip, int port) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		this.port = port;

		try {

			socket = new Socket(ip, port);

			OutputStream out = null;

			OutputStreamWriter osw = null;
			BufferedWriter bw = null;

			InputStream in = null;
			InputStreamReader isr = null;
			BufferedReader br = null;

			Scanner scan=new Scanner(System.in);
			while (true) {
				
				
				
				out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);

				bw.write(scan.next());
				
				bw.newLine();
				bw.flush();

				in = socket.getInputStream();
				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);

			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoClient_nd("127.0.0.1", 3002);

	}
}
