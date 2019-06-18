package java_20190618.multicastsever;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import javax.print.attribute.standard.Media;

public class MultiServerThread implements Runnable {

	private ArrayList<MultiServerThread> list;
	private PrintWriter pw = null;
	private Socket socket;

	public MultiServerThread(Socket socket, ArrayList<MultiServerThread> list) {
		this.socket = socket;
		// TODO Auto-generated constructor stub
		this.list = list;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop = false;
		BufferedReader br = null;
		pw = null;
		try {
			InputStream in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (!isStop) {
			try {
				String readLine = br.readLine();
				if (readLine != null && readLine.equals("exit")) {
					isStop = true;
					sendMessage("exit");
					list.remove(this);
					System.out.println(readLine);
					System.out.println("list size:"+list.size());
					
				}else{
					broadCast(readLine);
					System.out.println(readLine);
					
				} 
				// pw.println();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				e.printStackTrace();
				
				System.out.println("강제로 나가지 마세요 아직은");
				isStop = true;
				list.remove(this);
				System.out.println("list size:"+list.size());
			}

		}
		try {
			if (br != null)	br.close();
			if (pw != null)	pw.close();
			if (socket != null)	socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void broadCast(String message) {
		for (int i = 0; i < list.size(); i++) {
			MultiServerThread mst = list.get(i);
			mst.sendMessage(message);
		}
	}

	// unicast
	public void sendMessage(String Message) {
		pw.println(Message);// unicast
	}

}
