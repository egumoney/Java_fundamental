package java_20190601;

import java.util.Random;

public class Lottery {
 
	public void inGame(int inNum) {
		int[][] ticket = new int[inNum][6];

		// 갯수 만큼 로또를 산다.
		// 랜던값을 넣는다 단 그전 값들과 중복이 되는지 체크
		// int[] ball= new int[45];
		int totalCnt = 0;
		// 첫 값입력은 받는다 두와일문 활용?
		// 현위치로 부터 거꾸로 입력값 확인 없다다음
		// 중복체크 값이 없다면 값 입력
		boolean isFlag = true;	// 입력라인
		int randomNum = 0;
		
		for (int i = 0; i < ticket.length; i++) { // num 숫자 만큼 돌린다.
			for (int k = 0; k < ticket[i].length; k++) { // temp=randomNum;
				isFlag=true; // 플래그 초기화 
				while (isFlag) {
					randomNum = (int) (Math.random() * 45) + 1; // 랜덤값 부여
					 
					if(k==0)break;
					for (int now = 0; now <ticket[i].length ; now++) {// 중복체크
						if (  randomNum == ticket[i][now]){// 중복값 확인될 경우 스킵
							System.out.println("중복 발생");
							isFlag = false;// 와일루프 탈출
							break;// 처음부
						}
					}// if()//부합조건....	 
					
					ticket[i][k] = randomNum; // 값입력
				} //				
				totalCnt++;
				System.out.println("총 카운터=" + totalCnt);
			} // 실질적으로 로또 1게임 시작.

		} // 횟수만큼 돌린다. 2중포문이든 상관없다.
		print(ticket);
		/*
		 * for (int[] firstLoop : ea) { for (int secondLoop : firstLoop) {
		 * System.out.print(secondLoop + "\t"); } System.out.println(); }
		 */

	}
	public void print(int ticket[][]) {
		// 출력라인

		for (int i = 0; i < ticket.length; i++) {
			for (int k = 0; k < ticket[i].length; k++) {
				System.out.print(ticket[i][k] + "\t");
			}
			System.out.println((i + 1) + "라인 끝");
		}
	}
	// 출력 for(int []firstLoop:ea){ for(int secondLoop:firstLoop){
	// System.out.print(secondLoop+"\t"); }System.out.println("한줄 끗");

	/*강사님 당안 
	 
	public static void print(int count) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++){
			process();
		}
		
	}
	public static void process(){
		/*HashSet<Integer> set = new HashSet<Integer>();
		while(true){
			int random = (int)(Math.random()* 45) + 1;
			set.add(random);
			if(set.size()==6) break;
		}*/
		/*
		int[] temp = new int[6];
		for(int i=0; i<temp.length;i++){
			int random = (int)(Math.random()* 45) + 1;
			temp[i] = random;
			for (int k = 0; k < i; k++) {
				if (temp[k] == temp[i]) {
					random = (int)(Math.random()* 45) + 1;
					temp[i] = random;
					k = -1;
				}
			}
		}
		//bubbleSort(temp);
		for(int value : temp){
			System.out.print(value +"\t");
		}
		System.out.println();
	}
	private static void bubbleSort(int[] array) {
        int temp = 0;
        int size = array.length - 1;
        int count = size;
        int index=0;
        for (int i = 0; i < size; i++) {
        	index++;
            for (int j = 0; j < count ; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
 
                }
                index++;
            }
            count--;
        }   
        for(int value : array){
        	System.out.print(value +"\t");
        }
        System.out.println();
    }
	  */
}
