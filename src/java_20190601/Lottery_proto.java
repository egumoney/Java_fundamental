package java_20190601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lottery_proto {

	public void inGame(int inNum) {
		int[][] ticket = new int[inNum][6];
		// 갯수 만큼 로또를 산다.
		// 랜던값을 넣는다 단 그전 값들과 중복이 되는지 체크
		// int[] ball= new int[45];

		int totalCnt = 0;
		// 첫 값입력은 받는다 두와일문 활용?
		// 현위치로 부터 거꾸로 입력값 확인 없다다음
		// 중복체크 값이 없다면 값 입력
		boolean isFlag = true; // 입력라인
		int randomNum = 0;
		int overlapCnt=0;
		
		for (int i = 0; i < ticket.length; i++) { // num 숫자 만큼 돌린다.
			
			for (int k = 0; k < ticket[i].length; k++) { // temp=randomNum;
				isFlag = true; // 플래그 초기화
			
				
				while (isFlag) {
					
					randomNum = (int) (Math.random() * 45) + 1;	 // 랜덤값 부여
					if (k == 0){
						ticket[i][k] = randomNum;
						break;
					}
					
					for (int now = 0; now <k; now++){// 중복체크
						if (ticket[i][k] == ticket[i][now]||randomNum == ticket[i][now]) {// 중복값 확인될 경우 스킵
							System.out.println("중복 발생"+randomNum);
							overlapCnt++;
							continue;// 처음부
						}
					} // for
					
					ticket[i][k] = randomNum; // 값입력
					break;
				} // end while - flag
				
				totalCnt++;
				System.out.println("총 카운터=" + totalCnt+"오버랩 카운터:"+overlapCnt);
			} // 실질적으로 로또 1게임 시작.
		
		
		} // 횟수만큼 돌린다. 2중포문이든 상관없다.
		print(ticket);
		/*
		 * for (int[] firstLoop : ea) { for (int secondLoop : firstLoop) {
		 * System.out.print(secondLoop + "\t"); } System.out.println(); }
		 */
	}
	public void print(int ticket[][]) {	// 출력라인
		for (int i = 0; i < ticket.length; i++) {
			for (int k = 0; k < ticket[i].length; k++) {
				System.out.print(ticket[i][k] + "\t");
			}
			System.out.println((i + 1) + "라인 끝");
		}
	}
	public static void main(String[] args) throws IOException {
		Lottery_proto lott = new Lottery_proto();
		while (true) {
			System.out.println("로또복권 갯수를 입력하세요>");
			String readLine = console();
			if (readLine.equals("bye"))
				break;
			int count = Integer.parseInt(readLine);
			lott.inGame(count);
		}
	}
	public static String console() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}


}
