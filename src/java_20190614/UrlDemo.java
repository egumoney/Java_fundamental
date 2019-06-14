package java_20190614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://m.sports.naver.com/kfootball/news/read.nhn?oid=468&aid=0000520538");
		String protocol = url.getProtocol();
		String host = url.getHost();

		int port = url.getPort();

		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		PrintWriter pw = null;

		System.out.println("protocol" + protocol);
		System.out.println("host" + host);
		System.out.println("port" + port);
		System.out.println("path" + path);
		System.out.println("query" + query);
		System.out.println("ref:" + ref);

		InputStream in = url.openStream();
		InputStreamReader ir = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(ir);
		// BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(arg0));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter());
		// pw = new PrintWriter("c:\\down\\n.html", "UTF-8");

		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		} 
		
	}
}
