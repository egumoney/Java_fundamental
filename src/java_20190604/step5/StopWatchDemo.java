package java_20190604.step5;

public class StopWatchDemo {
	// 새로운 요구사항을 쉽게 붙일수 있도록 만든것. 
	// 고객 요구 사항이 늘면 스텝5일 경우 클래스를 추가하면 된다 .
	public static void execute(StopWatch sw){ //추상클래스의 폴리포페이션 매개변수가 갈림길 
		sw.start();
		for(int i=0;i<2_000_000_000l;i++){
		}
		sw.stop();
		System.out.println("경과시간):"+sw.getElapsedTime());		
	} 
	public static void main(String[] args) {
		StopMilliWatch sm= new StopMilliWatch();
		execute(sm);
		
		StopNanoWatch sn =new StopNanoWatch();
		execute(sn);	
		
		StopMicroWatch smc= new StopMicroWatch();
		execute(smc);		
	}
}
