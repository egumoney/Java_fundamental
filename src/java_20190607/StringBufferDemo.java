package java_20190607;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		
		s1.append("select name, age");
		s1.append("from member ");
		s1.append("where name = '������'");
		s1.append("order by name desc");
		
		s2.append("select name, age");
		s2.append("from member ");
		s2.append("where name = '������'");
		s2.append("order by name desc");
		
		
		System.out.println(s1==s2);
		//StringBuffer�� equlas() �޼���� Obejct Ŭ������ equals() �޼��� 
		
		System.out.println(s1.equals(s2));
		System.out.println("s1������.(s2)= "+s1.equals(s2));
				
		
		String s3= s1.toString();//	String s3= s1; ��Ʈ�����۶� ��Ʈ�� �� ��Ӱ������ �ٸ� Ÿ���̴�. �׷��� ������ ���. 
		String s4=s2.toString();//��Ʈ�����ۿ�.toString�� �����ؾ� �Ѵ�. 
		
		System.out.println("s3������.(s4)= "+s3.equals(s4));
		
		//s1�� ���� �������� 
		s1.setLength(0);
		
		s1.append("select no, writer form board");
		
		//System.out.println(s1);
		System.out.println(s1.toString());
				
		
	
		
		
		
		
	}

}