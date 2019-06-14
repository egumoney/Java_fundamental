package java_20190612;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr= null;
		BufferedReader br=null;
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try{
			fr=new FileReader("c:\\down\\HelloWorld.java");
			br=new BufferedReader(fr);
			fw=new FileWriter("c:\\down\\2019\\HelloWorld.java");
			bw=new BufferedWriter(fw);
			String readLine=null;
			while((readLine=br.readLine())!=null){
				// br.readLine()은 개행이 포함되어 있지않을 한줄을 변환한다.
				bw.write(readLine);
				 
			}
			bw.flush();
		}catch(IOException e){
			e.printStackTrace();
			
			
		}finally {
			try{
				if(fr!=null)fr.close();
				if(br!=null)br.close();
				if(fw!=null)fw.close();
				if(bw!=null)bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
