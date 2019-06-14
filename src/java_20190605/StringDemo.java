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
		// charAt(int index) 메서드는 문자열 중에서 특정 index에 있는 문자를 반환한다.
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat (String msg) 메서드는 문자열 연결
		String temp = ssn.concat("안녕하세요");
		System.out.println(temp);

		// endsWith(String temp)
		String fileName = "test.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다");
		} else if (fileName.endsWith("doc")) {
			System.out.println("office 문서입니다");
		} else {
			System.out.println("파일입니다. ");
		}

		// startsWith (String map)메서드는 문자열의 시작이 ()안의 temp와 같으면 true, 다르면 false
		String url = "https://www.naver.com/sports";
		String urlWord = "Sports";

		if (url.startsWith(urlWord)) {
			System.out.println("스포츠 메뉴입니다.");
		} else if (url.startsWith("news")) {
			System.out.println("뉴스 메뉴입니다.");
		} else {
			System.out.println("errcode:404 존재하지 않는 페이지 입니다.");
		}

		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2)); //대소문자 무시

		s2 = s2.toLowerCase(); 
		System.out.println(s2); 
		
		String phoneNum="010-2376-8226";
		s1 = s1.toUpperCase();		
		System.out.println(s1);
		System.out.println(ssn.indexOf("-"));
		
		ssn=ssn.replace("-", "*");
		System.err.println(ssn);
		System.out.println(phoneNum.lastIndexOf("-"));//끝에서 부터 찾은 다음에 앞에서부터 문자갯수를 샌다.
		//lastIndexOf 파일이름 확장자를 바꾸기 위해서 쓰인다. 
			
		String html="안녕하세요\n저는 박유찬입니다.\n앞으로 잘부탁드립니다";
		html=html.replaceAll("\n","<br>");
		System.out.println(html);

		fileName="abc.def.ghi.zip";
		
		String ssn1=ssn.substring(0,ssn.indexOf("*"));//6 직전까지만 가져온다
		String ssn2=ssn.substring(ssn.indexOf("*")+1);// 7부터 끝까지 
		
		System.out.println(ssn1);
		System.out.println(ssn2);
/*
		String str= String.format("%1$, 20.2f%2$,20.2f%3$,20.2f", 111111);
		System.out.println(str);
*/		

		String fileName1=fileName.substring(0,fileName.lastIndexOf("."));//6 직전까지만 가져온다
		String fileName2=fileName.substring(fileName.lastIndexOf(".")+1);// 7부터 끝까지 
		
		System.out.println(fileName1);
		System.out.println(fileName2);		
		
		String exString1="Hello";
		String exString2="Hello "; //띄워쓰기-공백- 이 들어가 있다.
		
		System.out.println(exString1);
		System.out.println(exString2);
		
		if(exString1.equalsIgnoreCase(exString2.trim())){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
		ssn="234567-8923456";
		System.out.println("하이픈 재출력="+ssn);
		String[] t3= ssn.split("-");
		System.err.println(t3[0]);
		System.out.println(t3[1]);
		
		int a =10;
		//String t1= String.valueOf(10);
		String t1= String.valueOf(a); //벨류 오프는 오버로딩 다되어 있다. 
		String t2= ""+a;
		
		System.out.println(t1);
		System.out.println(t2);
		
//		String t4=String.format("%,d", 10000);
		String t4=String.format("%,.2f and %,d", 10000.235545, 200000000);//java 5.0 에서 박싱이나 포맷등  업데이트되었다.
		System.out.println(t4);	
		
//		String str= String.format("%1$f ,  %2$f,  %3$f",1111.11,2222.22,3333.33); // 1만 출력하고 싶을떄 1만가져온다. 생략하면 알아서 가져온다.
//		"%1$,f  ,  %3$,f  ,  %2$,f "   //  
//	 	"%,20f ,  %,20f,  %,20f"  // 20 이 자릿수다 중간에 , 는 구분자로 3자리 마다 
		//flag   %,f  자릿수에 채워준다.
	 	//%n$ 는 n 번째의 녀석을 출력해준다.
		String str= String.format("%3$,20.2f ,  %2$,20.2f,  %1$,20.2f",1111.11,2222.22,3333.33); // 20 이 자릿수다 중간에 , 는 구분자로 3자리 마다 
		// % , . 2f  //보통 이정도만 쓴다.
		System.out.println(str);
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1의 값은 %d 이고요, b2의 값은 %d 입니다.", b1, b2 );
		
	}
}
