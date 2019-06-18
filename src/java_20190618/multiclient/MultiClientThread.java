package java_20190618.multiclient;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JTextArea;

public class MultiClientThread implements Runnable {

	private BufferedReader br;
	private JTextArea jta;

	public MultiClientThread(BufferedReader br, JTextArea jta) {
		this.br = br;
		this.jta = jta;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop = false;
		while (!isStop) {
			String readLine = null;
			try {
				readLine = br.readLine();
				readLine += System.getProperty("line.separator");
				jta.append(readLine);
				
				jta.setCaretPosition(jta.getDocument().getLength());
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				isStop =true;
				
			}
		}
	}

}
