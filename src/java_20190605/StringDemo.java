package java_20190605;import javax.print.attribute.standard.PrinterMessageFromOperator;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");

		String str3 = "java";
		String str4 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

		String ssn = "234567-8923456";
		// charAt(int index) �޼���� ���ڿ� �߿��� Ư�� index�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat (String msg) �޼���� ���ڿ� ����
		String temp = ssn.concat("�ȳ��ϼ���");
		System.out.println(temp);

		// endsWith(String temp)
		String fileName = "test.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("�������� �Դϴ�");
		} else if (fileName.endsWith("doc")) {
			System.out.println("office �����Դϴ�");
		} else {
			System.out.println("�����Դϴ�. ");
		}

		// startsWith (String map)�޼���� ���ڿ��� ������ ()���� temp�� ������ true, �ٸ��� false
		String url = "https://www.naver.com/sports";
		String urlWord = "Sports";

		if (url.startsWith(urlWord)) {
			System.out.println("������ �޴��Դϴ�.");
		} else if (url.startsWith("news")) {
			System.out.println("���� �޴��Դϴ�.");
		} else {
			System.out.println("errcode:404 �������� �ʴ� ������ �Դϴ�.");
		}

		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2)); //��ҹ��� ����

		s2 = s2.toLowerCase(); 
		System.out.println(s2); 
		
		String phoneNum="010-2376-8226";
		s1 = s1.toUpperCase();		
		System.out.println(s1);
		System.out.println(ssn.indexOf("-"));
		
		ssn=ssn.replace("-", "*");
		System.err.println(ssn);
		System.out.println(phoneNum.lastIndexOf("-"));//������ ���� ã�� ������ �տ������� ���ڰ����� ����.
		//lastIndexOf �����̸� Ȯ���ڸ� �ٲٱ� ���ؼ� ���δ�. 
			
		String html="�ȳ��ϼ���\n���� �������Դϴ�.\n������ �ߺ�Ź�帳�ϴ�";
		html=html.replaceAll("\n","<br>");
		System.out.println(html);

		fileName="abc.def.ghi.zip";
		
		String ssn1=ssn.substring(0,ssn.indexOf("*"));//6 ���������� �����´�
		String ssn2=ssn.substring(ssn.indexOf("*")+1);// 7���� ������ 
		
		System.out.println(ssn1);
		System.out.println(ssn2);
/*
		String str= String.format("%1$, 20.2f%2$,20.2f%3$,20.2f", 111111);
		System.out.println(str);
*/		

		String fileName1=fileName.substring(0,fileName.lastIndexOf("."));//6 ���������� �����´�
		String fileName2=fileName.substring(fileName.lastIndexOf(".")+1);// 7���� ������ 
		
		System.out.println(fileName1);
		System.out.println(fileName2);		
		
		String exString1="Hello";
		String exString2="Hello "; //�������-����- �� �� �ִ�.
		
		System.out.println(exString1);
		System.out.println(exString2);
		
		if(exString1.equalsIgnoreCase(exString2.trim())){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		
		ssn="234567-8923456";
		System.out.println("������ �����="+ssn);
		String[] t3= ssn.split("-");
		System.err.println(t3[0]);
		System.out.println(t3[1]);
		
		int a =10;
		//String t1= String.valueOf(10);
		String t1= String.valueOf(a); //���� ������ �����ε� �ٵǾ� �ִ�. 
		String t2= ""+a;
		
		System.out.println(t1);
		System.out.println(t2);
		
//		String t4=String.format("%,d", 10000);
		String t4=String.format("%,.2f and %,d", 10000.235545, 200000000);//java 5.0 ���� �ڽ��̳� ���˵�  ������Ʈ�Ǿ���.
		System.out.println(t4);	
		
//		String str= String.format("%1$f ,  %2$f,  %3$f",1111.11,2222.22,3333.33); // 1�� ����ϰ� ������ 1�������´�. �����ϸ� �˾Ƽ� �����´�.
//		"%1$,f  ,  %3$,f  ,  %2$,f "   //  
//	 	"%,20f ,  %,20f,  %,20f"  // 20 �� �ڸ����� �߰��� , �� �����ڷ� 3�ڸ� ���� 
		//flag   %,f  �ڸ����� ä���ش�.
	 	//%n$ �� n ��°�� �༮�� ������ش�.
		String str= String.format("%3$,20.2f ,  %2$,20.2f,  %1$,20.2f",1111.11,2222.22,3333.33); // 20 �� �ڸ����� �߰��� , �� �����ڷ� 3�ڸ� ���� 
		// % , . 2f  //���� �������� ����.
		System.out.println(str);
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d �̰��, b2�� ���� %d �Դϴ�.", b1, b2 );
		
	}
}
