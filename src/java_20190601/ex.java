package java_20190601;

public class ex {

	public static void main(String[] args) {
		
		
		int randomNum = 0;
		
		
		for(int i=0;i<10;i++){
			for(int z=0; z< 20;z++){
				randomNum=(int) (Math.random() * 45) + 1;
				System.out.print(randomNum+"\t"); // ������ �ο�
					
			}
			System.out.println("\n"+i+"��° i ���� �Ϸ� ��������="+randomNum);
				
		}
		System.out.println("�Ϸ� ��������="+randomNum);
		
	}
		
		
		
	
}
