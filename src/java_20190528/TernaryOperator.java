package java_20190528;

public class TernaryOperator {
	public static void main(String[] args) {
		int temp=123;
		
		int share = temp%10==0 ? temp /10 : temp/10+1;
				
		// 위아 아래는 같다  위가 삼항연산자. 간략화 한것.
				
		if(temp%10==0){	share=temp/10;}else{share=temp/10+1;}
		 
		
	}	
}
