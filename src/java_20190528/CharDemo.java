package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//문자 표현법
		char a ='q';
		
		//유니코드 표현법 '/uXXXX'
		char b ='\uBC15';  
		char c ='\uC720'; 
		char d ='\uCC2C'; 
		 
		char z=32;
		 
		
		
		System.out.print(b+" "+ c +" " +d+" ");
		System.out.print(b);System.out.print(c);System.out.print(d);
 
		System.out.println("아스키"+z+"코드");
		
		//아스키 코드 표현법
		char e= 97;
		
		System.out.println(e); 
	
		
		System.out.println("박유찬\t만세");
		System.out.println("박유찬\n만세");
	
		//문자열 중에서 " 그리고  \ 문자로 인식하지못함 
		//인식하게하려면 " 그리고 \ 앞에 \를 붙임  
		
		System.out.println("C:\\Users\\Public\\Videos\\Sample Videos");
		System.out.println("박유찬 만세 \"만세  \" ");
		System.out.println("박유찬 만세 '만세'  ");
		 
		char f='"';
		char g='\'';
		char h='\\';
		
		// \ ' 백슬러쉬 밑 싱글쿼테이션 두개의 문자는 char 에서 인식을 못하기 때문에
		// 두문자ㅏ 앞에 \를 붙여주어 문자를 인식하게 해야한다 
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
	}
}
