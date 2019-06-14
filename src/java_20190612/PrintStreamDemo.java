package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	
	public static void main(String[] args) {
		
		FileInputStream fis= null;		
		BufferedInputStream bis=null;
		FileOutputStream fos= null;
		BufferedOutputStream bos= null;
		PrintStream ps= null;
		
		
		try {
			fis=new FileInputStream("C:\\down\\Git-2.21.0-64-bit-j.exe");
			//stream chainning
			bis=new BufferedInputStream(fis);		
			
			
			fos=new FileOutputStream("C:\\down\\Git-2.21.0-64-bit-j.exe");
			//stream chainning
			bos=new BufferedOutputStream(fos);
			
			ps=new PrintStream(bos,true);// true=> autoFlush  버퍼가 차지않아도 실행 개발자의 실수를 줄여줌			
			int readByteCount=0;
			byte[] readBytes= new byte[2014];
			while((readByteCount= bis.read(readBytes))!=-1){
				ps.write(readBytes,0,readByteCount);			
			}
			
			//PrintStream의 목적지를 모니터
			PrintStream ps1= System.out;// 모니터와 연결 되어있다.
			ps1.println(1);
			ps1.println("aaaa");
			ps1.println(42.5);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try{
				if(fis!=null)fis.close();
				if(bis!=null)bis.close();
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
				if(ps!=null)ps.close();
				
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
