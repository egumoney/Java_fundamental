package java_20190604.step5;

public class StopWatchDemo {
	// ���ο� �䱸������ ���� ���ϼ� �ֵ��� �����. 
	// �� �䱸 ������ �ø� ����5�� ��� Ŭ������ �߰��ϸ� �ȴ� .
	public static void execute(StopWatch sw){ //�߻�Ŭ������ ���������̼� �Ű������� ������ 
		sw.start();
		for(int i=0;i<2_000_000_000l;i++){
		}
		sw.stop();
		System.out.println("����ð�):"+sw.getElapsedTime());		
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
