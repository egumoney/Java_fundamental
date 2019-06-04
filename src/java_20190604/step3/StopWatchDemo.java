package java_20190604.step3;

public class StopWatchDemo {// 클래스 나눌 필요가 있어보인다 . 보통 분리하지않고 스텝 3에서 
	
	
	// 이전에서 Start'Nano'Time 이 있었는데 클래스 분할로 같은 변수명이 사용가능해짐.
	// 참조  스탑나노워치 스탑밀리워치
	//클래스 분리 변수명을 오버라이딩 할수 있게 만듬 
	//OOP 첫걸음 완료. 하지만  코드 중복이 아직 남아있다... 
	//
	
	public static void main(String[] args) {
		StopMilliWatch sm= new StopMilliWatch();
		sm.start();
		
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sm.stop();
		System.out.println("경과시간(밀리세컨드):"+sm.getElapsedTime());
		
		StopNanoWatch sn =new StopNanoWatch();
		sn.start();
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sn.stop();
		System.out.println("경과시간(나노세컨드):"+sn.getElapsedTime());
		
		
	}
}
