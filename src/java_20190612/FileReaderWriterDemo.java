package java_20190612;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			fw = new FileWriter("C:\\down\\2019\\06\\HelloWorld.java");
			// 한개의 문자를 읽어서 한개의 문자를 출력하는 예제
/*			
  			int readChar = 0;

			while ((readChar = fr.read()) != -1) {
				System.out.print((char) readChar);
				fw.write(readChar);
			}
			*/
			
			  int readCharCount= 0;
			  char[] readChars= new char[10];
			  while((readCharCount=fr.read(readChars))!=-1){
				  //System.out.print((char)readCharCount);
				  System.out.print(new String(readChars,0,readCharCount));//0 바이트씩 쓴다.	  
				  fw.write(readChars,0,readCharCount);//캐릭터형 문자열로 을 해도 상관없다  
				  
				//fw.write(new String(readChars,0,readCharCount));
			  }
			 
			  
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}

		}
	}
}