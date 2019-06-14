package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawlingSelfMake {
	public static void isSearch(String coin) { 
		
		
		String url = "https://coinmarketcap.com/ko/currencies/" + coin
				+ "/historical-data/?start=20180613&end=20190613";
		Document doc = null;
		// 값입

		
		try {

			doc = Jsoup.connect(url).get();//

			Elements elements = doc.select(".col-xs-12.tab-content");
			String title = elements.select("h1").text();

			Elements liEle =elements.select("tr");//tr테이블 설정
			HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
			HSSFSheet sheet = workbook.createSheet(title); // 새 시트(Sheet) 생성

			int rowCount = 0;
			int cellCount = 0;
 
			 
			
			HSSFRow row = null; //sheet.createRow(rowCount); // 엑셀의 행은 0번부터 시작
	        HSSFCell cell =null;// row.createCell(cellCount); // 행의 셀은 0번부터 시작
	       
			/*for(int i=0;i<liEle.size();i++){
				Element temp=liEle.get(i);
				cell.setCellValue(temp.text()); // 생성한 셀에 데이터 삽입			
			}
			*/
			for (Element temp : elements.select("tr")) {
				 
				if (cellCount % 7 == 0) {
					cellCount = 0;
					rowCount++;
				}
				
				cell.setCellValue(temp.text()); // 생성한 셀에 데이터 삽입			
				

			}
			try {
				FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\bitcoin.xlsx");
				workbook.write(fileoutputstream);
				fileoutputstream.close();
				System.out.println("엑셀파일생성성공");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("엑셀파일생성실패");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("엑셀파일생성실패");
		}
		// return isSeachable;
	}

	public static void main(String[] args) {

		String bc = "bitcoin";
		String rp = "ripple";
		String et = "ethereum";

		isSearch(bc);

	}
}
