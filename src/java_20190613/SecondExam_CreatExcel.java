package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SecondExam_CreatExcel{
	public static void main(String[] args) {
		 HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
	        HSSFSheet sheet = workbook.createSheet("bitcoin"); // �� ��Ʈ(Sheet) ����
		 
		 
	        HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
	        HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
	        cell.setCellValue("�׽�Ʈ ������23121"); //������ ���� ������ ����
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
