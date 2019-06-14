package java_20190613;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsCrawling {
	public static void main(String[] args) {
		/*
		String url="https://sports.news.naver.com/kfootball/index.nhn";
		Document doc=null;
		try{
			doc=Jsoup.connect(url).get();	
		}catch(IOException e){
			e.printStackTrace();
		}
		Elements elements = doc.select(".home_news");
		String title = elements.select("h2").text().substring(0, 4);//처음부터 4글자 
		System.out.println(title);		
//		Elements element =elements.select("li");
		//System.out.println(element.text());
		for(Element temp:element.select("li")){
			System.out.println(temp.text());
		}
		*/
		String url="http://www.imbc.com/";
		Document doc=null;
		try{
			doc=Jsoup.connect(url).get();	
		}catch(IOException e){
			e.printStackTrace();
		}
		Elements elements = doc.select(".con-wrap.notice-wrap");
		String title = elements.select("h3").text();//처음부터 4글자 
		System.out.println(title); 
		
		Elements liEle =elements.select("li");
		for(int i=0;i<liEle.size();i++){
			Element temp=liEle.get(i);
			System.out.println(temp.text());
		}		
		/*
		for(Element temp:elements.select("li")){
			System.out.println(temp.text());
		}*/
	}
}
