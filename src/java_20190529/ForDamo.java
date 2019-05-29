package java_20190529;

public class ForDamo {
	public static void main(String[] args) {
		int sum=0;//
		int i=0;
		/*
		for (i=1;i<=100;i++){
			if(i%2==1){
				sum+=i;
			}
		}
		*/
		
		int oddSum=0;
		int evenSum=0;
		
		while(i<=100){
			if(i%2==1){
				oddSum+=i;// oddSum=oddSum/i
			}else if(i%2==0){
				evenSum+=i;
			}
			sum+=i;	
			i++;
		}
		
		System.out.println("ÃÑÇÕÀº"+sum+"\t È¦¼öÃÑÇÕ:"+oddSum+"\t Â¦¼öÇÕ:"+evenSum);
	}
}
