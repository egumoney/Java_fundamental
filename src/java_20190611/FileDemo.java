package java_20190611;

import java.io.File;
import java.util.Calendar;
 
/*
 //���� ���������� Calendar�� ���ļ� �׷���.
abstract class Calendar;
	public static Calendar getInstance(){
		return new GregorianCalendar();
	}
}
class GregorianCalendar extends Calendar{
	
}
*/
public class FileDemo {
	public boolean mkdir(String path) {
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			isSuccess = f1.mkdirs();// mkdirs�� ���̸� �ٸ�������� s�� ���� �ϳ��� ���������.

			System.out.println("���丮 ����� ����");

		} else {
			System.err.println("���丮 ����� ����");
		}

		return isSuccess;
	}

	public String getComma(int number) {
		return String.format("%,d", number);
	}

	public String getComma(double number) {
		return String.format("%,f", number);
	}

	public String getComma(double number, int precision) {
		return String.format("%,." + precision + "f", number);
	}
	
	public void changeFile(String path){
		//c:\down\aa.zip
		
		File f1= new File(path);
		String fileName= f1.getName();//aa.zip
		 
		 String name = fileName.substring(0, fileName.lastIndexOf("."));//aa
		
		 String extendsion= fileName.substring(fileName.lastIndexOf("."));
		 name= String.valueOf(System.currentTimeMillis());//123123
		 name = name +extendsion;//123123.zip
		
		 String parent= f1.getParent();
		 File f2= new File(parent,name);//parent=>c:\down name 123123.zip
		 f1.renameTo(f2);
	}

	public static void main(String[] args) {
		// ���丮 �����
		//c:down\a
		 
		FileDemo f = new FileDemo();
		// f.mkdir("c:\\down\\2019\\06\\11" );
		File f1 = new File("c:\\down\\Git-2.21.0-64-bit-j.exe");
		// File f1= new File("c:\\down\\Git-2.21.0-64-bit");

		long fileSize = f1.length();
		// System.out.printf("%,d",Math.round((double)fileSize/1024));
		String fileLength = String.format("%,d", Math.round((double) fileSize / (double) 1024));// printf��
																								// ����.
		System.out.println(fileLength + "KB"); // ������ �о����

		/*
		 * File f2= new File("c:\\down","Git-2.21.0-64-bit-j.exe");
		 * f1.renameTo(f2);
		 */
		f.changeFile("C:\\down\\2019\\06\\11\\jdk.exe");
		File f2=new File("c:\\down\\2019\\06\\11\\ ");
		f2.delete();
		
		File f3 = new File("c:\\");
		String[] list =f3.list();
		
		
		
		
		for(String value: list){
			File f4=new File(f3,value);
			if(f4.isDirectory()){
				System.out.println(value +"-���丮");
			}else if(f4.isFile()){
				
				long size= f4.length();
				System.out.println(value+"-����("+size+")");
			} 
		}
		
		Calendar c= Calendar.getInstance();
		//c.setTimeInMillis(millis);
		c.set(2019, 5,10);
	//	c.setTimeInMillis(lastModified);
		
		int year= c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DATE);
		
		System.out.println(year+"��"+month+"��"+day+"��");
		int dayOfWeek= c.get(Calendar.DAY_OF_WEEK);
		
		switch (dayOfWeek) {
			case Calendar.MONDAY:System.out.println("������ �Դϴ�");break; 
			case Calendar.TUESDAY:System.out.println("ȭ���� �Դϴ�");break; 
			case Calendar.WEDNESDAY:System.out.println("������ �Դϴ�");break; 
			case Calendar.THURSDAY:System.out.println("����� �Դϴ�");break; 
			case Calendar.FRIDAY:System.out.println("�ݿ��� �Դϴ�");break;  
			case Calendar.SATURDAY:System.out.println("����� �Դϴ�");break; 
			case Calendar.SUNDAY:System.out.println("�Ͽ��� �Դϴ�");break; 
			default:break;
		}		
		System.err.println(Calendar.SUNDAY);
		
		
		
		/*
 		String fileName = f1.getName();
		String path = f1.getParent();
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		// String extension= fileName.substring(fileName.lastIndexOf(".")+1);//
		// name=name+"."+extension;
		String extension = fileName.substring(fileName.lastIndexOf("."));
		name = String.valueOf(System.currentTimeMillis());
		name = name + extension;
		System.out.println(name);
		System.out.println(f1.getParent());//
		String parent= f1.getParent();
		f.changeFile("");	
*/
/*
 		System.out.println(path);
		System.out.println(fileName);
		System.out.println(name);*/
		
	}

}
