package java_20190528;

public class OperatorDemo {
	public static void main(String[] args){
	 	/*  �޷¸���� 
		*1. 1�� 1�� 1�� ������
		*2. ������ 4�� ����  �߻��ϰ� 
		* ���߿�100���� ����� �����ϰ� ����  400���� ������������� �ʴ´�. 
		*2019�� 5�� 28���� ������ ���϶� 
		
		*2018�� ���� �� �ϼ��� ���ϰ� 1�� 4�� ���� �ϼ��� ���ϰ� 
		*28���� �� �ϸ� �� �ϼ��� ���� 		
	 	*- ���ϼ�7�� ���� ������ 1���̸� ������, 2�̸� ȭ����,...
	 	*6�̸� ����� ,0�̸� �Ͽ��� 
	 	*
	 	 */
		int year=2019;
		int month=5;
		int date=28;
		
		int preYear=year-1;
		int preMonth=month-1;
		
		int totalCnt=0;
		
		//2018�⵵ �� �� ���ϱ�
		totalCnt =preYear*365 +(preYear/4-preYear/100 + preYear/400) ;
		System.out.println("\t �۳����  �� �� �� ���ϱ�"+totalCnt);
		
		//2019�� 1�� 1�� ���� 4�� 30�� ���� �ϼ� ���ϱ� 
		totalCnt +=  31+28+31+30; // if�̳� for���� ���� ������ ���� ������� ������ ��� ���ؼ� ������ �� ��ŭ ���� ���ؾ��Ѵ�. 
	
		// ������ ���� ��� �Ϸ� �߰� ���Ѿ���. totalCnt++;
		
		totalCnt+=date;
		 
		
		System.out.println("\t ���� �� �� ���ϱ� "+totalCnt);
	
		int rest= totalCnt%7;
		
		System.out.println(rest+"\n 0:�Ͽ��� 1:������ 2:ȭ���� 3:������ 4:����� 5:�ݿ��� 6:�����   ");
			
		//365.25
		
	}
}
