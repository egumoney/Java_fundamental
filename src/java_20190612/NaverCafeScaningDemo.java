package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class NaverCafeScaningDemo {

	public static void main(String[] args) {

		InputStreamReader ir = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		InputStream in = null;

		try {

			URL url = new URL("https://blog.naver.com/cheekemo/221284741323");
			in = url.openStream();
			ir = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(ir);

			fw = new FileWriter("C:\\down\\er.html");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				pw.println(readLine);
			}
		} catch (MalformedInputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)	in.close();
				if (ir != null)	ir.close();
				if (br != null)	br.close();
				if (fw != null)	fw.close();
				if (bw != null)	bw.close();
				if (pw != null)	pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
