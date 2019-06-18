package java_20190617.echoclient;

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

import javafx.scene.transform.Scale;

public class EchoClient {

	private String ip;
	private int port;
	private Socket socket;

	public EchoClient(String ip, int port) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		this.port = port;
		try {
			// 3.4. Socket 객체를 생성한다.
			socket = new Socket(ip, port);
			// 7.서버와 통신 할 수 있는 SOcket 객체 생성

			System.out.println("클라이언트가 접속되었습니다. ip:" + ip);

			// 8.서버와 통신 할 수 있는 in,out 스트림 발생
			/*
			 * //단발성 OutputStream out= socket.getOutputStream();
			 * OutputStreamWriter osw= new OutputStreamWriter(out);
			 * BufferedWriter bw= new BufferedWriter(osw); bw.write("  "); //개행을
			 * 하려면 newline 혹은 끝에 \n bw.newLine(); //여기서 끝이 나면 버퍼가 안차서 안보내진다.
			 * bw.flush();
			 * 
			 * InputStream in = socket.getInputStream(); InputStreamReader isr=
			 * new InputStreamReader(in); BufferedReader br=new
			 * BufferedReader(isr); String readLine=br.readLine();
			 * System.out.println(readLine);
			 * 
			 */

			// 단발성
			OutputStream out = null;

			OutputStreamWriter osw = null;
			BufferedWriter bw = null;


			InputStream in =null;
			InputStreamReader isr =null;
			BufferedReader br = null;
			String readLine =null;
			Scanner scan= new Scanner(System.in);
			while(scan.next().equals("exit")){

				out = socket.getOutputStream();
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				bw.write("  ");
				// 개행을 하려면 newline 혹은 끝에 \n
				bw.newLine();
				// 여기서 끝이 나면 버퍼가 안차서 안보내진다.
				bw.flush();
				in=socket.getInputStream();
				isr=new InputStreamReader(in);
				br=new BufferedReader(isr);
				readLine=br.readLine();
				System.out.println(readLine);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("없는 호스트입니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.159", 3000); // "192.168.0.159"
	}
}
