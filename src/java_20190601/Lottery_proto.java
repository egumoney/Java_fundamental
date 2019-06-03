package java_20190601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lottery_proto {

	public void inGame(int inNum) {
		int[][] ticket = new int[inNum][6];
		// ���� ��ŭ �ζǸ� ���.
		// �������� �ִ´� �� ���� ����� �ߺ��� �Ǵ��� üũ
		// int[] ball= new int[45];

		int totalCnt = 0;
		// ù ���Է��� �޴´� �ο��Ϲ� Ȱ��?
		// ����ġ�� ���� �Ųٷ� �Է°� Ȯ�� ���ٴ���
		// �ߺ�üũ ���� ���ٸ� �� �Է�

		boolean isFlag = true; // �Է¶���
		int randomNum = 0;

		for (int i = 0; i < ticket.length; i++) { // num ���� ��ŭ ������.
			for (int k = 0; k < ticket[i].length; k++) { // temp=randomNum;
				isFlag = true; // �÷��� �ʱ�ȭ
				while (isFlag) {
					randomNum = (int) (Math.random() * 45) + 1; // ������ �ο�

					if (k == 0)	{
						ticket[i][k] = randomNum;
						break;
					}
					
					for (int now = 0; now < ticket[i].length; now++) {// �ߺ�üũ
						if (randomNum == ticket[i][now]) {// �ߺ��� Ȯ�ε� ��� ��ŵ
							System.out.println("�ߺ� �߻�");
							isFlag = false;// ���Ϸ��� Ż��
							break;// ó����
						}
					} // if()//��������....

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

	public static void main(String[] args) throws IOException {

		Lottery_proto lott = new Lottery_proto();
		while (true) {
			System.out.println("�ζǺ��� ������ �Է��ϼ���>");
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
