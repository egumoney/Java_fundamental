package java_20190604.step4;

public class StopWatchDemo {
	//오보로딩을 하여 실행 execute 메소드를 만듬 하지만 소스 코드가 아직 겹친다
	//step5 에서 stopWatch  부모 -슈퍼-클래스 를 만들어 상속시켜 처리할 예정
	
	
	public static void execute(StopMilliWatch sm){
		sm.start();
		
		for(int i=0;i<2_000_000_000l;i++){
		}
		sm.stop();
		System.out.println("경과시간(밀리세컨드):"+sm.getElapsedTime());
		
		
	}
	public static void execute(StopNanoWatch sn){
		sn.start();
		for(int i=0;i<2_000_000_000l;i++){
		}
		sn.stop();
		System.out.println("경과시간(나노세컨드):"+sn.getElapsedTime());
		
	}
	public static void main(String[] args) {
		StopMilliWatch sm= new StopMilliWatch();
		execute(sm);
		
		StopNanoWatch sn =new StopNanoWatch();
		execute(sn);		
	}
}
