package java_20190614;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling_Upgrade {
	private String getKoreanDate(String date) {
		String koreanDate = null;
		SimpleDateFormat from = new SimpleDateFormat("MMM DD, yyyy", Locale.US);
		SimpleDateFormat to = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREAN);
		try {
			java.util.Date d = from.parse(date);
			koreanDate = to.format(d);
		} catch (ParseException e) {
			e.printStackTrace();

		}
		return koreanDate;
	}

	public void execute(String sheetName, String coinName, String startDate, String endDate) {

		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
		HSSFSheet sheet = workbook.createSheet(sheetName); // 새 시트(Sheet) 생성
		HSSFRow row = null;
		HSSFCell cell = null;
		String url = "https://coinmarketcap.com/ko/currencies/" + coinName
				+ "/historical-data/?start=20180613&end=20190613";
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int rowIndex = 0;
		// headElements는 타이틀 정보 가져오기 위한 Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");

		// bodyElements는 실데이터 정보를 가져오기 위한 Elements
		Elements bodyElements = doc.select(".table-responsive .table thead tr");

		for (int i = 0; i < bodyElements.size(); i++) {

			row = sheet.createRow(rowIndex++);
			Element e = (Element) bodyElements.get(i);// </tr>

			String date = e.child(0).text();
			cell = row.createCell(0);
			cell.setCellValue(Double.parseDouble(date));

			String open = e.child(1).text();
			cell = row.createCell(1);
			cell.setCellValue(Double.parseDouble(open));

			String high = e.child(2).text();
			cell = row.createCell(2);
			cell.setCellValue(Double.parseDouble(high));

			String low = e.child(3).text();
			cell = row.createCell(3);
			cell.setCellValue(Double.parseDouble(low));

			String close = e.child(4).text();
			cell = row.createCell(4);
			cell.setCellValue(Double.parseDouble(close));

			String volume = e.child(5).text();
			volume = volume.replaceAll(",", "");
			cell = row.createCell(5);
			cell.setCellValue(Long.parseLong(volume));// 생생한 셀에 데이터

			String marketCap = e.child(6).text();
			marketCap = marketCap.replace(",", "");
			cell = row.createCell(6);
			cell.setCellValue(Long.parseLong(marketCap));// 생생한 셀에 데이터

			try {
				FileOutputStream fileOutputStream = new FileOutputStream("c:\\down\\");
				workbook.write(fileOutputStream);
				fileOutputStream.close();
				System.out.println("엑셀파일생성성공");
			} catch (IOException e2) {
				e2.printStackTrace();
				System.out.println("엑셀파일생성실패");
			}

		}

	}

	public static void main(String[] args) {
		CoinCrawling_Upgrade c = new CoinCrawling_Upgrade();
		c.execute("비트코인", "bitcoin", c.getKoreanDate("20180614"), c.getKoreanDate("20190614"));// bitcoin
		c.execute("이더리움", "etherium", c.getKoreanDate("20180614"), c.getKoreanDate("20190614"));// bitcoin
		c.execute("리플", "ripple", c.getKoreanDate("20190604"), c.getKoreanDate("20190614"));// bitcoin

	}

}
