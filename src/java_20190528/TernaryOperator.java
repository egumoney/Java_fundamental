package java_20190528;

public class TernaryOperator {
	public static void main(String[] args) {
		int temp=123;
		
		int share = temp%10==0 ? temp /10 : temp/10+1;
				
		// ���� �Ʒ��� ����  ���� ���׿�����. ����ȭ �Ѱ�.
				
		if(temp%10==0){	share=temp/10;}else{share=temp/10+1;}
		 
		
	}	
}
