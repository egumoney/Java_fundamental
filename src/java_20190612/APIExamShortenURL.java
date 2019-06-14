package java_20190612;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIExamShortenURL {
	public String getShortenUrl(String id, String secret, String u) {
		String clientId = id;// ���ø����̼� Ŭ���̾�Ʈ ���̵�";
		String clientSecret = secret;// ���ø����̼� Ŭ���̾�Ʈ ��ũ����";

		StringBuffer response = new StringBuffer();
		try {
			String text = u;
			String apiURL = "https://openapi.naver.com/v1/util/shorturl?url=" + text;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // ���� ȣ��
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // ���� �߻�
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			//System.out.println(response.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return response.toString();
	}

	public static void main(String[] args) {
		String clientId = "FEprv74x371PKKuxh_CM";// ���ø����̼� Ŭ���̾�Ʈ ���̵�";
		String clientSecret = "pomcVN8G8k";// ���ø����̼� Ŭ���̾�Ʈ ��ũ����";
	
		APIExamShortenURL a =new APIExamShortenURL();
		String surl = a.getShortenUrl(
				clientId, clientSecret,"https://www.naver.com");
		System.out.println(surl);
	}
}