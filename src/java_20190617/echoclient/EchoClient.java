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
			// 3.4. Socket ��ü�� �����Ѵ�.
			socket = new Socket(ip, port);
			// 7.������ ��� �� �� �ִ� SOcket ��ü ����

			System.out.println("Ŭ���̾�Ʈ�� ���ӵǾ����ϴ�. ip:" + ip);

			// 8.������ ��� �� �� �ִ� in,out ��Ʈ�� �߻�
			/*
			 * //�ܹ߼� OutputStream out= socket.getOutputStream();
			 * OutputStreamWriter osw= new OutputStreamWriter(out);
			 * BufferedWriter bw= new BufferedWriter(osw); bw.write("  "); //������
			 * �Ϸ��� newline Ȥ�� ���� \n bw.newLine(); //���⼭ ���� ���� ���۰� ������ �Ⱥ�������.
			 * bw.flush();
			 * 
			 * InputStream in = socket.getInputStream(); InputStreamReader isr=
			 * new InputStreamReader(in); BufferedReader br=new
			 * BufferedReader(isr); String readLine=br.readLine();
			 * System.out.println(readLine);
			 * 
			 */

			// �ܹ߼�
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
				// ������ �Ϸ��� newline Ȥ�� ���� \n
				bw.newLine();
				// ���⼭ ���� ���� ���۰� ������ �Ⱥ�������.
				bw.flush();
				in=socket.getInputStream();
				isr=new InputStreamReader(in);
				br=new BufferedReader(isr);
				readLine=br.readLine();
				System.out.println(readLine);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ȣ��Ʈ�Դϴ�.");
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
