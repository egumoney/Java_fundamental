package java_20190613;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SecondExam_CreatExcel{
	public static void main(String[] args) {
		 HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
	        HSSFSheet sheet = workbook.createSheet("bitcoin"); // 새 시트(Sheet) 생성
		 
		 
	        HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
	        HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
	        cell.setCellValue("테스트 데이터23121"); //생성한 셀에 데이터 삽입
	        try {
	            FileOutputStream fileoutputstream = new FileOutputStream("C:\\down\\bitcoin.xlsx");
	            workbook.write(fileoutputstream);
	            fileoutputstream.close();
	            System.out.println("엑셀파일생성성공");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("엑셀파일생성실패");
	        }

 	}
}	
