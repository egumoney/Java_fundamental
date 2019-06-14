package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class BufferedInputOutputDemo {
	
	public static void main(String[] args) {
		FileInputStream fis= null;		
		BufferedInputStream bis=null;
		FileOutputStream fos= null;
		BufferedOutputStream bos= null;
		 
		
		try {
			fis=new FileInputStream("C:\\down\\Git-2.21.0-64-bit-j.exe");
			bis=new BufferedInputStream(fis);		
			fos=new FileOutputStream("C:\\down\\06\\Git-2.21.0-64-bit-j.exe");
			bos=new BufferedOutputStream(fos);
		 	int readByteCount=0;
			byte[] readBytes= new byte[2014];
			while((readByteCount= bis.read(readBytes))!=-1){
				bos.write(readBytes,0,readByteCount);			
			}

			//버퍼공간이 다 차있지 않더라도 버퍼공간을 비워주는 역활
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try{
				if(fis!=null)fis.close();
				if(bis!=null)bis.close();
				if(fos!=null)fos.close();
				if(bos!=null)bos.close();
				 
			}catch(IOException e2){
				e2.printStackTrace();
			}
		}
		
	}
}
