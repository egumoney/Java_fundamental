package java_20190618.unicastclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class UnicastClientThread implements Runnable {
	private Socket socket;

	public UnicastClientThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		boolean isStop = false;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			InputStream in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(in));

			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

		} catch (IOException e) {
			e.printStackTrace();
		}
		while (isStop) {
			try {
				String readLine = br.readLine();
				System.out.println(readLine);

				pw.println(readLine);// 프린트라이트에서 println을 사용하면 개행 됨 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
