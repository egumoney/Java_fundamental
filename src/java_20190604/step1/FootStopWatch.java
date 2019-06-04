package java_20190604.step1;

//1.요구사항은 밀리 세컨드로 경과시간을 만들어 주세요.

public class FootStopWatch {
	public long startTime;
	
	public long endTime;
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000 ;
	}
	
	public static void main(String[] args) {
		FootStopWatch f= new FootStopWatch();
		f.startTime=System.currentTimeMillis();//1970 1 1 기준을  잡고 시작한다.  
		
		for(int i=0;i<2_000_000_000;i++){ 
			System.out.println(i);
		}
		f.endTime=System.currentTimeMillis();// 1970 1월 1일 기준을 
		double elapsedTime =f.getElapsedTime();
		System.out.println("경과된 시간(m/s )" +elapsedTime);
	}
	
	
}
