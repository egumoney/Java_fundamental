package java_20190601;

public class ex {

	public static void main(String[] args) {
		
		
		int randomNum = 0;
		
		
		for(int i=0;i<10;i++){
			for(int z=0; z< 20;z++){
				randomNum=(int) (Math.random() * 45) + 1;
				System.out.print(randomNum+"\t"); // 랜덤값 부여
					
			}
			System.out.println("\n"+i+"번째 i 루프 완료 마지막값="+randomNum);
				
		}
		System.out.println("완료 마지막값="+randomNum);
		
	}
		
		
		
	
}
