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
		// ����

		
		try {

			doc = Jsoup.connect(url).get();//

			Elements elements = doc.select(".col-xs-12.tab-content");
			String title = elements.select("h1").text();

			Elements liEle =elements.select("tr");//tr���̺� ����
			HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
			HSSFSheet sheet = workbook.createSheet(title); // �� ��Ʈ(Sheet) ����

			int rowCount = 0;
			int cellCount = 0;
 
			 
			
			HSSFRow row = null; //sheet.createRow(rowCount); // ������ ���� 0������ ����
	        HSSFCell cell =null;// row.createCell(cellCount); // ���� ���� 0������ ����
	       
			/*for(int i=0;i<liEle.size();i++){
				Element temp=liEle.get(i);
				cell.setCellValue(temp.text()); // ������ ���� ������ ����			
			}
			*/
			for (Element temp : elements.select("tr")) {
				 
				if (cellCount % 7 == 0) {
					cellCount = 0;
					rowCount++;
				}
				
				cell.setCellValue(temp.text()); // ������ ���� ������ ����			
				

			}
			try {
				FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\bitcoin.xlsx");
				workbook.write(fileoutputstream);
				fileoutputstream.close();
				System.out.println("�������ϻ�������");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("�������ϻ�������");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������ϻ�������");
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
