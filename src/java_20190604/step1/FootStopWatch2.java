package java_20190604.step1;

//1.요구사항은 밀리 세컨드로 경과시간을 만들어 주세요.

public class FootStopWatch2 {
	public long startTime;	
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	public double getElapsedTime(){
		return (double)(endTime-startTime)/(double)1000 ;
	}
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1_000_000_000 ;
	}
	
	
	public static void main(String[] args) {
		FootStopWatch2 f= new FootStopWatch2();
		f.startNanoTime=System.currentTimeMillis();//1970 1 1 기준을  잡고 시작한다.  
		
		for(int i=0;i<2_000_000_000;i++){ 
		}
		f.endNanoTime=System.currentTimeMillis();// 1970 1월 1일 기준을 
		double elapsedTime =f.getElapsedNanoTime();
		System.out.println("경과된 시간(나노 세컨드)" +elapsedTime);
	}
	
	
}
