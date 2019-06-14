package java_20190605;

public class PrimeNum_nd {

	/*
	 * public static int primeCheck(int checkNum,int [] prime){ int
	 * result=checkNum; if (prime[checkNum] != checkNum && prime[checkNum] %
	 * checkNum == 0) { result= 0; } return result; }
	 */

	public static void main(String[] args) {
		/*
		 * 찾아내고 싶은 범위만큼 자연수를 죽 늘어놓는다. 1은 수학적으로 소수도, 합성수도 아닌 유일한 자연수이므로 먼저 1을
		 * 지운다. 먼저 2를 소수로 표시하고 2를 제외한 2의 배수(4, 6, 8, ...)를 모두[9] 소거한다. 그 다음 3을
		 * 소수로 표시하고 남아있는 수 중 3을 제외한 3의 배수(9, 15, 21, ...)도 모두[10] 소거한다. 그 다음 5를
		 * 소수로 표시하고 남아있는 수 중 5를 제외한 5의 배수(25, 35, 55, ...)도 모두[11] 소거한다. 그 다음 7을
		 * 소수로 표시하고 남아있는 수 중 7을 제외한 7의 배수(49, 77, 91, ...)도 모두[12] 소거한다. 남아있는 가장
		 * 작은 수(소수)에 대해 이 과정을 \sqrt n √n 보다 작거나 같은 소수까지 계속 반복한다.
		 */
		int[] prime = new int[100];

		for (int i = 0; i < 100; i++) {
			prime[i] = i + 1;
			if(i%9==0){
				System.out.println();
			}
			System.out.print(prime[i] + "\t");

		}
		
		

		System.out.println("\n");

		// output
		int cnt = 0;
		for (int i : prime) { 
			prime[i] = cnt + 1;
			if (cnt % 9 == 0) System.out.println("\n"+i+"번째");
			if (cnt == 0) prime[i] = 0;
			
			// prime[i]= primeCheck(i,prime);
			if (prime[i] != 2 && prime[i] % 2 == 0)	prime[i] = 0;
			if (prime[i] != 3 && prime[i] % 3 == 0) prime[i] = 0;
			if (prime[i] != 5 && prime[i] % 5 == 0) prime[i] = 0;
			if (prime[i] != 7 && prime[i] % 7 == 0) prime[i] = 0;
			if (prime[i] != 9 && prime[i] % 9 == 0) prime[i] = 0;
			 

			System.out.print(prime[i] + "\t");
			//if (cnt % 9 == 0)System.out.println(); //이경우 1 자리는 바로 개행 한다 . 
			cnt++;
		}

		/*
		 * for (int i = 1; i < 100; i++) { System.out.print(i); if(i==1)
		 * continue; if(i%9==0) System.out.println(); }
		 */

	}
}
