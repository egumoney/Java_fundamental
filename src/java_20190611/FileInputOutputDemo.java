package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		try {
			
			//FileInputStream�� c:\\down\\jdk.exe ��ο� ������ ������ 
			//FileNotFoundException ���ܸ� �߻���Ų��.
			
			FileInputStream fin = new FileInputStream("c:\\down\\Git-2.21.0-64-bit-j.exe");
			//FileOutputStream�� C:\\down\\2019\\06\\11\\���ϸ�.exe
			//���� ��ο� ���丮�� ������ ���丮 �� ������ �����غ���. 
			
			
			FileOutputStream fos= new FileOutputStream("C:\\down\\2019\\06\\Git-2.21.0-64-bit-j.exe");			
			int readByte=0;
			/*int readByteCnt=0;
			byte[]b=new byte[10240];
			while((readByteCnt = fin.read(b))!=-1){
				fos.write(readByteCnt);//����� S.O.P�� �ϸ� ������ ���� . 
			}
			*/
			
			//fin.read() �޼���� �� ����Ʈ�� �д´�. ���� �� �̻� ���� ����Ʈ�� ������ -1 ��ȯ 
			
			while((readByte = fin.read())!=-1){//�� byte�� �о ���� ����Ʈ�� �����Ѵ� 
				//fos.writer(readByte) �޼���� �� ����Ʈ�� ��
				
				fos.write(readByte);//����� S.O.P�� �ϸ� ������ ���� . 
				
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
