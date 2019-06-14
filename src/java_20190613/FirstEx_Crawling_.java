package java_20190613;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FirstEx_Crawling_ {
	public static void main(String[] args) {
		String url="https://coinmarketcap.com/ko/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		Document doc=null;
		try{
			doc=Jsoup.connect(url).get();	
		}catch(IOException e){
			e.printStackTrace();
		}
		Elements elements = doc.select(".col-xs-12.tab-content");
		String title = elements.select("h1").text();
		System.out.println(title); 
		
		Elements liEle =elements.select("tr");
		for(int i=0;i<liEle.size();i++){
			Element temp=liEle.get(i);
			System.out.println(temp.text());
		}		
	}
}
