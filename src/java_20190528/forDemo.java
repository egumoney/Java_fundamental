package java_20190528;

public class forDemo {
	public static void main(String[] args) {
		/*
		int sum=0;
		int evenSum=0;
		int oddSum=0;
		int i = 1;		
		for (; i <=1000 ; i++) {
			if(i%2==0) evenSum+=i;
			if(i%2==1) oddSum+=i;
			sum+=i;
			//if(i) sum+=i;
			
			//sum+=i;
		}
		System.out.println("1ºÎÅÍ "+(i-1)+"±îÁö Â¦¼öÃÑÇÕ:"+evenSum+" È¦¼öÃÑÇÕÀº"+oddSum+"ÃÑÇÕ"+sum+"\n\n");
		*/
		
		/*
		for(int j=2;j<10;j++){
			for(int k=1;k<10;k++){
				System.out.print(j+"*"+k+"="+j*k+"\t");
			}
			System.out.println("\n");
		}
		*/ 
		
		int primeCnt=0;
		
		for(int i=1;i<101;i++){
			int cnt =0;
			
			for(int k=1;k<=i;k++){
				if( i%k == 0){cnt++;}				
			}

			if(cnt==2){
				System.out.println(i+"ÀÌ¼ö´Â ¼Ò¼öÀÔ´Ï´Ù");
				primeCnt+=1;
			}
			
		}
		
	}
}
