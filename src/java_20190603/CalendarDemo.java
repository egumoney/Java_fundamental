package java_20190603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	
	
	public static String console() throws IOException{
		//Ű����� �Է¹��� ������ ��ȯ�ϴ� �Լ�
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args)  throws IOException{
		Calendar c= null;
		
		
		while(true){
			System.out.println("��¥�� �Է��ϼ���>");
			String readLine = console(); 
			if(readLine.equals("bye"))break; 
			System.out.println("���� �о���"+readLine);
			
		
			
			//split(" ") ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
			String[] data=readLine.split(" ");
			c=new Calendar();
			//data.length �迭�� ���� 
 
			int year=Integer.parseInt(data[0]);
			int month=Integer.parseInt(data[1]);
			int day=Integer.parseInt(data[2]);

			
			if(data.length==1){
				//year = 2019
				//Integer.parseInt("2019")=>2019
				//Integer.parseInt() �޼ҵ�� ���ڿ��� int�� ��ȯ�ϴ� �޼��� 
				
				c.print(year);
			
			}else if(data.length==2){
				 
				c.print(year,month);
			
			}else if(data.length==3){
				
				
				c.print(year,month,day);
				
			}			
			
		}
	}
	
	
	
	
	
}
