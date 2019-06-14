package java_20190614;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnecttionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.amazon.com/");
		URLConnection urlCon = url.openConnection();

		String server = urlCon.getHeaderField("Server");
		String cacheControl = urlCon.getHeaderField("Cache-Control");
		String expires = urlCon.getHeaderField("Expires");
		String contentType = urlCon.getHeaderField("Content-Type");
		String location = urlCon.getHeaderField("Location");

		String setCookie = urlCon.getHeaderField("Set-Cookie");
		int len = urlCon.getContentLength();

		System.out.println("Server:" + server);
		System.out.println("cacheControl:" + cacheControl);
		System.out.println("expires:" + expires);
		System.out.println("contentType:" + contentType);
		System.out.println("location:" + location);

		InputStream in = urlCon.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
		FileOutputStream fos = new FileOutputStream("C:\\down\\2019\\t.txt");
		//FileOutputStream fos = new FileOutputStream("C:\\down\\2019\\t.html", true);// 여기서 True를 쓰면 이어쓰기 프린트 에서는 플러쉬 
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		String readLine = null;

		while ((readLine = br.readLine()) != null) {
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();

	}
}
