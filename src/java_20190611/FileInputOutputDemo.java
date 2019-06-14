package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		try {
			
			//FileInputStream의 c:\\down\\jdk.exe 경로에 파일이 없으면 
			//FileNotFoundException 예외를 발생시킨다.
			
			FileInputStream fin = new FileInputStream("c:\\down\\Git-2.21.0-64-bit-j.exe");
			//FileOutputStream은 C:\\down\\2019\\06\\11\\파일명.exe
			//위의 경로와 디렉토리가 없으면 디렉토리 및 파일을 생성해본다. 
			
			
			FileOutputStream fos= new FileOutputStream("C:\\down\\2019\\06\\Git-2.21.0-64-bit-j.exe");			
			int readByte=0;
			/*int readByteCnt=0;
			byte[]b=new byte[10240];
			while((readByteCnt = fin.read(b))!=-1){
				fos.write(readByteCnt);//여기다 S.O.P를 하면 에러가 난다 . 
			}
			*/
			
			//fin.read() 메서드는 현 바이트씩 읽는다. 만약 더 이상 읽을 바이트가 없으면 -1 반환 
			
			while((readByte = fin.read())!=-1){//한 byte를 읽어서 읽은 바이트를 저장한다 
				//fos.writer(readByte) 메서드는 한 바이트씩 씀
				
				fos.write(readByte);//여기다 S.O.P를 하면 에러가 난다 . 
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	}
}
