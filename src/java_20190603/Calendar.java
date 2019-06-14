package java_20190603;

import java.time.Year;

public class Calendar {
	public static final int SUNDAY=0;
	public static final int MONDAY=1;
	public static final int TUESDAY=2;
	public static final int WEDNESDAY=3;
	public static final int THURSDAY=4;
	public static final int FRIDAY=5;
	public static final int SATURDAY=6;
	
	public void print(int year){
		for(int i=1;i<=12;i++){
			print(year,i);
		}
	}
	
	public void print(int year, int month){
		System.out.println(year+"��"+month+"�� �޷��Դϴ�.");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		//���۳�¥
		int start =1;
		//������ ��¥
		int end= getLastDay(year,month);
		//2019�� 5�� 1���� ������ ���� 
		int dayOfWeek=getCount(year,month,1)%7;
		
		
		//���ϼ� ��ŭ �� ó�� 
		//�������̸� 1, ȭ�����̸�2 ~~~~ ������̸� 6 �Ͽ����̸� 0
		
		//���ϼ� ��ŭ �� ó��
		for(int i=0;i<dayOfWeek;i++){
			System.out.print("\t");
		}
		
		
		for(int i=start;i<=end;i++){
			System.out.print(i+"\t");
			dayOfWeek++;
			if(dayOfWeek%7==0) System.out.println();
		}
		
		System.out.println();
	} 
	
	
	public void print(int year, int month,int day){
		
		int totalCnt=getCount(year,month,day);
		int rest= totalCnt %7;
		String dayOfWeek="";		
		switch(rest){
			case Calendar.MONDAY:dayOfWeek="������";break; case Calendar.TUESDAY:dayOfWeek="ȭ����";break;
			case Calendar.WEDNESDAY:dayOfWeek="������";break; case Calendar.THURSDAY:dayOfWeek="�����";break;
			case Calendar.FRIDAY:dayOfWeek="�ݿ���";break; case Calendar.SATURDAY:dayOfWeek="�����";break;
			case Calendar.SUNDAY:dayOfWeek="�Ͽ���";break;
		}		
		System.out.println(year+"�� "+month+"�� "+day+"�� "+dayOfWeek+" �Դϴ�");
	}
	//�������� �ƴ����� �Ǵ��ϴ� �޼��� �Ű������� �����̸� true, �ƴϸ� false 
	
	public boolean isLeafYear(int year){
		boolean isLeafYear =false;
		if((year%4==0 && year%100!=0|| year%400==0)){
			isLeafYear=true;
		}
		return isLeafYear;
		
	}
	
	
	//1�� 1�� 1�� ����~ ��, �� , ���� �ʾ˼��� ���ϴ� �޼��� 
	
	public int getCount(int year, int month,int day){
		//�Ѿ˼� ���ҋ��� �⵵�� �����⵵ ���� �ϼ��� ���ؾ��ϱ� ������ preYear ������ ���� 
		
		int preYear=year-1;
		//�ش�⵵�� �������� �����ϱ� ���� ���� 
		int preMonth=month-1;
		
		int totalCnt=0; 
		//2018�⵵ �� �� ���ϱ� 
		totalCnt = preYear *365 +
				(preYear/4-preYear/100 + preYear/400); // ���� �⵵ ��
		int [] monthArray={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31}; 
		
		for (int i = 0; i < preMonth; i++) {
			totalCnt+=monthArray[i]; //!!!!!!!!!!!!!!!����.   �� ��Ʈ���� Ȱ���غ���
		}
		
		//�ش� �⵵�� �������� �Ǵ��ϰ� ������ ��� 3�� �̻��̸� 1�� �߰����ش� 400��� 
		if(month >=3 && isLeafYear(year)){
			totalCnt++;
		}
		totalCnt +=day;
		
		return totalCnt;
	}
	
	//�⵵�� �ſ� ��������¥�����ϴ� �޼���
	
	public int getLastDay(int year, int month){

		int [] monthArray={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		if(isLeafYear(year)){// �����̸� 2���� 29�Ϸ� �ٲ�� �Ѵ�. 
			monthArray[1]=29;
		}
		
		return monthArray[month-1];
	}
	
	
}
