package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//���� ǥ����
		char a ='q';
		
		//�����ڵ� ǥ���� '/uXXXX'
		char b ='\uBC15';  
		char c ='\uC720'; 
		char d ='\uCC2C'; 
		 
		char z=32;
		 
		
		
		System.out.print(b+" "+ c +" " +d+" ");
		System.out.print(b);System.out.print(c);System.out.print(d);
 
		System.out.println("�ƽ�Ű"+z+"�ڵ�");
		
		//�ƽ�Ű �ڵ� ǥ����
		char e= 97;
		
		System.out.println(e); 
	
		
		System.out.println("������\t����");
		System.out.println("������\n����");
	
		//���ڿ� �߿��� " �׸���  \ ���ڷ� �ν��������� 
		//�ν��ϰ��Ϸ��� " �׸��� \ �տ� \�� ����  
		
		System.out.println("C:\\Users\\Public\\Videos\\Sample Videos");
		System.out.println("������ ���� \"����  \" ");
		System.out.println("������ ���� '����'  ");
		 
		char f='"';
		char g='\'';
		char h='\\';
		
		// \ ' �齽���� �� �̱������̼� �ΰ��� ���ڴ� char ���� �ν��� ���ϱ� ������
		// �ι��ڤ� �տ� \�� �ٿ��־� ���ڸ� �ν��ϰ� �ؾ��Ѵ� 
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
	}
}
