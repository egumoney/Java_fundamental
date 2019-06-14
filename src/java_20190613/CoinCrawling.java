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

public class CoinCrawling {
	public static void main(String[] args) {
		String url = "";
		Document doc = null;
		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
		HSSFSheet sheet = workbook.createSheet("bitcoin"); // �� ��Ʈ(Sheet) ����

		HSSFRow row = null;
		HSSFCell cell = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// headElements�� Ÿ��Ʋ ���� �������� ���� Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");

		// bodyElements�� �ǵ����� ������ �������� ���� Elements
		Elements bodyElements = doc.select(".table-responsive .table thead tr");

		for (int i = 0; i < headElements.size(); i++) {

			row = sheet.createRow(0); // ������ ���� 0������ ����
			Element e = (Element) headElements.get(i);// </tr>

			String date = e.child(0).text();// e.child(0) = > <th>
			cell = row.createCell(0);

			cell.setCellValue(date);

			String open = e.child(1).text();//
			cell = row.createCell(1);

			cell.setCellValue(open);

			String high = e.child(2).text();
			cell = row.createCell(2);

			cell.setCellValue(high);

			String low = e.child(3).text();
			cell = row.createCell(3);

			cell.setCellValue(low);

			String close = e.child(4).text();
			cell = row.createCell(4);

			cell.setCellValue(close);
			String volume = e.child(5).text();
			cell = row.createCell(5);

			cell.setCellValue(volume);

			String marketCap = e.child(6).text();
			cell = row.createCell(6);
			cell.setCellValue(marketCap);

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", date, open, high, low, close, volume, marketCap);
		}

		int rowIndex = 0;

		for (int i = 0; i < bodyElements.size(); i++) {

			row = sheet.createRow(rowIndex++); // ������ ���� 0������ ����
			Element e = (Element) bodyElements.get(i);// </tr>

			String date = e.child(0).text();// e.child(0) = > <th>
			cell = row.createCell(0);
			cell.setCellValue(date);

			String open = e.child(1).text();//
			cell = row.createCell(1);
			cell.setCellValue(open);

			String high = e.child(2).text();
			cell = row.createCell(2);
			cell.setCellValue(high);

			String low = e.child(3).text();
			cell = row.createCell(3);
			cell.setCellValue(low);

			String close = e.child(4).text();
			cell = row.createCell(4);
			cell.setCellValue(close);

			String volume = e.child(5).text();
			cell = row.createCell(5);
			cell.setCellValue(volume);

			String marketCap = e.child(6).text();
			cell = row.createCell(6);
			cell.setCellValue(marketCap);

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", date, open, high, low, close, volume, marketCap);
		}

		try {
			FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\bitcoin.xlsx");
			workbook.write(fileoutputstream);
			fileoutputstream.close();
			System.out.println("�������ϻ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������ϻ�������");
		}

	}
}
