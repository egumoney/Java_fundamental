package java_20190613;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
 

public class NaverCaptcha {
	public String getKey() {
		StringBuffer response = new StringBuffer();
		String clientId = "jd8Pnv1QvSRcKzXfff5K";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "R_DMRl_tSV";// 애플리케이션 클라이언트 시크릿값";
		try {
			String code = "0"; // 키 발급시 0, 캡차 이미지 비교시 1로 세팅
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return response.toString();
	}

	public boolean isCreateImage(String key) {
		String clientId = "jd8Pnv1QvSRcKzXfff5K";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "R_DMRl_tSV";// 애플리케이션 클라이언트 시크릿값";
		boolean isSuccess = false;

		try {
			// key = "bCkd27c4fJOiBtRn";
			// https://openapi.naver.com/v1/captcha/nkey
			// 호출로 받은 키값
			String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				InputStream is = con.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024];
				// 랜덤한 이름으로 파일 생성
				String tempname = String.valueOf(new Date().getTime());
				File f = new File("c:\\down\\" + tempname + ".jpg");
				// f.createNewFile();

				FileOutputStream fos = new FileOutputStream(f);
				while ((read = is.read(bytes)) != -1) {
					fos.write(bytes, 0, read);
				}
				is.close();
				fos.close();
				isSuccess = true;

			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = br.readLine()) != null) {
					response.append(inputLine);
				}
				br.close();
				// System.out.println(response.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isSuccess;

	}

	public String getResult(String key, String value) {

		StringBuffer response = new StringBuffer();
		String clientId = "jd8Pnv1QvSRcKzXfff5K";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "R_DMRl_tSV";// 애플리케이션 클라이언트 시크릿값";
		try {
			String code = "1"; // 키 발급시 0, 캡차 이미지 비교시 1로 세팅
			String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code + "&key=" + key + "&value="
					+ value;

			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return response.toString();
	}

	public static void main(String[] args) {
		NaverCaptcha n = new NaverCaptcha();
/*		String keyJson = n.getKey();
		// key.

		JSONObject obj = new JSONObject(keyJson);
		String pageName = obj.getJSONObject(keyJson).getString("value");
		
		
		
		*/
  
		
		String key = n.getKey();
		
		//JSONPa
		
		
		/*
		System.out.println(key);
		if(n.isCreateImage(key)){
			System.out.println("이미지 생성 성공");
		}else{
			System.out.println("이미지 생성 실패");
		}
		*/
		String value= "639c";
		String result=n.getResult(key, value);
		System.out.println(result);
		
		
	}

}
