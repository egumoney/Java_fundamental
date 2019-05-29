package java_20190528;

public class OperatorDemo {
	public static void main(String[] args){
	 	/*  달력만들기 
		*1. 1년 1월 1일 월요일
		*2. 윤년은 4년 마다  발생하고 
		* 그중에100년의 배수는 제외하고 그중  400명의 배수는제외하지 않는다. 
		*2019년 5월 28일의 요일을 구하라 
		
		*2018년 까지 총 일수를 구하고 1월 4월 까지 일수를 구하고 
		*28일을 더 하면 총 일수가 나옴 		
	 	*- 총일수7로 나눈 나머지 1일이면 월요일, 2이면 화요일,...
	 	*6이면 토요일 ,0이면 일요일 
	 	*
	 	 */
		int year=2019;
		int month=5;
		int date=28;
		
		int preYear=year-1;
		int preMonth=month-1;
		
		int totalCnt=0;
		
		//2018년도 일 수 구하기
		totalCnt =preYear*365 +(preYear/4-preYear/100 + preYear/400) ;
		System.out.println("\t 작년까지  총 일 수 구하기"+totalCnt);
		
		//2019년 1월 1일 부터 4월 30일 까지 일수 구하기 
		totalCnt +=  31+28+31+30; // if이나 for문이 없기 때문에 직접 집어넣음 정답을 얻기 위해선 마지막 달 만큼 직접 더해야한다. 
	
		// 윤년이 있을 경우 하루 추가 시켜야함. totalCnt++;
		
		totalCnt+=date;
		 
		
		System.out.println("\t 올해 일 수 더하기 "+totalCnt);
	
		int rest= totalCnt%7;
		
		System.out.println(rest+"\n 0:일요일 1:월요일 2:화요일 3:수요일 4:목요일 5:금요일 6:토요일   ");
			
		//365.25
		
	}
}
