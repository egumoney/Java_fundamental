package java_20190605;

public class PrimeNum_nd {

	/*
	 * public static int primeCheck(int checkNum,int [] prime){ int
	 * result=checkNum; if (prime[checkNum] != checkNum && prime[checkNum] %
	 * checkNum == 0) { result= 0; } return result; }
	 */

	public static void main(String[] args) {
		/*
		 * ã�Ƴ��� ���� ������ŭ �ڿ����� �� �þ���´�. 1�� ���������� �Ҽ���, �ռ����� �ƴ� ������ �ڿ����̹Ƿ� ���� 1��
		 * �����. ���� 2�� �Ҽ��� ǥ���ϰ� 2�� ������ 2�� ���(4, 6, 8, ...)�� ���[9] �Ұ��Ѵ�. �� ���� 3��
		 * �Ҽ��� ǥ���ϰ� �����ִ� �� �� 3�� ������ 3�� ���(9, 15, 21, ...)�� ���[10] �Ұ��Ѵ�. �� ���� 5��
		 * �Ҽ��� ǥ���ϰ� �����ִ� �� �� 5�� ������ 5�� ���(25, 35, 55, ...)�� ���[11] �Ұ��Ѵ�. �� ���� 7��
		 * �Ҽ��� ǥ���ϰ� �����ִ� �� �� 7�� ������ 7�� ���(49, 77, 91, ...)�� ���[12] �Ұ��Ѵ�. �����ִ� ����
		 * ���� ��(�Ҽ�)�� ���� �� ������ \sqrt n ��n ���� �۰ų� ���� �Ҽ����� ��� �ݺ��Ѵ�.
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
			if (cnt % 9 == 0) System.out.println("\n"+i+"��°");
			if (cnt == 0) prime[i] = 0;
			
			// prime[i]= primeCheck(i,prime);
			if (prime[i] != 2 && prime[i] % 2 == 0)	prime[i] = 0;
			if (prime[i] != 3 && prime[i] % 3 == 0) prime[i] = 0;
			if (prime[i] != 5 && prime[i] % 5 == 0) prime[i] = 0;
			if (prime[i] != 7 && prime[i] % 7 == 0) prime[i] = 0;
			if (prime[i] != 9 && prime[i] % 9 == 0) prime[i] = 0;
			 

			System.out.print(prime[i] + "\t");
			//if (cnt % 9 == 0)System.out.println(); //�̰�� 1 �ڸ��� �ٷ� ���� �Ѵ� . 
			cnt++;
		}

		/*
		 * for (int i = 1; i < 100; i++) { System.out.print(i); if(i==1)
		 * continue; if(i%9==0) System.out.println(); }
		 */

	}
}
