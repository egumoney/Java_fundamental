package java_20190610;

import java_20190601.ex;

public class ThrowsDemo {
	
	
	public static double average(int[] score) throws Exception {
		// TODO Auto-generated method stub
		int korean= score[0];
		int math= score[1];
		int english= score[2];
		int history= score[3];
		int sum=korean+math+english+history;
		return (double)sum/(double)4;
	}
	
	public static void main(String[] args) throws Exception {
		int[] exam = {10,20,30};
		try {
			double avg= average(exam);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(  "입력 값을 정확히 넣어주세요\n 입력 값 갯수:"+exam.length);
			
		}
		
	}

	
}
