package java_20190601;

import java.util.Random;

public class Lottery {
 
	public void inGame(int inNum) {
		int[][] ticket = new int[inNum][6];

		// ���� ��ŭ �ζǸ� ���.
		// �������� �ִ´� �� ���� ����� �ߺ��� �Ǵ��� üũ
		// int[] ball= new int[45];
		int totalCnt = 0;
		// ù ���Է��� �޴´� �ο��Ϲ� Ȱ��?
		// ����ġ�� ���� �Ųٷ� �Է°� Ȯ�� ���ٴ���
		// �ߺ�üũ ���� ���ٸ� �� �Է�
		boolean isFlag = true;	// �Է¶���
		int randomNum = 0;
		
		for (int i = 0; i < ticket.length; i++) { // num ���� ��ŭ ������.
			for (int k = 0; k < ticket[i].length; k++) { // temp=randomNum;
				isFlag=true; // �÷��� �ʱ�ȭ 
				while (isFlag) {
					randomNum = (int) (Math.random() * 45) + 1; // ������ �ο�
					 
					if(k==0)break;
					for (int now = 0; now <ticket[i].length ; now++) {// �ߺ�üũ
						if (  randomNum == ticket[i][now]){// �ߺ��� Ȯ�ε� ��� ��ŵ
							System.out.println("�ߺ� �߻�");
							isFlag = false;// ���Ϸ��� Ż��
							break;// ó����
						}
					}// if()//��������....	 
					
					ticket[i][k] = randomNum; // ���Է�
				} //				
				totalCnt++;
				System.out.println("�� ī����=" + totalCnt);
			} // ���������� �ζ� 1���� ����.

		} // Ƚ����ŭ ������. 2�������̵� �������.
		print(ticket);
		/*
		 * for (int[] firstLoop : ea) { for (int secondLoop : firstLoop) {
		 * System.out.print(secondLoop + "\t"); } System.out.println(); }
		 */

	}
	public void print(int ticket[][]) {
		// ��¶���

		for (int i = 0; i < ticket.length; i++) {
			for (int k = 0; k < ticket[i].length; k++) {
				System.out.print(ticket[i][k] + "\t");
			}
			System.out.println((i + 1) + "���� ��");
		}
	}
	// ��� for(int []firstLoop:ea){ for(int secondLoop:firstLoop){
	// System.out.print(secondLoop+"\t"); }System.out.println("���� ��");

	/*����� ��� 
	 
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
