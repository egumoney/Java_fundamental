package java_20190528;

public class PrimeCnt {
	public static void main(String[] args) {
/*	
		int sdCount =0;
		int cnt =0;

		for(int a=2;a<=100;a++){
			int count = 0; 
			for(int k=2;k<a;k++){
				cnt++;
				if(a%k==0){
					count +=1;
					break ;
				}
			}
			if(count==0){
				System.out.println(a+"�� �Ҽ� �Դϴ�.");
				sdCount += 1;
			}
		}
		 
		System.out.println("cnt : "+cnt+" �Ҽ��� ������ : "+sdCount);
		*/

		for(int z=2;z<100;z++){
			for(int i=2;i<z;i++){
				if(z%i==0){ 
					System.out.print("��Ҽ�:"+z+"\t");
					break;
				}
			}
			if(z%5==0) System.out.println();
		}
				
		
	}
}
