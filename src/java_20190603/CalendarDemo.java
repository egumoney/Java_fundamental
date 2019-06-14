package java_20190603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	
	
	public static String console() throws IOException{
		//키보드로 입력받은 한줄을 반환하는 함수
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args)  throws IOException{
		Calendar c= null;
		
		
		while(true){
			System.out.println("날짜를 입력하세요>");
			String readLine = console(); 
			if(readLine.equals("bye"))break; 
			System.out.println("한줄 읽었다"+readLine);
			
		
			
			//split(" ") 공백문자로 문자열을 분리해서 배열로 반환
			String[] data=readLine.split(" ");
			c=new Calendar();
			//data.length 배열의 길이 
 
			int year=Integer.parseInt(data[0]);
			int month=Integer.parseInt(data[1]);
			int day=Integer.parseInt(data[2]);

			
			if(data.length==1){
				//year = 2019
				//Integer.parseInt("2019")=>2019
				//Integer.parseInt() 메소드는 문자열을 int로 변환하는 메서드 
				
				c.print(year);
			
			}else if(data.length==2){
				 
				c.print(year,month);
			
			}else if(data.length==3){
				
				
				c.print(year,month,day);
				
			}			
			
		}
	}
	
	
	
	
	
}
