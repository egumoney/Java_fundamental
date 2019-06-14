package java_20190607;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		
		s1.append("select name, age");
		s1.append("from member ");
		s1.append("where name = '박유찬'");
		s1.append("order by name desc");
		
		s2.append("select name, age");
		s2.append("from member ");
		s2.append("where name = '박유찬'");
		s2.append("order by name desc");
		
		
		System.out.println(s1==s2);
		//StringBuffer의 equlas() 메서드는 Obejct 클래스의 equals() 메서드 
		
		System.out.println(s1.equals(s2));
		System.out.println("s1이퀄즈.(s2)= "+s1.equals(s2));
				
		
		String s3= s1.toString();//	String s3= s1; 스트링버퍼랑 스트링 은 상속관계없는 다른 타입이다. 그래서 에러가 뜬다. 
		String s4=s2.toString();//스트링버퍼에.toString을 대입해야 한다. 
		
		System.out.println("s3이퀄즈.(s4)= "+s3.equals(s4));
		
		//s1의 값을 모두지우기 
		s1.setLength(0);
		
		s1.append("select no, writer form board");
		
		//System.out.println(s1);
		System.out.println(s1.toString());
				
		
	
		
		
		
		
	}

}