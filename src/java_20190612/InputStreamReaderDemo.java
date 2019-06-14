package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) {

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			// Ű���带 �Է��� ����

			is = System.in;
			// �ٽø��ؼ� InputStream ����Ҷ� Source(���)�� Ű������ ���

			fw = new FileWriter("c:\\down\\temp.txt", true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);

			// (new ���۶���Ʈ (new ���϶���Ʈ (��ǲ ��Ʈ��)))

			boolean isStop = false;

			while (!isStop) {

				is = System.in;
				ir = new InputStreamReader(is);
				// 1����Ʈ �Է� ��Ʈ���� 2����Ʈ �Է� ������ ��ȯ
				br = new BufferedReader(ir);
				System.out.println("�Է��ϼ���>");
				String readLine = br.readLine();
				if (readLine.equals("exit")) {
					isStop = true;
				} else {
					pw.println(readLine);

				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (ir != null)
					ir.close();
				if (br != null)
					br.close();
				if (fw != null)
					fw.close();
				if (bw != null)
					bw.close();
				if (pw != null)
					pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
