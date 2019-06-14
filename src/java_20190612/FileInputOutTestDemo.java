package java_20190612;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutTestDemo {
	public static void main(String[] args) {
		FileInputStream fin=null;
		FileOutputStream fos=null;
		
		try{
			fin=new FileInputStream("C:\\down\\Git-2.21.0-64-bit-j.exe");
			fos=new FileOutputStream("C:\\down\\06\\Git-2.21.0-64-bit-j.exe");
			
			long start= System.currentTimeMillis();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try{
				if(fin!=null) fin.close();
				if(fos!=null) fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
