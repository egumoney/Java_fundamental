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
			// 키보드를 입력을 받음

			is = System.in;
			// 다시말해서 InputStream 사용할때 Source(대상)가 키보드인 경우

			fw = new FileWriter("c:\\down\\temp.txt", true);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);

			// (new 버퍼라이트 (new 파일라이트 (인풋 스트림)))

			boolean isStop = false;

			while (!isStop) {

				is = System.in;
				ir = new InputStreamReader(is);
				// 1바이트 입력 스트림을 2바이트 입력 스팀을 변환
				br = new BufferedReader(ir);
				System.out.println("입력하세요>");
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
